package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List <String> files = new ArrayList<>();    //list для частей
        List <String> files2 = new ArrayList<>();   //list для других файлов, на всякий пожарный=)
        String str;
        String part = "part";                       //строка при помощи которой будем ловить части и помещать в нужный список
        while (!(str = reader.readLine()).equals("end")) {  // пока не "end"
            if (str.contains(part)) {                       // путь содержит "part"?
                files.add(str);                             // если содержит, кладем в список
            }
            else {                                          // тут понятно, перестраховка
                files2.add(str);
            }
        }
        reader.close();                                     // поток чтения файлов закрыт
        String firstFile = files.get(0);                // получаем путь к 1ому файлу списка
        String outputFile = firstFile.substring(0, firstFile.lastIndexOf('.'));         // получаем имя целого файла, в который будем собирать куски
        BufferedWriter wr = new BufferedWriter(new FileWriter(outputFile));                  // буфер записи с новым файлом
        Collections.sort(files);                                                             // сортировка массива
        for (String s : files) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(s));                       // буфер чтения из списка файлов
                while (br.ready()) {
                    wr.write(br.readLine());                                              // запмсь в файл, с переходом на новую строку
                }
                br.close();
            }
            catch (FileNotFoundException fne){
                System.out.println("This file " + s + " not found!");
            }
        }

//        System.out.println("Done!");
        wr.close();
    }
}
