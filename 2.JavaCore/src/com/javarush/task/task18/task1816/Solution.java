package com.javarush.task.task18.task1816;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(args[0]));
        byte[] buffer = new byte[stream.available()];
        if (stream.available() > 0) {
            stream.read(buffer);
        }
        stream.close();
        int engByteCounter = 0;
        for (byte b : buffer) {
            for (int i = 65; i <= 90; i++) {
                if (b == i) {
                    engByteCounter++;
                }
            }
            for (int i = 97; i <= 122; i++) {
                if (b == i) {
                    engByteCounter++;
                }
            }
        }
        System.out.println(engByteCounter);
    }
}
