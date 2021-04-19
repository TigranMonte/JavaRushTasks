package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        FileReader reader = new FileReader(args[0]);
        String text = "";
        while (reader.ready()){
            int c = reader.read();
            text = text + ((char) c);
        }
        String [] lines = text.split("\n");
        for (String line : lines){
            String [] person = line.split("(?<!\\d)\\s(?=\\d)", 2);
            PEOPLE.add(new Person(person[0], new SimpleDateFormat("dd MM yyyy").parse(person[1])));
        }
        reader.close();

    }
}
