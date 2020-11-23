package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Character space = array[i];
            array[0] = Character.toUpperCase(array[0]);

            if (space.equals(' ')) {
                array[i+1] = Character.toUpperCase(array[i+1]);
            }
        }
        System.out.println(array);

        //напишите тут ваш код
    }
}

//Написать программу, которая вводит с клавиатуры строку текста.
//Программа заменяет в тексте первые буквы всех слов на заглавные.
//Вывести результат на экран.
//Пример ввода:
//мама мыла раму.
//
//Пример вывода:
//Мама Мыла Раму.
//
//Требования:
//1. Программа должна выводить текст на экран.
//2. Программа должна считывать строку с клавиатуры.
//3. Программа должна заменять в тексте первые буквы всех слов на заглавные.