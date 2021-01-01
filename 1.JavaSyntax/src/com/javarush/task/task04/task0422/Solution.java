package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        int a = Integer.parseInt(year);

        if (a < 18) {
            System.out.println("Подрасти еще");
        }
        //напишите тут ваш код
    }
}