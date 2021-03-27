package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader1.readLine();
        reader1.close();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));//создали второй буфер для считывания данных из файла
        ArrayList<Integer> list = new ArrayList<>();

        while(reader2.ready()) {
            Integer numb = Integer.parseInt(reader2.readLine());

            if(numb %2 == 0) {
                list.add(numb);
            }

            else if(numb<0 && numb%2==0) {
                list.add(numb);
            }
        }

        reader2.close();
        Collections.sort(list);
        for (int x : list) {
            System.out.println(x);
        }
    }
}
