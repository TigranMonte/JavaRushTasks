package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(read.readLine());
        int n = Integer.parseInt(read.readLine());
        for (int y = 1; m >= y; y++) {
            for (int u = 1; n >= u; u++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}