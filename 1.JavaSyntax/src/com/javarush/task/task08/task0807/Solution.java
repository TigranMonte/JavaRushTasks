package com.javarush.task.task08.task0807;

/* 
LinkedList и ArrayList
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static Object createArrayList() {
        List<Object> list = new ArrayList<Object>();
        return list;

    }

    public static Object createLinkedList() {
        List<Object> list = new LinkedList<Object>();
        return list;

    }

    public static void main(String[] args) {

    }
}


//1. Программа не должна выводить текст на экран.
//2. Программа не должна считывать значения с клавиатуры.
//3. Программа должна содержать только три метода.
//4. Метод createArrayList() должен создавать и возвращать список ArrayList.
//5. Метод createLinkedList() должен создавать и возвращать список LinkedList.