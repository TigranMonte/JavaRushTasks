package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String name1 = args[0];
        String name2 = args[1];
        BufferedReader br = new BufferedReader(new FileReader(name1));
        FileWriter fw = new FileWriter(name2);
        String s;
        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            for (String x : arr) {
                if (x.matches( ".*\\d+.*")) {
                    fw.write(x);
                    fw.write(" ");
                }
            }
        }
        br.close();
        fw.close();
    }
}
