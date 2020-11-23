package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> child = new ArrayList<>();
        child.add(new Human("Джек", true, 7));
        child.add(new Human("Мери", false, 5));
        child.add(new Human("Дейв", true, 3));

        Human Father = new Human ("Джон", true, 41, child);
        Human Mother = new Human ("Эбигейл", false, 35, child);

        ArrayList<Human> parentFather = new ArrayList<>();
        parentFather.add(Father);
        ArrayList<Human> parentMother = new ArrayList<>();
        parentMother.add(Mother);
        Human GrandfatherFather = new Human("Артур", true, 64, parentFather);
        Human GrandfatherMother = new Human("Мане", false, 59, parentFather);
        Human GrandmotherMother = new Human("Джесси", false, 56, parentMother);
        Human GrandmotherFather = new Human("Дэнни", true, 57, parentMother);
        System.out.println(GrandfatherFather + "\n" + GrandfatherMother + "\n" + GrandmotherFather + "\n" + GrandmotherMother
        + "\n" + Father + "\n" + Mother + "\n" + child.get(0) + "\n" + child.get(1) + "\n" + child.get(2));
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

//1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
//2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
//3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
//Требования:
//1. Программа должна выводить текст на экран.
//2. Класс Human должен содержать четыре поля.
//3. Класс Human должен содержать один метод.
//4. Класс Solution должен содержать один метод.
//5. Программа должна создавать объекты и заполнять их так, чтобы получилось:
// два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.