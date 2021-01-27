package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat vaska = new Cat ("vaska", 3, 5, 7);
        Cat sashka = new Cat ("sashka", 4, 6, 6);
        Cat murka = new Cat ("murka", 2, 4, 9);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}