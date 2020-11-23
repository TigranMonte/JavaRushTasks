package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Морган", "Артур");
        map1.put("Марстон", "Джон");
        map1.put("Марстон", "Джек");
        map1.put("Адлер", "Рене");
        map1.put("Пирсон", "Томас");
        map1.put("Линде", "Датч");
        map1.put("Смит", "Артур");
        map1.put("Смит", "Чарльз");
        map1.put("Донс", "Кейт");
        map1.put("Бейл", "Мери");

        return map1;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
