package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private int weight;
        private int height;

        public Human(){
        }
        public Human (String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        public Human (String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        public Human (String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human (String name, String surname, int age, boolean sex){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human (int age){
            this.age = age;
        }
        public Human (String name, boolean sex, int height){
            this.name = name;
            this.sex = sex;
            this.height = height;
        }
        public Human (String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        public Human (String surname, boolean sex, int age, int height){
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }
    }
}


//1. Программа не должна считывать данные с клавиатуры.
//2. В классе Human должно быть 6 полей.
//3. Все поля класса Human должны быть private.
//4. В классе Human должно быть 10 конструкторов.
//5. Все конструкторы класса Human должны быть public.