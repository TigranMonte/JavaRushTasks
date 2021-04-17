package com.javarush.task.task19.task1920;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> treeMap = new TreeMap<>();

        while (reader.ready()) {
            String s = reader.readLine();
            String name = s.split(" ")[0];
            double value = Double.parseDouble(s.split(" ")[1]);
            if (treeMap.containsKey(name)) treeMap.put(name, treeMap.get(name) + value);
            else treeMap.put(name, value);
        }

        for (Map.Entry<String, Double> entry :
                treeMap.entrySet()) {
            if (entry.getValue().equals(Collections.max(treeMap.values()))) {
                System.out.println(entry.getKey());
            }
        }

        reader.close();
    }
}

