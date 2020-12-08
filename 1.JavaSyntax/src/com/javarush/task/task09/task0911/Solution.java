package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Agent started to search");
            method1();
            System.out.println("Work is about to finish");
        } catch (NullPointerException er) {
            System.out.println("Damn! " + er.getClass());
        }
        System.out.println("Agent found it");
    }
        public static void method1(){

        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);

        //напишите тут ваш код
    }
}
