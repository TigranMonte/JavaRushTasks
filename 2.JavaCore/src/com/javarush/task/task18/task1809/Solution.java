package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        ArrayList <Integer> list = new ArrayList<>();
        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size();i++){
            outputStream.write(list.get(i));
        }
        inputStream.close();
        outputStream.close();
    }
}
