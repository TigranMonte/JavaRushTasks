package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = fileReader.readLine(),
                    fileName2 = fileReader.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
                while (reader.ready()) {
                    String[] numLineArr = reader.readLine().split(" ");
                    for (String num : numLineArr) {
                        try {
                            long numbers = Long.parseLong(num);
                            writer.write(numbers + " ");
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

