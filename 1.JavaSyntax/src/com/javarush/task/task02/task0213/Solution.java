package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Cat vaska = new Cat();
        Dog tuzik = new Dog();
        Fish nemo = new Fish();
        Woman tina = new Woman();
        vaska.owner = tina;
        tuzik.owner = tina;
        nemo.owner = tina;
        
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
