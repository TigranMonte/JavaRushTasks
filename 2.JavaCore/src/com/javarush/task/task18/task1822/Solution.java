package com.javarush.task.task18.task1822;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file  = reader.readLine();
        FileInputStream fis = new FileInputStream(file);
        reader = new BufferedReader(new InputStreamReader(fis));
        while (reader.ready()) {
            String s = reader.readLine();
            if (s.startsWith(args[0] + " ")) {
                System.out.println(s);
                break;
            }
        }
        reader.close();
        fis.close();

    }
}
