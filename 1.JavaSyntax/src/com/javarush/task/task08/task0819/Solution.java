package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[1]);
        printCats(cats);
        //напишите тут ваш код. step 3 - пункт 3
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> setOfCats = new HashSet<>();
        setOfCats.add(new Cat());
        setOfCats.add(new Cat());
        setOfCats.add(new Cat());
        return setOfCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat print : cats) {
            System.out.println(print);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
    }
}
