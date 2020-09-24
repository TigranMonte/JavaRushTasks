package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sYear = Integer.parseInt(reader.readLine());
        int nYear = Integer.parseInt(String.valueOf(sYear));
        if((nYear % 4 == 0) || (nYear % 400 == 0)) {
            if (nYear % 4 == 0 && nYear % 100 == 0 && nYear % 400 != 0){
                System.out.println("количество дней в году: 365");
            }
            else if(nYear % 4 == 0 || nYear % 400 == 0) {
                System.out.println("количество дней в году: 366");
            }
        }

        else {
            System.out.println("количество дней в году: 365");
        }
    }
}