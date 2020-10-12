package com.javarush.task.task15.task1525;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)))){

            while (br.ready()){
                lines.add(br.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(lines);
    }
}

