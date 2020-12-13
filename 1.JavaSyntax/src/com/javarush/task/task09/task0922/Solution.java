package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = sdf.parse(reader.readLine());
        SimpleDateFormat rdf = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        System.out.println(rdf.format(date).toUpperCase());

    }
}


//Требования:
//1. Программа должна считывать данные с клавиатуры.
//2. В программе должна быть объявлена переменная типа SimpleDateFormat.
//3. В программе должна быть объявлена переменная типа Date.
//4. Программа должна выводить данные на экран.
//5. Вывод должен соответствовать заданию.