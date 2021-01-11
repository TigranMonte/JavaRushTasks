package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg lord = new Zerg();
        lord.name = "lord";
        Zerg boy = new Zerg();
        boy.name = "boy";
        Zerg flame = new Zerg();
        flame.name = "flame";
        Zerg kami = new Zerg();
        kami.name = "kami";
        Zerg clown = new Zerg();
        clown.name = "clown";
        Protoss nifnif = new Protoss();
        nifnif.name = "nifnif";
        Protoss nafnaf = new Protoss();
        nafnaf.name = "nafnaf";
        Protoss nufnuf = new Protoss();
        nufnuf.name = "nufnuf";
        Terran polo = new Terran();
        polo.name = "polo";
        Terran golf = new Terran();
        golf.name = "golf";
        Terran tiguan = new Terran();
        tiguan.name = "tiguan";
        Terran hillux = new Terran();
        hillux.name = "hillux";

        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
