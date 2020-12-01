package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int countSpace = 0;
        int countChar = 0;

        while (fileInputStream.available()>0){
            countChar++;
            if (fileInputStream.read() == ' '){
                countSpace++;
            }
        }
        fileInputStream.close();

        float result = (float) countSpace/countChar * 100;
        System.out.println(String.format("%.2f", result));
    }
}
