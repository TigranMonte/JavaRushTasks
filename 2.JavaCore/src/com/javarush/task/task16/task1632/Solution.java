package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new NFS1());
        threads.add(new NFS2());
        threads.add(new NFS3());
        threads.add(new NFS4());
        threads.add(new NFS5());
    }

    public static void main(String[] args) {
    }

    public static class NFS1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class NFS2 extends Thread {
        @Override
        public void run() {
            boolean isCurrentInterrupted = Thread.currentThread().isInterrupted();
            while (!isCurrentInterrupted) {
            }
            if (isCurrentInterrupted)
                System.out.println("InterruptedException");
        }
    }

    public static class NFS3 extends Thread {
        @Override
        public void run() {
            boolean isCurrentInterrupted = Thread.currentThread().isInterrupted();
            try {
                while (!isCurrentInterrupted) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class NFS4 extends Thread implements Message {

        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!interrupted()) {
            }
        }
    }

    public static class NFS5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean isCurrentInterrupted = Thread.currentThread().isInterrupted();
            int sum = 0;
            try {
                while (!isCurrentInterrupted) {
                    String s = reader.readLine();
                    if (s.equals("N")){
                        System.out.println(sum);
                        Thread.currentThread().interrupt();
                    }
                    else
                        sum = sum + Integer.parseInt(s);
                }
            } catch (Exception e) {
            }
        }
    }
}

