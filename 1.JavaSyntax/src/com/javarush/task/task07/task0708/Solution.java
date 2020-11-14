package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = bf.readLine();
            strings.add(s);
        }
        int max = strings.get(0).length();
        String got = strings.get(0);
        for (int i = 0; i < 5 ; i++) {
            if(strings.get(i).length() > max) {
                max = strings.get(i).length();
                got = strings.get(i);
            }
        }
        for (int i = 0; i < 5 ; i++) {
            if(max == strings.get(i).length()){
                got = strings.get(i);
                System.out.println(got);
            }
        }
    }
}