package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int x = array.get(0);
        for (int i = 0; i < array.size(); i++){
            if (array.get(i)< x){
                x = array.get(i);
            }
        }
        return x;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < c; i++){
            a.add(Integer.parseInt(bf.readLine()));
        }
        return a;
    }
}
