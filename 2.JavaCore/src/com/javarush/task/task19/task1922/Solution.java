package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String file = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        }
        catch (IOException e){

        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while (bufferedReader.ready()){
                String read = bufferedReader.readLine();
                String[] wordsLine = read.split(" ");
                int wordCount = 0;
                for (String s : wordsLine){
                    if (words.contains(s)){
                        wordCount++;
                    }
                }
                if (wordCount==2)
                    System.out.println(read);
            }
        } catch (IOException e){
            
        }
    }
}

