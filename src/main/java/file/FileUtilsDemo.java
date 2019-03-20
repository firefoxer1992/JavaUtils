package file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * FileUtils工具类的例子
 * fileName 文件名
 * encoding 编码格式。比如"UTF-8"
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

    /**
     *
     * FileUtils.write() ，最后一个布尔参数，表示是在文件末追加，还是直接覆盖
     */
    public static void writeFile(String fileName, CharSequence data, String encoding) throws IOException {
        FileUtils.write(new File(fileName),data,encoding,true);
    }

    public static void writeFileByLines(String fileName,List<String> linesList) throws IOException {
        FileUtils.writeLines(new File(fileName),linesList,true);
    }

    /**
     * 参考博客：http://blog.csdn.net/lqclh502/article/details/38338327
     */
    public static void main(String[] args) throws IOException {
        //删除目录
        //static void:deleteDirectory(File directory)
        FileUtils.deleteDirectory(new File("D:/not/cxyapi"));

        //static boolean:deleteQuietly(File file)
        FileUtils.deleteQuietly(new File("D:/not/cxyapi")); //文件夹不是空任然可以被删除，永远不会抛出异常

        //移动文件 或 文件夹
        //static void：moveDirectory(File srcDir, File destDir)
        FileUtils.moveDirectory(new File("D:/cxyapi1"), new File("D:/cxyapi2")); //注意这里 第二个参数文件不存在会引发异常
        //static void:moveDirectoryToDirectory(File src, File destDir, boolean createDestDir)
        FileUtils.moveDirectoryToDirectory(new File("D:/cxyapi2"), new File("D:/cxyapi3"), true);
    /* 上面两个方法的不同是：
     * moveDirectory：D:/cxyapi2里的内容是D:/cxyapi1的内容。
     * moveDirectoryToDirectory：D:/cxyapi2文件夹移动到到D:/cxyapi3里
     *
     * 下面的3个都比较简单没提供示例，只提供了api
     * 其中moveToDirectory和其他的区别是 它能自动识别操作文件还是文件夹
     */
        //static void:moveFileToDirectory(srcFile, destDir, createDestDir)
        //static void:moveFile(File srcFile, File destFile)
        //static void:moveToDirectory(File src, File destDir, boolean createDestDir)

        //结果是cxyapi和cxyapi1在同一目录
        FileUtils.copyDirectory(new File("D:/cxyapi"), new File("D:/cxyapi1"));
//结果是将cxyapi拷贝到cxyapi2下
        FileUtils.copyDirectoryToDirectory(new File("D:/cxyapi"), new File("D:/cxyapi2"));

//拷贝文件
        FileUtils.copyFile(new File("d:/cxyapi.xml"), new File("d:/cxyapi.xml.bak"));
//拷贝文件到目录中
        FileUtils.copyFileToDirectory(new File("d:/cxyapi.xml"), new File("d:/cxyapi"));
//拷贝url到文件
        FileUtils.copyURLToFile(new URL("http://www.cxyapi.com/rss/cxyapi.xml"), new File("d:/cxyapi.xml"));

        //判断是否包含文件或者文件夹
        boolean b=FileUtils.directoryContains(new File("D:/cxyapi"), new File("D:/cxyapi/cxyapi.txt"));
        System.out.println(b);

        //获得临时目录 和 用户目录
        System.out.println(FileUtils.getTempDirectoryPath());
        System.out.println(FileUtils.getUserDirectoryPath());

        //打开流，如果不存在创建文件及其目录结构
        //第二个参数表示 文件流是否是追加方式
        FileOutputStream fos=FileUtils.openOutputStream(new File("D:/cxyapi/cxyapi.txt"),true);
        fos.write(new String("欢迎访问：www.cxyapi.com\r\n").getBytes());
        fos.close();

        //文件 或 文件夹大小
        System.out.println(FileUtils.sizeOf(new File("D:/cxyapi")));
        System.out.println(FileUtils.sizeOfDirectory(new File("D:/cxyapi")));

    }


}
