package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(i, Integer.parseInt(reader.readLine()));
        }
        int x=1, y=1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                x++;
                if (x >= y) y = x;
            }
            else x = 1;
        }
        System.out.println(y);
    }
}