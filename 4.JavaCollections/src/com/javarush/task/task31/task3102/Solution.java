package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File file = new File(root);
        List<String> list = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        queue.add(file);
        while(queue.peek()!=null){
            File directory = queue.remove();
            for(File f: directory.listFiles()){
                if(f.isDirectory())queue.add(f);
                else {
                    list.add(f.getAbsolutePath());
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}