package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int b = 0;
        int a = 0;
        while (a != -1) {
            a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            b = b + a;
            if (a == -1) {
                System.out.println(b);
                break;
            }
        }
    }
}