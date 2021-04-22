package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws Exception{
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();
        System.setOut(consoleStream);
        String [] str = result.split("\\n");
        int j = 1;
        for (int i = 0; i < str.length; i ++){
            if (j==i){
                System.out.println(str[i]);
                System.out.println("JavaRush - курсы Java онлайн");
                j=j+2;
            }
            else {
                System.out.println(str[i]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}