package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        if(n>0){
            int max=Integer.parseInt(sc.next());
            while(n>1){
                String s=sc.next();
                int m=Integer.parseInt(s);
                if(m>max){
                    max=m;
                }
                n--;
            }
            System.out.println(max);
        }
    }
}
