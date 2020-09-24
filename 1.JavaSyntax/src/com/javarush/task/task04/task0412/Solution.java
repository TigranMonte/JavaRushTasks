package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0){
            System.out.println(a*2);
        }
        else if (a < 0){
            System.out.println(a+1);//напишите тут ваш код
        }
        else if (a == 0){
            System.out.println(a);
        }
    }

}