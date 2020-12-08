package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Agent started his work");
            method1();
            System.out.println("WTF?");
        } catch (NumberFormatException e) {
            System.out.println("We made it! " + e.getClass());
        }
        System.out.println("Finish");
    }
    public static void method1() {

        int num = Integer.parseInt("XYZ");
        System.out.println(num);

        //напишите тут ваш код
    }
}
