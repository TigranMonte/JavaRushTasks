package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + "  + name3 + " = Чистая любовь, да-да!");
    }
}