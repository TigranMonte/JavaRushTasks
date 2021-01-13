package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        while(a < 11){
            int x = 1;
            while(x < 11){
                System.out.print(a*x + " ");
                x++;
            }
            System.out.print("\n");
            a++;
        }
    }
}
