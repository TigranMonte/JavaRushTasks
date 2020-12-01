package com.javarush.task.task18.task1827;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = new Scanner(System.in).nextLine();
        AtomicInteger maxId = new AtomicInteger(0);
        Files.lines(Paths.get(fileName))
                .filter(value -> !value.isEmpty())
                .map(s -> s.substring(0, 8).trim())
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(maxId::set);
        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        if (args.length != 0 && "-c".equals(args[0])) {
            outputStream.write(String.format("\n%-8s%-30s%-8s%-4s", maxId.incrementAndGet(), args[1], args[2], args[3]).getBytes());
        }
        new FileInputStream(fileName).close();
        outputStream.close();
    }
}

