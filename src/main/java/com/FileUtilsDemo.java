package com;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on  二月
 */
public class FileUtilsDemo {
    public static void readFile(String fileName,String encoding ) throws IOException {
        String str=FileUtils.readFileToString(new File(fileName),encoding);
        System.out.println(str);
    }

    public static void readFileByLine(String fileName,String encoding) throws IOException {
        List<String> list=FileUtils.readLines(new File(fileName), encoding);
        for(String str:list) {
            System.out.println(str);
        }
    }

    public static void writeFile(String fileName, CharSequence data, String encoding) throws IOException {
        FileUtils.write(new File(fileName),data,encoding,true);
    }
}
