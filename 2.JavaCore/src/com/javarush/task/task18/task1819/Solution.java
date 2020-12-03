package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        int file1Length = fis1.available();
        int file2Length = fis2.available();
        byte[] data = new byte[file1Length + file2Length];
        fis2.read(data);
        fis1.read(data, file2Length, file1Length);

        fis1.close();
        fis2.close();

        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(data);
        outputStream.close();


    }
}

//1. Программа должна два раза считать имена файлов с консоли.
//2. Не используй в программе статические переменные.
//3. Для первого файла создай поток для чтения и считай его содержимое.
//4. Затем, для первого файла создай поток для записи(поток для записи должен быть один).
// Для второго - для чтения.
//5. Содержимое первого и второго файла нужно объединить в первом файле.
//6. Сначала должно идти содержимое второго файла, затем содержимое первого.
//7. Созданные для файлов потоки должны быть закрыты.