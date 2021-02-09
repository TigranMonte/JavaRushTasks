package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
    }

    public static void main(String[] args) {

    }
}