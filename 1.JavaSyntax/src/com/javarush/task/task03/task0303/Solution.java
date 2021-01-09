package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println (convertEurToUsd(17,1.7));
        System.out.println (convertEurToUsd(80, 1.7));
        //напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double result = eur * exchangeRate;
        return result;
    }
}
