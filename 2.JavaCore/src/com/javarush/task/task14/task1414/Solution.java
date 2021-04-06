package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> key = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            key.add(s);
            if (!(s.equals("soapOpera") || s.equals("cartoon") || s.equals("thriller"))) break;
        }
        for (String str : key) {
            if ((str.equals("soapOpera")) || (str.equals("cartoon")) || (str.equals("thriller"))) {
                System.out.println(MovieFactory.getMovie(str).getClass().getSimpleName());
            } else try {
                MovieFactory.getMovie(str).getClass().getName();
            } catch (NullPointerException e) {
                break;
            }
        }
    }
    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }
    static class SoapOpera extends Movie {
    }
    static class Cartoon extends Movie {
    }
    static class Thriller extends Movie {
    }
}
