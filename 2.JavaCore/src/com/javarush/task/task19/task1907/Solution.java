package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        String temp = "";
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()) {
            temp += scanner.nextLine() + " ";
        }
        fileReader.close();
        scanner.close();

        String [] worlds = temp.split("[\\W|\\p{Space}]");
        int count = 0;
        for (int i =0; i < worlds.length; i++) {

            if (worlds[i].equals("world")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
