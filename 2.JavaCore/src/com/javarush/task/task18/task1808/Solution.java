package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        byte [] buffer = new byte[100000000];
        while (inputStream1.available()>0){
            int count = inputStream1.read(buffer);
            if (count % 2 == 0){
                outputStream2.write(buffer, 0, count/2);
                outputStream3.write(buffer, (count/2), (count/2));
            }
            else {
                outputStream2.write(buffer,0,(count/2) + 1);
                outputStream3.write(buffer, (count/2) + 1, (count/2));
            }

        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
