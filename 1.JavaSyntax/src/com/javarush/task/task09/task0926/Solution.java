package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] l1 = new int[] {1, 2, 3, 4, 5};
        int[] l2 = new int[] {1, 2};
        int[] l3 = new int[] {1, 2, 3, 4};
        int[] l4 = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] l5 = new int[] {};
        ArrayList<int[]> arrays = new ArrayList<int[]>();
        arrays.add(l1);
        arrays.add(l2);
        arrays.add(l3);
        arrays.add(l4);
        arrays.add(l5);

        return arrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

//1. Программа не должна считывать данные с клавиатуры.
//2. Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
//3. Метод createList должен возвращать созданный список.
//4. Метод createList должен добавлять в список 5 элементов.
//5. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5
// элементов, второго - 2, следующих - 4, 7, 0 соответственно.
//6. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.