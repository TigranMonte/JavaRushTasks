package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().replaceAll(" ","");;
        ArrayList<Character> gl = new ArrayList<>();
        ArrayList<Character> sgl = new ArrayList<>();

        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (isVowel(ch[i])==true)gl.add(ch[i]);
            else if(isVowel(ch[i]) == false ) sgl.add(ch[i]);}

        for (char c : gl){
            System.out.print(c + " ");}

        System.out.println();

        Iterator<Character> it = sgl.iterator();
        while (it.hasNext()){
            Character w = it.next();
            if(w.equals(" ")) it.remove();}

        for(char t : sgl){
            System.out.print(t + " ");}
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}