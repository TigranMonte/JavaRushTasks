package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        int i;
        switch (args[0]){
            case "-e": {
                while ((i = bufferedInputStream.read())>0){
                    int encodedSymbol = i + 1;
                    fileOutputStream.write(encodedSymbol);
                }
                break;
            }
            case "-d": {
                while ((i = bufferedInputStream.read())>0){
                    int encodedSymbol = i - 1;
                    fileOutputStream.write(encodedSymbol);
                }
                break;
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
