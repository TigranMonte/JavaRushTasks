package com.javarush.task.task18.task1815;

//1. Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
//2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
//3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
//4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
//5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
       private TableInterface component;
        public TableInterfaceWrapper(TableInterface tableInterface){
            super();
            this.component = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            component.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}