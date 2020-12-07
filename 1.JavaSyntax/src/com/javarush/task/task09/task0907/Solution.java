package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {


        try {
            System.out.println("Program starts");
            method1();
            System.out.println("Тут что-то написано должно быть");
        } catch (ArithmeticException e) {
            System.out.println("Тут ошибка такая выскакивает" + e.getClass());
        }
        System.out.println("Program is on");
    }
    public static void method1() {

        int a = 42 / 0;

        //напишите тут ваш код
    }
}
