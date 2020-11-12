package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private volatile String name;      //название
    private volatile float distance;   //расстояние
    private volatile int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach a = new Beach("a", 200, 4);
        Beach b = new Beach("b", 140, 5);
        Beach c = new Beach("c", 100, 5);
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));

    }

    @Override
    public synchronized int compareTo(Beach o) {
        int qd = (this.getQuality() - o.getQuality()) * 100;
        int dd = (int) (((o.getDistance() - this.getDistance())) * 100);
        return qd+dd;
    }
}
