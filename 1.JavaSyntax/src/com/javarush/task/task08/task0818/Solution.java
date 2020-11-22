package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Артур", 750);
        map.put("Датч", 520);
        map.put("Хозия", 505);
        map.put("Джон", 400);
        map.put("Мика", 390);
        map.put("Адлер", 502);
        map.put("Пирсон", 350);
        map.put("Штраус", 400);
        map.put("Эбигейл", 250);
        map.put("Джек", 100);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : mapCopy.entrySet()){
            if (pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}