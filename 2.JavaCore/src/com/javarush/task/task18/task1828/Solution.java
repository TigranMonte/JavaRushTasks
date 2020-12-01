package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> arrayList = new ArrayList<>();
        String readLine;

        while (bufferedReader.ready()) {
            if (!((readLine = bufferedReader.readLine()).substring(0, 8).trim()).equals(args[1]))
                arrayList.add(readLine);
            else {
                if (args[0].equals("-u")){
                    StringBuilder sb = new StringBuilder();
                    sb.append(args[2]);
                    for (int i = 30 - args[2].length(); i > 0 ; i--) {
                        sb.append(" ");
                    }
                    sb.append(args[3]);
                    for (int i = 8 - args[3].length(); i > 0 ; i--) {
                        sb.append(" ");
                    }
                    sb.append(args[4]);
                    for (int i = 4 - args[4].length(); i > 0 ; i--) {
                        sb.append(" ");
                    }
                    arrayList.add(readLine.substring(0, 8) + sb);
                }
            }
        }
        bufferedReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (String s : arrayList) {
            writer.write(s);
            writer.newLine();
        }
        writer.close();
    }
}
