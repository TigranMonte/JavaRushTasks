package com.javarush.task.task38.task3803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object i = Integer.valueOf(222);
        String s = (String)i;
    }

    public void methodThrowsNullPointerException() {
        String s = null;
        s.length();
    }

    public static void main(String[] args) {

    }
}
