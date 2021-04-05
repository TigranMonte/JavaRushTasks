package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList <String> pro = new ArrayList<>();
        pro.add("user");
        pro.add("loser");
        pro.add("coder");
        pro.add("proger");
        while (true){
            key = reader.readLine();
            if (key.equals("user")){
                doWork(new Person.User());
            } else if (key.equals("loser")){
                doWork(new Person.Loser());
            } else if (key.equals("coder")){
                doWork(new Person.Coder());
            } else if (key.equals("proger")){
                doWork(new Person.Proger());
            }
            else if (!pro.contains(key)){
                break;//тут цикл по чтению ключей, пункт 1
            }

        }
        //вызываем doWork
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();// пункт 3
        } else if (person instanceof  Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof  Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}


