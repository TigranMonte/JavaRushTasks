package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize = 0;
    private int maxSize = 0;
    private List <Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }
    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }
    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String contentStr = new String(Files.readAllBytes(file)); // содержимое текущего файла
        // в виде строки
        boolean filter1 = true;

        boolean filter2 = true;
        if (partOfName != null && !file.getFileName().toString().contains(partOfName) ||
                partOfContent != null && !contentStr.contains(partOfContent))
            filter1 = false;

        if (Integer.valueOf(minSize) != 0 && !(content.length > minSize) ||
                Integer.valueOf(maxSize) != 0 && !(content.length < maxSize))
            filter2 = false;

        if(filter1 && filter2)
            getFoundFiles().add(file);

        return super.visitFile(file, attrs);
    }
}
