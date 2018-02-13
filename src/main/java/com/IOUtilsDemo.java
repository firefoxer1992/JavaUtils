package com;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by lenovo on  二月
 */
public class IOUtilsDemo {
    /**
     * read(inputstream,byte[]) 表示读取字节数组中的内容
     * read(inputstream,byte[],offset,length)    其中，offset是表示最后的数字偏移多少，length是读取的长度
     * @param str
     * @param length
     */
    public static void read(String str, int length){
        try{
            byte[] bytes = new byte[length];
            InputStream is = IOUtils.toInputStream(str);
            IOUtils.read(is, bytes);
            System.out.println(new String(bytes));

          } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readLines(String fileName){
        try{
            InputStream is=new FileInputStream(fileName);
            List<String> lineList=IOUtils.readLines(is);
            for(String line : lineList){
                System.out.println(line);
            }
        }catch ( IOException e) {
            e.printStackTrace();
        }
    }
}
