package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader kek = new BufferedReader(new InputStreamReader(System.in));
        String b= kek.readLine();
        int n = Integer.parseInt(b);
        System.out.print("Я буду зарабатывать $" + n + " в час");
    }
}
