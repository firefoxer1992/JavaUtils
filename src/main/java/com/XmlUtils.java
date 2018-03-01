package com;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * Created by lenovo on  二月
 */
public class XmlUtils {
    /**
     * 获取xml文件的内容
     * @param fileName 文件名，类似  String fileName1="E:\\test.xml";
     * @param names   标签组成的字符数组.比如 String[] names=new String[]{"西游记","作者"};
     * @throws Exception
     */
    public void getXmlContent(String fileName,String[] names) throws  Exception {
        SAXReader saxReader=new SAXReader();
        //获取文件，转换成Document对象
        Document document=saxReader.read( new File(fileName));
        //获取xml内容
        String docXmlText=document.asXML();
        System.out.println("xml内容如下："+docXmlText);
        System.out.println("-----------------------------");
        //获取根元素
        Element e=document.getRootElement();
        //遍历xml文档
        for(String name : names) {
                if (  e!=null &&  e.element(name)!=null) {
                    e=e.element(name);
                    String elementStr=e.asXML();
                    System.out.println(elementStr);
                    System.out.println("-----------------------------");
          }
        }
         String text=e.getText();
         System.out.println("元素内容如下:\n"+text);
    }


    /**
     * 字符串写入xml文件
     * @param text   文本内容，类似 String text="<csdn><java>Java班</java><net>Net班</net></csdn>";
     * @throws Exception
     */
         public void stringToXml(String text,String fileName) throws Exception {
              Document document= DocumentHelper.parseText(text);
              Element element=document.getRootElement();
              System.out.println(element.getName());
              writeToXml(document,fileName);
         }

    /**
     * 把document对象写入xml文件中
     * @param document
     */
    public void writeToXml(Document document,String fileName) throws Exception {
//        紧凑的格式
//        OutputFormat format=OutputFormat.createCompactFormat();
//         排版缩进的格式
          OutputFormat format=OutputFormat.createPrettyPrint();
          format.setEncoding("UTF-8");
          //创建XmlWriter对象，指定文件及编码
          XMLWriter xmlWriter=new XMLWriter(new OutputStreamWriter(new FileOutputStream(new File(fileName)),"UTF-8"),format);
          xmlWriter.write(document);
          //刷新流
          xmlWriter.flush();
          xmlWriter.close();
    }

    public void createDocumentToXml(String fileName) throws  Exception{
        Document document=DocumentHelper.createDocument();
        Element root=document.addElement("csdn");
        Element java=root.addElement("java");
        java.setText("java班");
        Element ios=root.addElement("ios");
        ios.setText("ios班");
        writeToXml(document,fileName);
    }

//         public void getElementText() throws  Exception{
//             SAXReader saxReader=new SAXReader();
//             //获取文件，转换成Document对象
//             Document document=saxReader.read( new File("E:\\test.xml"));
//             Element root=document.getRootElement();
//             Attribute attribute=root.attribute("四大名著");
//             String text=attribute.getText();
//             System.out.println(text);
//
//
//
//         }
}
