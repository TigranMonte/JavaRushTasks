package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        reader.close();

        FileOutputStream fos = new FileOutputStream(file1, true);
        FileInputStream fis1 = new FileInputStream(file2);
        FileInputStream fis2 = new FileInputStream(file3);

        byte [] buffer1 = new byte[fis1.available()];
        byte [] buffer2 = new byte[fis2.available()];

        int count1 = fis1.read(buffer1);
        int count2 = fis2.read(buffer2);

        try {
            fos.write(buffer1, 0, count1);
            fos.write(buffer2, 0, count2);
        } finally {
            fos.close();
            fis1.close();
            fis2.close();
        }
    }
}
