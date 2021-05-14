package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FunctionalTest {

    public void testStorage(Shortener shortener) {
        //Создавать три строки. Текст 1 и 3 строк должен быть одинаковым.
        String string1 = "firstString";
        String string2 = "secondString";
        String string3 = "firstString";
// Получать и сохранять идентификаторы для всех трех строк с помощью shortener.
        Long stringID1 = shortener.getId(string1);
        Long stringID2 = shortener.getId(string2);
        Long stringID3 = shortener.getId(string3);
//Проверять, что идентификатор для 2 строки не равен идентификатору для 1 и 3 строк
        Assert.assertNotEquals(stringID2, stringID1);
        Assert.assertNotEquals(stringID2, stringID3);
        // Проверять, что идентификаторы для 1 и 3 строк равны.
        Assert.assertEquals(stringID1, stringID3);
//
//      Получать три строки по трем идентификаторам с помощью shortener.
        String stringFromShortener1 = shortener.getString(stringID1);
        String stringFromShortener2 = shortener.getString(stringID2);
        String stringFromShortener3 = shortener.getString(stringID3);

//       Проверять, что строки, полученные в предыдущем пункте, эквивалентны оригинальным.
        Assert.assertEquals(string1, stringFromShortener1);
        Assert.assertEquals(string2, stringFromShortener2);
        Assert.assertEquals(string3, stringFromShortener3);
        
    }

    @Test
    public void testHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashMapStorageStrategy());
        testStorage(shortener);
    }
    @Test
    public void testFileStorageStrategy() {
        Shortener shortener = new Shortener(new FileStorageStrategy());
        testStorage(shortener);

    }
    @Test
    public void testHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);

    }
    @Test
    public void testDualHashBidiMapStorageStrategy() {
        Shortener shortener = new Shortener(new DualHashBidiMapStorageStrategy());
        testStorage(shortener);

    }
    @Test
    public void testOurHashBiMapStorageStrategy() {
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);

    }

}
