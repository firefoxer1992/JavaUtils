package com;

import com.io.IOUtilsDemo;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* IOUtilsDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>02/11/2018</pre> 
* @version 1.0 
*/ 
public class IOUtilsDemoTest {
    private int length;
    private String str;
    private  String fileName;
    private String encoding;
    private List<String> lineList;


    @Before
    public void before() throws Exception {
        length=8;
        str="Hello World!";
        fileName="E:\\java编程\\IO文件.txt";
        encoding="UTF-8";
        lineList =new ArrayList<String>();
        lineList.add("\n欢迎访问:");
        lineList.add("github.com");
    }

    @After
public void after() throws Exception { 
} 

/** 
* 
* Method: read()
* 
*/ 
@Test
public void testReadTest() throws Exception { 
//TODO: Test goes here...
    IOUtilsDemo.read(str,length);

}

@Test
    public void testReadLines() throws Exception {
//TODO: Test goes here...
     IOUtilsDemo.readLines(fileName);
  }

} 
