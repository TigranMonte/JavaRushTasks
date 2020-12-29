package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a == b && a == c){
            System.out.println(s1 + " " + s2 + " " + s3);
        }
        else if (a == c){
            System.out.println(s1 + " " + s3);
        }
        else if (c == b){
            System.out.println(s2 + " " + s3);
        }
        else if (a == b){
            System.out.println(s1 + " " + s2);
        }

    }
}