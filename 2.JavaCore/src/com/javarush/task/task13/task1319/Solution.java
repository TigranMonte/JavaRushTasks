package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //создаю reader
        String outputFileName = reader.readLine(); // создаю строку для ввода и введенное значение присваиваю имени файла

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {// создаю writer для записи в файл
            String str; // создаю строку, которую далее будем проверять на содержимость "exit"
            while (!(str = reader.readLine()).equals("exit")) { // создаю цикл, в котром проверяю условие содержания "exit"
                writer.write(str + "\n"); // записываю введенную строку, которая прошла по условию в файл и переношу строку.
            }
            writer.write("exit");// Записываю в файл слово "exit", так как это требует условие задачи.
        }
    }
}