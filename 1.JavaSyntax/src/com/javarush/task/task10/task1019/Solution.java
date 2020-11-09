package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        while(true)
        {
            String t = reader.readLine();

            if(t.isEmpty())
                break;
            int id = Integer.parseInt(t);
            String name = reader.readLine();
            map.put(name,id);
        }
        for (Map.Entry<String,Integer> entry: map.entrySet()
        ) {
            System.out.println(entry.getValue() + " " + entry.getKey());

        }




        //System.out.println("Id=" + id + " Name=" + name);
    }
}

//1. Программа должна считывать данные с клавиатуры.
//2. Программа должна выводить текст на экран.
//3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
//4. Программа должна помещать в HashMap пары считанные с клавиатуры.
//5. Программа должна выводить на экран содержимое HashMap согласно условию.
// Ключ и значение разделены пробелом. Каждое значение с новой строки.