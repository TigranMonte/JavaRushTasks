package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String s = fileScanner.nextLine();
            String [] person = s.split(" ");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = simpleDateFormat.parse(person[3] + " " + person[4] + " " + person[5]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Person(person[1], person[2], person[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
