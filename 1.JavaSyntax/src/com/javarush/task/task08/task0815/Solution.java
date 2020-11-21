package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Морган", "Артур");
        map.put("Марстон","Джон");
        map.put("Линде", "Датч");
        map.put("Адлер", "Сэди");
        map.put("Стивенсон", "Чарльз");
        map.put("Белл>", "Мика");
        map.put("Пирсон", "Кок");
        map.put("Смит", "Хозая");
        map.put("Марстон", "Эбигейл");
        map.put("Джереми", "Артур");
        map.put("Гейтс", "Билл");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getValue().equals(name))
            i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName))
            i++;
        }
        return i;
    }

    public static void main(String[] args) {


    }
}
