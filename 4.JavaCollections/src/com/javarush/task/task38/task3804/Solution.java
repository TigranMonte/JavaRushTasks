package com.javarush.task.task38.task3804;

/* 
Фабрика исключений
*/

public class Solution {
    public static Class getFactoryClass() {
        return ABCD_Factory.class;
    }

    public static void main(String[] args) {
        ABCD_Factory.getException(DatabaseExceptionMessage.NO_RESULT_DUE_TO_TIMEOUT);
    }
}