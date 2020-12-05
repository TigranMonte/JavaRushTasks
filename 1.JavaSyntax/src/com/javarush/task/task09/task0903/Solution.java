package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return  StackTrace[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return  StackTrace[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return  StackTrace[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        return  StackTrace[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] StackTrace = Thread.currentThread().getStackTrace();
        System.out.println(StackTrace[2].getLineNumber());
        return  StackTrace[2].getLineNumber();
    }
}
