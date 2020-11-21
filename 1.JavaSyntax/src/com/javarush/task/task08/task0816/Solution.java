package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Ван Дам", dateFormat.parse("NOVEMBER 10 2011"));
        map.put("Арнольд", dateFormat.parse("JULY 6 2012"));
        map.put("Стивен", dateFormat.parse("DECEMBER 25 2011"));
        map.put("Джеки", dateFormat.parse("MAY 15 2012"));
        map.put("Марк", dateFormat.parse("AUGUST 15 2012"));
        map.put("Дольф", dateFormat.parse("APRIL 17 2012"));
        map.put("Рок", dateFormat.parse("MARCH 11 2012"));
        map.put("Киану", dateFormat.parse("JUNE 18 2012"));
        map.put("Рик", dateFormat.parse("MARCH 4 2011"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            int d = date.getMonth();
            if (d == 5 || d == 6 || d == 7) {
                iterator.remove();
            }
        }
    }

        public static void main (String[]args){

        }
    }
