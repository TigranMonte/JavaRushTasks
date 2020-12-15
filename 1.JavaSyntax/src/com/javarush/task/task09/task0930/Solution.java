package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> stri = new ArrayList<>();
        ArrayList<Integer> ini = new ArrayList<>();
        boolean[] leng = new boolean[array.length];
        for (int i=0; i<array.length;i++){                  //Делим на списки строк и чисел, кроме того запоминаем последовательность
            if(isNumber(array[i])) {
                ini.add(Integer.parseInt(array[i]));
                leng[i]=true;
            }
            else {
                stri.add(array[i]);
                leng[i]=false;
            }
        }

        for (int i =stri.size()-1; i>=1;i--){//Сортировка массива текстового в необходимом порядке
            for (int j=0; j<i;j++){
                if (isGreaterThan(stri.get(j),stri.get(j+1)))
                {
                    String asd = stri.get(j);
                    stri.set(j, stri.get(j+1));
                    stri.set(j+1, asd);
                }
            }
        }

        for (int i =ini.size()-1; i>=1;i--){  // Сортировка числового списка в порядке убывания
            for (int j=0; j<i;j++){
                if (ini.get(j)<ini.get(j+1))
                {
                    int asd = ini.get(j);
                    ini.set(j, ini.get(j+1));
                    ini.set(j+1, asd);
                }
            }
        }

        for (int i=0; i < leng.length;i++) { //Корректировка изначального массива
            if (leng[i]) {
                array[i] = ini.get(0).toString();
                ini.remove(0);
            } else {
                array[i] = stri.get(0);
                stri.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
