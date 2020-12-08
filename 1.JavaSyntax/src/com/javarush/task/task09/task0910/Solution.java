package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Запустились");
            method1();
            System.out.println("Опачки");
        } catch (IndexOutOfBoundsException er) {
            System.out.println("Поймал ошибку " + er.getClass());
        }
        System.out.println("Later today");
    }
    public static void method1() {

        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);

        //напишите тут ваш код
    }
}