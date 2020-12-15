package com.javarush.task.task09.task0929;

/* 
Обогатим код функциональностью!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream(sourceFileName); //проверяю существует ли файл
        }catch (IOException e){  // лювлю ошибку так как его нет
            System.out.println("Файл не существует."); // вывожу текст который нужно
            sourceFileName = reader.readLine(); // опять вызываю метод ввода пути файла
            fileInputStream = getInputStream(sourceFileName); //записываю новый файл??

        }
        String destinationFileName = reader.readLine();
        //InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}


