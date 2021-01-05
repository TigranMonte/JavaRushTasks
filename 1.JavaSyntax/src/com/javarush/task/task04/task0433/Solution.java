package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int m = 1;
        while(m>0 && m<=10) {
            int n = 1;
            while (n > 0 && n <= 10) {
                System.out.print("S");
                n++;
            }
            System.out.print("\n");
            m++;
        }
    }
}
