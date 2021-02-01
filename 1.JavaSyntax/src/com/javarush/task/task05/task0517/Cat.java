package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat (String name){
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.address = null;
        this.color = "white";
    }
    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "black";
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.address = null;
        this.color = "grey";
    }
    public Cat (int weight, String color){
        this.name = null;;
        this.age = 2;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }
    public Cat (int weight, String color, String address){
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
