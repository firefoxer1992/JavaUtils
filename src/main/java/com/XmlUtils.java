package com;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lenovo on  二月
 */
public class XmlUtils {
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

    /**
     * 创建Document对象，并往对象中添加节点元素，转存为xml文件
     * @param fileName
     * @throws Exception
     */
    public void createDocumentToXml(String fileName) throws  Exception{
        Document document=DocumentHelper.createDocument();
        Element root=document.addElement("csdn");
        Element java=root.addElement("java");
        java.setText("java班");
        Element ios=root.addElement("ios");
        ios.setText("ios班");
        writeToXml(document,fileName);
    }

    /**
     * 添加属性和数据到xml文件中
     * @param fileName
     */
    public void addAttributeToXml(String fileName) throws Exception {
        // 创建saxReader对象
        SAXReader reader = new SAXReader();
        // 通过read方法读取一个文件 转换成Document对象
        Document document = reader.read(new File(fileName));
        //获取根节点元素对象
        Element root = document.getRootElement();
        Element element=root.element("红楼梦");
        Attribute attribute=element.attribute("id");
        element.remove(attribute);
        //添加新的元素
        element.addAttribute("name","作者");
        Element newElement=element.addElement("朝代");
        newElement.setText("清朝");
        //获得节点对象
        Element author=element.element("作者");
        element.addCDATA("红楼梦，见证一个大家族的兴衰");
        writeToXml(document,fileName);
    }


    /**
     * 遍历xml文件的节点
     * @param fileName
     * @throws Exception
     */
         public void getElementText(String fileName) throws  Exception{
             SAXReader saxReader=new SAXReader();
             //获取文件，转换成Document对象
             Document document=saxReader.read( new File(fileName));
             Element root=document.getRootElement();
             //遍历所有元素的节点
             listNodes(root);
         }

    /**
     * 遍历当前节点元素下方的所有(元素)的子节点
     * @param node
     */
    public void listNodes(Element node) {
        System.out.println("当前节点的名称："+node.getName());
        List<Attribute> attributeList=node.attributes();
        System.out.println("节点的属性：");
        for(Attribute attribute : attributeList) {
            System.out.println(attribute.getText()+"---"+attribute.getName()
            +"----"+attribute.getValue());
        }
        if( !("" ).equals( node.getTextTrim())){
            System.out.println("文本内容:"+node.getText());
        }
        System.out.println("-------------------------");
        Iterator<Element> iterator=node.elementIterator();
        while (iterator.hasNext()) {
           Element element=iterator.next();
           listNodes(element);
        }
    }

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
        if(e!=null) {
            String text=e.getText();
            System.out.println("元素内容如下:\n"+text);
        }
    }


}
