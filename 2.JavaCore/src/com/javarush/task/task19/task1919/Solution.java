package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        TreeMap<String, Double> map = new TreeMap<>();
        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine())!=null){
            stringBuilder.append(line);
            stringBuilder.append(" ");
        }
        String text = stringBuilder.toString();
        String[] words = text.split(" ");
        reader.close();

        for (int i = 0; i < words.length; i += 2) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], Double.parseDouble(words[i + 1]));
            } else {
                map.put(words[i], map.get(words[i]) + Double.parseDouble(words[i + 1]));
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
