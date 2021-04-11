package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        FileReader reader1 = new FileReader(s1);
        FileWriter writer = new FileWriter(s2);
        while (reader1.ready()){
            int number = reader1.read();
            list.add(number);
        }
        for (int i = 0; i < list.size(); i++){
            if ((i + 1) % 2 == 0) {
                writer.write(list.get(i));
            }
        }
        reader1.close();
        writer.close();
    }
}
