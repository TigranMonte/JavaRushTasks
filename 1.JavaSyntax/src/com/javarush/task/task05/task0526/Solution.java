package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    public static void main(String[] args) {
        Man man1 = new Man("Arthur", 32, "Emerald");
        Man man2 = new Man("John", 31, "Saint Deny");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman1 = new Woman("Rene", 27, "Valentine");
        Woman woman2 = new Woman("Molly", 25, "Strawberry");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}

