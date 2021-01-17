package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int number2Digit = number % 100;
        int b = number2Digit / 10;
        int c= number2Digit % 10;
        return (a + b + c);
    }
}