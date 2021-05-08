package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL (urlString);
        Path ps = Paths.get(urlString);
        Path temp = Files.createTempFile("temp", ".temp");
        Files.copy(url.openStream(), temp, StandardCopyOption.REPLACE_EXISTING);

        Path result;
        if (!Files.exists(downloadDirectory)){
            Files.createDirectory(downloadDirectory);
        }
        result = Paths.get(downloadDirectory.toAbsolutePath().toString() + "/" + ps.getFileName());
        return Files.move(temp, result, StandardCopyOption.REPLACE_EXISTING);

    }
}
