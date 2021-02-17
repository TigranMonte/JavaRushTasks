package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] myArray;
        myArray = new int[5];
        for (int i = 0; i < 5; i++)
        {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(myArray);

        for (int j = 0; j < 5; j++){
            System.out.println(myArray[j]);
        }
    }
}