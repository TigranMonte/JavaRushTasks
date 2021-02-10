package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString = reader.readLine();
        return readString;

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readInt = Integer.parseInt(reader.readLine());
        return readInt;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double readDouble = Double.parseDouble(reader.readLine());
        return readDouble;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bufferedReader.readLine().trim();
            if (s.equals("true")) {
                return true;
            } else if (s.equals("false")) {
                return false;
            }
        }
    }
            public static void main (String[]args) throws Exception {

            }
    }


//Сделать класс ConsoleReader, у которого будут 4 статических метода:
//String readString() - читает с клавиатуры строку
//int readInt() - читает с клавиатуры число
//double readDouble() - читает с клавиатуры дробное число
//boolean readBoolean() - читает с клавиатуры строку "true" или "false" и
// возвращает соответствующую логическую переменную true или false
//Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner)
// внутри каждого метода.
//
//Требования:
//1. Метод readString должен считывать и возвращать строку(тип String).
//2. Метод readInt должен считывать и возвращать число(тип int).
//3. Метод readDouble должен считывать и возвращать дробное число(тип double).
//4. Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).