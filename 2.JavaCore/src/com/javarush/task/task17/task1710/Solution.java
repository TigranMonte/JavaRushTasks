package com.javarush.task.task17.task1710;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException, IOException {
        //start here - начни тут
        if (args[0].equals("-c")){
            String name = args[1];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date bd = dateFormat.parse(args[3]);

            if (args [2] == "м"){
                Person cur = Person.createMale(name, bd);
                allPeople.add(cur);
                System.out.println(allPeople.indexOf(cur));
            }
            if (args [2] == "ж"){
                Person cur = Person.createFemale(name, bd);
                allPeople.add(cur);
                System.out.println(allPeople.indexOf(cur));
            }
        }
        if (args[0].equals("-u")){
            String id = args[1];
            int idie = Integer.parseInt(id);
            Person cur = allPeople.get(idie);
            String name = args[2];
            cur.setName(name);
            Sex sex = null;
            if (args[3] == "м"){
                sex = Sex.MALE;
            } else if (args[3] == "ж") {
                sex = Sex.FEMALE;
            }
            cur.setSex(sex);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date bd = dateFormat.parse(args [4]);
            cur.setBirthDate(bd);
        }
        if (args[0].equals("-d")){
            String id = args[1];
            int idie = Integer.parseInt(id);
            Person cur = allPeople.get(idie);
            cur.setSex(null);
            cur.setBirthDate(null);
            cur.setName(null);
        }
        if (args[0].equals("-i")){
            String id = args[1];
            int idie = Integer.parseInt(id);
            Person cur = allPeople.get(idie);
            Date parsedDate = cur.getBirthDate();
            SimpleDateFormat sdfDestination = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String destDate = sdfDestination.format(parsedDate);
            Sex sex = cur.getSex();
            String s = null;
            if (sex == Sex.FEMALE) {
                s = "ж";
            } else if (sex == Sex.MALE) {
                s = "м";
            }
            System.out.println(cur.getName() + " " + s + " " + destDate);
        }
    }
}
