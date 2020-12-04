package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = "";
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                file1 = reader.readLine();
                FileInputStream fis = new FileInputStream(file1);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(file1);
                return;
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}