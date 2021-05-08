package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, ByteArrayOutputStream> map = new HashMap<>();
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]))) {
            ZipEntry entry;

            while ((entry = zis.getNextEntry()) != null) {

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int count;
                while ((count = zis.read(bytes)) != -1) {
                    baos.write(bytes, 0, count);
                }
                map.put(entry.getName(), baos);
                baos.close();
                zis.closeEntry();
            }
        }

        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(args[1]))) {
            String fileName = args[0].substring(args[0].lastIndexOf("/") + 1);
            Path newFile = Paths.get(args[0]);

            for (Map.Entry<String, ByteArrayOutputStream> pair :map.entrySet()) {
                if (fileName.equals(pair.getKey().substring(pair.getKey().lastIndexOf("/") + 1))) continue;
                zip.putNextEntry(new ZipEntry(pair.getKey()));
                zip.write(pair.getValue().toByteArray());
                zip.closeEntry();
            }

            ZipEntry newEntry = new ZipEntry("new/" + fileName);
            zip.putNextEntry(newEntry);
            Files.copy(newFile,zip);
            zip.closeEntry();
        }
    }
}
