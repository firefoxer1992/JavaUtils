package test.com; 

import com.FileUtilsDemo;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* FileUtilsDemo Tester. 
* 
* @author <Authors name> 
* @since <pre>02/06/2018</pre> 
* @version 1.0 
*/ 
public class FileUtilsDemoTest { 
   private  String fileName;
   private String encoding;
   private List<String> lineList;

@Before
public void before() throws Exception {
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
     * Method: readFile(String fileName)
     *
     */
    @Test
public void testReadFile() throws Exception { 
//TODO: Test goes here...
        FileUtilsDemo.readFile(fileName,encoding);

}
    @Test
    public void testReadFileByLine() throws Exception {
//TODO: Test goes here...
        FileUtilsDemo.readFileByLine(fileName,encoding);
    }
    @Test
    public void testWriteFile() throws Exception {
//TODO: Test goes here...
        FileUtilsDemo.writeFile(fileName,"test3",encoding);
    }
    @Test
    public void testWriteFileByLines() throws Exception {
//TODO: Test goes here...
        FileUtilsDemo.writeFileByLines(fileName, lineList);
    }
} 
