package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        boolean isContain1;
        boolean isContain2;
        for (int i = 0; i < strings.size(); ) {
            isContain1 = strings.get(i).contains("р");
            isContain2 = strings.get(i).contains("л");
            if (isContain1 & !isContain2)
                strings.remove(i);
            else if (isContain2 & !isContain1) {
                strings.add(i, strings.get(i));
                i += 2;
            } else i++;
        }
        return strings;
    }
}