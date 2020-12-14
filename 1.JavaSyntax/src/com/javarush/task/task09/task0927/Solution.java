package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++){
            map.put("cat" + i,new Cat("c" + i));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> m : map.entrySet()){
            set.add(m.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

//1. Программа не должна считывать данные с клавиатуры.
//2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
//3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//4. Метод createMap должен возвращать созданный словарь.
//5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//6. Программа должна вывести всех котов из множества на экран.