package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(reader.readLine());
        
        while (x > 0)
        {
            System.out.println(s);
            x--;
        }
    }
}