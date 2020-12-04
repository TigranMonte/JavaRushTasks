package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (!(name = reader.readLine()).equals("exit")){
            new ReadThread(name).start();
        }
        reader.close();
    }


    public static class ReadThread extends Thread {
        private String filename = null;
        ArrayList<Integer> list = new ArrayList<>();
        public ReadThread(String fileName) throws IOException {
            this.filename = fileName;
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available()>0){
                list.add(fis.read());
            }
            fis.close();
            //implement constructor body
        }

        @Override
        public void run() {
            int element = list.get(0);
            int max = 0;
            for (Integer x: list)
                if (Collections.frequency(list, x) > Collections.frequency(list,max)) max = x;
            resultMap.put(filename,max);
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
