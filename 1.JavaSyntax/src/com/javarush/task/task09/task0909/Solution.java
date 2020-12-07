package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Let's start this shit");
            method1();
            System.out.println("Wait!");
        } catch (ArrayIndexOutOfBoundsException er) {
            System.out.println("Error " + er.getClass());
        }
    }
    public static void method1() {

        int[] m = new int[2];
        m[8] = 5;
        //напишите тут ваш код
    }
}
