package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sMoney = reader.readLine();
        int nMoney = Integer.parseInt(sMoney);
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " получает " + nMoney + " через " + nAge + " лет.");
    }
}
