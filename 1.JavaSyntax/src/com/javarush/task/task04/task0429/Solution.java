package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/
import java.io.*;
public class Solution {
    public static int negative = 0;
    public static int positive = 0;
    public static void main(String[] args) throws Exception {
        int quantity = 3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= quantity; i++)
         checkNumber(Integer.parseInt(reader.readLine()));
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
    public static void checkNumber(int a) {
        if      (a < 0)
            negative += 1;
        else if (a > 0)
            positive += 1;
    }
}
