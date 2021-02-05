package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (String text1 = reader.readLine(); !text1.equals("сумма"); text1 = reader.readLine()) {
            int a = Integer.parseInt(text1);
            sum = sum + a;
        }
        System.out.println(sum);
    }
}