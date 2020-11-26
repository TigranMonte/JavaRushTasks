package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int min = 256;
        int a;
        while(inputStream.available() > 0){
            a = inputStream.read();
            min = Math.min(min, a);
        }
        System.out.println(min);
        inputStream.close();
    }
}


