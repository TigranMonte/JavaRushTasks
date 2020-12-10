package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Программа запустилась");
            method1();
        }
        catch (MyException e){
            System.out.println("Exception поймана " + e.getClass());
        } catch (MyException4 myException4) {
            myException4.printStackTrace();
        } catch (MyException3 myException3) {
            myException3.printStackTrace();
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }
        System.out.println("Завершение работы");
    }
    public static void method1() throws MyException, MyException2, MyException3, MyException4 {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new MyException();
        } else if (i == 1) {
            throw new MyException2();
        } else if (i == 2) {
            throw new MyException3();
        } else if (i == 3) {
            throw new MyException4();
        }

    }

    static class MyException extends Exception {

    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends OutOfMemoryError {
    }
}

