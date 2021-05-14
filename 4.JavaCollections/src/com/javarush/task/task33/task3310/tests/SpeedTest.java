package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class SpeedTest {
    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) {

        Date startDate = new Date();                        // Начало отсчёта
        Set set = getIds(shortener, strings);                   // Вызовем метод Get и преобразуем все строки в массив
        Date finishDate = new Date();                       // Завершение отсчёта
        ids.addAll(set);                                     // Такая конструкция нужна из-за того, что исходный поллученный по указтелю set после выхода из функции, пропадёт.
        Long delta = finishDate.getTime() - startDate.getTime();  // Подсчитаем разницу между началом и концом отрезка
        return delta;
    }

    public Set<Long> getIds(Shortener shortener, Set<String> strings) {
// Этот метод должен для переданного множества строк возвращать множество идентификаторов. Идентификатор для каждой отдельной строки нужно получить, используя shortener
        Set <Long> result = new HashSet<Long>(strings.size());  // Сделаем результирующий Set нужной длины
        Iterator<String> iterator = strings.iterator();         // Cоздадим итератор
        while (iterator.hasNext()) {
            result.add( shortener.getId(iterator.next()));  // Try не нужен т.к. в случае, если нет элемента, то он будет добавлен
        }

        return result;
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date startDate = new Date();                        // Начало отсчёта
        Set set = getStrings(shortener, ids);            // Вызовем метод Get и преобразуем все строки в массив
        Date finishDate = new Date();                       // Завершение отсчёта
        strings.addAll(set);
        Long delta = finishDate.getTime() - startDate.getTime();  // Подсчитаем разницу между началом и концом отрезка
        return delta;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
// Метод будет возвращать множество строк, которое соответствует переданному множеству идентификаторов.
        Set <String > result = new HashSet<String>(keys.size());  // Сделаем результирующий Set нужной длины
        Iterator<Long> iterator = keys.iterator();         // Cоздадим итератор
        while (iterator.hasNext()) {
            String sTmp = shortener.getString(iterator.next());
            if (sTmp != null)
                result.add(sTmp);  // Если строки по ID не было, то мы пустышку добавлять не будем
        }

        return result;
    }

    @Test
    public void testHashMapStorage () {
        HashMapStorageStrategy hmS = new HashMapStorageStrategy();  // Объект на базе стратегии по стандарному HashMap
        Shortener shortener1 = new Shortener(hmS);                 // Сделаем укорачиватель для первой стратегии
        HashBiMapStorageStrategy hmB = new HashBiMapStorageStrategy();  // Объект на базе стратегии на базе Map от Google
        Shortener shortener2 = new Shortener(hmB);                 // Сделаем укорачиватель для первой стратегии
        int capac = 10000;
        Set <String> origStrings = new HashSet<String >(capac);         // Сделаем HashSet для теста
        for ( long i = 0; i< capac; i++) {
            origStrings.add(Helper.generateRandomString());         // Добавим случайную строке
        }
        Set <Long> ids1 = new HashSet<Long>(capac);  // Сюда будем запоминать первые ID
        Set <Long> ids2 = new HashSet<Long>(capac);   //Сюда будем запоминать вторые ID
        Long time1 = getTimeToGetIds(shortener1 , origStrings, ids1);       // Посчитаем время для стратегии HashMap
        Long time2 = getTimeToGetIds(shortener2 , origStrings, ids2);       // Посчитаем время для стратегии HashMap

//        Assert.assertTrue ("Время HashMap должно было быть больше MapGoogle", time1 > time2);   // Убедимся, что HashMap работает медленнеее
        Assert.assertTrue (time1.longValue() > time2.longValue());   // Убедимся, что HashMap работает медленнеее

        Set <String> str1 = new HashSet<String>(capac);  // Сюда будем запоминать строки
        Set <String> str2 = new HashSet<String>(capac);  // Сюда будем запоминать строки
        time1 = getTimeToGetStrings(shortener1 , ids1, str1);       // Посчитаем время для стратегии HashMap
        time2 = getTimeToGetStrings(shortener2 , ids2, str2);       // Посчитаем время для стратегии Map от Google
        Assert.assertEquals( time1.longValue(), time2.longValue(), 30);  // Убедимся, что время, примерно равно
    }


}
