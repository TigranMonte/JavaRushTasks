package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a >= b && b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (a>=c && c>=b) {
            System.out.println(a + " " + c + " " + b);
        }
        else if (b >= a && a >= c){
            System.out.println(b + " " + a + " " + c);
        }
        else if (b >= c && c >= a){
                System.out.println(b + " " + c + " " + a);
            }
        else if (c >= a && a >= b){
            System.out.println(c + " " + a + " " + b);
        }
        else if (c >= b && c >= a){
            System.out.println(c + " " + b + " " + a);
        }

    }
}
