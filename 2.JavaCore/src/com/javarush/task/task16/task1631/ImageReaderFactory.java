package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.BmpReader;
import com.javarush.task.task16.task1631.common.ImageTypes;
import com.javarush.task.task16.task1631.common.JpgReader;
import com.javarush.task.task16.task1631.common.PngReader;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        } else {
            if (type.equals(ImageTypes.JPG)) {
                return new JpgReader();
            }
            if (type.equals(ImageTypes.PNG)) {
                return new PngReader();
            }
            if (type.equals(ImageTypes.BMP)) {
                return new BmpReader();
            }else throw new IllegalArgumentException("Неизвестный тип картинки");
            }
        }
    }

