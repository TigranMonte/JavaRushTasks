package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        if (fis.available()>0){
            byte [] data = new byte[fis.available()];
            fis.read(data);

            String[] str = new String(data).split(" ");
            StringBuilder result = new StringBuilder(data.length);

            for (String strDouble : str){
                result.append(Math.round(Double.valueOf(strDouble)));
                result.append(" ");
            }
            fos.write(result.toString().getBytes());
        }
        fis.close();
        fos.close();
    }
}
