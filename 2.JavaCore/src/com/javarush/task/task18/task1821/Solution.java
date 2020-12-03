package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, Integer> charMap = new TreeMap<>();
        String fileName = args[0];
        FileReader reader = new FileReader(fileName);

        int a = 0;
        while ((a = reader.read())> -1){
            if (charMap.containsKey(a)) {
                charMap.put(a, charMap.get(a) + 1);
            } else {
                charMap.put(a, 1);
            }
        }
        reader.close();
        for (int num : charMap.keySet()){
            System.out.println((char) num + " " + charMap.get(num));
        }
    }
}
