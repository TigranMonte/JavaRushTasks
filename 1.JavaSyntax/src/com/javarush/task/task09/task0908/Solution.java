package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Тут первая строка программы");
            method1();
            System.out.println("Вторая строка программы");
        } catch (NullPointerException e) {
            System.out.println("Error " + e.getClass());
        }
        System.out.println("Finish");
    }
    public static void method1() {

        String s = null;
        String m = s.toLowerCase();
        //напишите тут ваш код
    }
}
