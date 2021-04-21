package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer res = new StringBuffer();
        while (file.ready()){
            String [] line = file.readLine().split(" ");
            for (String i:line) {
                if (i.length()>6){
                    if (res.length()>0)
                        res.append(","+i);
                    else res.append(i);
                }
            }
        }
        file2.write(res.toString());
        file.close();
        file2.close();
    }
}



