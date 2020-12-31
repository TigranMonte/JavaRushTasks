package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int a = name1.length();
        int b = name2.length();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        }
        else if (a == b){
            System.out.println("Длины имен равны");
        }

    }
}
