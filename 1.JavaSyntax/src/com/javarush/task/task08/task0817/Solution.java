package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String value = pair.getValue();
            int counts = 0;

            for (Map.Entry<String, String> pair1 : copy.entrySet())
            {
                if(pair1.getValue() == value){
                    counts += 1;
                }
            }

            if(counts > 1){
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
