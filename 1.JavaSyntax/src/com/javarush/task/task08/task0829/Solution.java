package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        String houseNumber = reader.readLine();

        if (list.contains(houseNumber)) {
            String familyName = list.get(list.indexOf(houseNumber)+1);
            System.out.println(familyName);
        }
    }
}

//Требования:
//1. Программа должна выводить текст на экран.
//2. Программа должна считывать значения с клавиатуры.
//3. Класс Solution должен содержать один метод.
//4. Программа должна вывести фамилию семьи по введенному городу.