package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] myArray;
        myArray = new int[5];
        for (int i = 0; i < 5; i++)
        {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(myArray);

        for (int j = 0; j < 5; j++){
            System.out.println(myArray[j]);
        }
    }
}


//1. Программа должна считывать 5 чисел с клавиатуры.
//2. Программа должна выводить 5 чисел, каждое с новой строки.
//3. Выведенные числа должны быть отсортированы по возрастанию.
//4. Вывод должен содержать те же числа, что и были введены (порядок не важен).