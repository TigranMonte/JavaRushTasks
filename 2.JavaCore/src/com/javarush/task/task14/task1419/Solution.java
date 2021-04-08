package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        Exception e1 = new IndexOutOfBoundsException("e1");
        exceptions.add(e1);
        Exception e2 = new NoSuchElementException("e2");
        exceptions.add(e2);
        Exception e3 = new ClassCastException("e3");
        exceptions.add(e3);
        Exception e4 = new NullPointerException("e4");
        exceptions.add(e4);
        Exception e5 = new ArrayStoreException("e5");
        exceptions.add(e5);
        Exception e6 = new ConcurrentModificationException("e6");
        exceptions.add(e6);
        Exception e7 = new EmptyStackException();
        exceptions.add(e7);
        Exception e8 = new IllegalMonitorStateException("e8");
        exceptions.add(e8);
        Exception e9 = new SecurityException("e9");
        exceptions.add(e9);
    }
}
