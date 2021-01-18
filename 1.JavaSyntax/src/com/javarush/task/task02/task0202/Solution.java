package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name = "Jimmy";
        int age = 31;
        int weight = 64;
        int money = 100000;
    }
}
