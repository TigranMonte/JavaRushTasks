package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Hello world!");
        s.add("Vamos equipo!");
        s.add("Hala Madrid");
        s.add("Campeones!");
        s.add("Oleee!");

        System.out.println(s.size());

        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}


//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//
//Требования:
//1. Программа не должна ничего считывать с клавиатуры.
//2. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//3. Программа должна добавить 5 любых строк в список.
//4. Программа должна вывести размер списка на экран.
//5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.