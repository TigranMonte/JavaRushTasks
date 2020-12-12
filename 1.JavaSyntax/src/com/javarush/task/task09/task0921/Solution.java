package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();

    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        } catch (NumberFormatException | IOException e) {
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }
}
