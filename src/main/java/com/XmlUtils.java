package com;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * Created by lenovo on  二月
 */
public class XmlUtils {
         public void getXmlContent() throws  Exception {
             SAXReader saxReader=new SAXReader();
             //获取文件，转换成Document对象
             Document document=saxReader.read( new File("E:\\test.xml"));
             //获取根元素
             Element root=document.getRootElement();
             //文档转换为字符串
             String docXmlText=document.asXML();
             System.out.println("xml内容如下：");
             System.out.println(docXmlText);
             System.out.println("根目录标签的内容如下：");
             String rootXmlText=root.asXML();
             System.out.println(rootXmlText);
             System.out.println("子标签<西游记>的内容如下：");
             Element e1=root.element("西游记");
             System.out.println(e1.asXML());
             System.out.println("子标签<作者>的内容如下：");
             Element e2=e1.element("作者");
             System.out.println(e2.asXML());
             System.out.println("标签内容如下:");
             String text=e2.getText();
//             String text= e2.asXML().substring(e2.asXML().indexOf(">") + 1, e2.asXML().lastIndexOf("<"));
             System.out.println(text);
         }


         public void getElementText() throws  Exception{
             SAXReader saxReader=new SAXReader();
             //获取文件，转换成Document对象
             Document document=saxReader.read( new File("E:\\test.xml"));
             Element root=document.getRootElement();
             Attribute attribute=root.attribute("四大名著");
             String text=attribute.getText();
             System.out.println(text);



         }
}
