package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        while (inputStream.available() > 0){
            int symbol = inputStream.read();
            if (map.containsKey(symbol)){
                int count = map.get(symbol);
                map.put(symbol, ++count);
            }
            else map.put(symbol, 1);
        }
        inputStream.close();
        reader.close();
        if (map.size() <= 0){
            return;
        }
        else {
            int max = Collections.max(map.values());
            for (HashMap.Entry<Integer, Integer> pair : map.entrySet()){
                if (pair.getValue() == max){
                    System.out.print(pair.getKey() + " ");
                }
            }
        }
    }
}

