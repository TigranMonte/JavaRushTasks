package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 2; i < args.length; i++) {
                        if (args[i].contains("м")) {
                            allPeople.add(Person.createMale(args[i - 1], sdf.parse(args[i + 1])));
                            System.out.println(allPeople.size() - 1);
                        }
                        if (args[i].contains("ж")) {
                            allPeople.add(Person.createFemale(args[i - 1], sdf.parse(args[i + 1])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople){
                    for (int i = 0; i < args.length; i++){
                        if (args[i].contains("м")){
                            allPeople.set(Integer.parseInt(args[i - 2]), Person.createMale (args [i - 1], sdf.parse(args[i + 1])));
                        }
                        if (args[i].contains("ж")) {
                            allPeople.set(Integer.parseInt(args[i - 2]), Person.createFemale (args [i - 1], sdf.parse(args[i + 1])));
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople){
                    for (int i = 0; i < args.length - 1; i++){
                        allPeople.get(Integer.parseInt(args[i+1])).setName(null);
                        allPeople.get(Integer.parseInt(args[i+1])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i+1])).setBirthDate(null);
                    }
                    break;
                }
            case "-i": synchronized (allPeople){
                SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                if (args[0].equals("-i")) {

                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);

                        if (allPeople.get(id).getSex().equals(Sex.FEMALE))
                            System.out.println(allPeople.get(id).getName() + " ж " + format.format(allPeople.get(id).getBirthDate()));
                        if (allPeople.get(id).getSex().equals(Sex.MALE))
                            System.out.println(allPeople.get(id).getName() + " м " + format.format(allPeople.get(id).getBirthDate()));
                    }
                }

            }
                break;
        }
    }
}


