package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse pollyMouse = new Mouse("Polly", 10, 3);

        Cat tomCat = new Cat("Tom", 20, 9);
        Cat lennyCat = new Cat("Lenny", 23, 10);

        Dog loryDog = new Dog("Lory", 30, 15);
        Dog rinoDog = new Dog("Rino", 39, 25)
;    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        String name;
        int height;
        int power;
        
        public Dog(String name, int height, int power){
            this.name = name;
            this.height = height;
            this.power = power;
        }
    }
}
