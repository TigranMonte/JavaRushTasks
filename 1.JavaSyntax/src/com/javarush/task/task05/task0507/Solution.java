package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum=0;
        double n=0;
        double ss=0;
        while (true) {
            double number = Double.parseDouble(reader.readLine());
            if (number == -1)
                break;
            else {
                sum += number;
                n++;
                ss = sum/n;}
        }
        System.out.println(ss);
    }
}

