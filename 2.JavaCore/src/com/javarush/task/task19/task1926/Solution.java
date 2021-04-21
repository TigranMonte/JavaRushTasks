package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String reverse = new StringBuilder(line).reverse().toString();
                System.out.println(reverse);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}