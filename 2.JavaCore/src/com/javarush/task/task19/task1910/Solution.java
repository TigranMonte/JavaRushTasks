package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String file1 = reader.readLine();
                String file2 = reader.readLine();
                BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
                reader.close();

                while (reader1.ready()){
                    String s = reader1.readLine().replaceAll("\\p{Punct}", "");
                    writer.write(s);
                }
                reader1.close();
                writer.close();
            }
        }
    

