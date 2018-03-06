package test.com; 

import com.XmlUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* XmlUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>02/28/2018</pre> 
* @version 1.0 
*/ 
public class XmlUtilsTest { 
  private XmlUtils xmlUtils=new XmlUtils();
  private   String text="<csdn><java>Java班</java><net>Net班</net></csdn>";
    private  String fileName1="E:\\test.xml";
    private  String fileName2="E:\\test2.xml";
   private  String[] names=new String[]{"西游记","作者"};

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getXmlContent()
* 
*/ 
@Test
public void testGetXmlContent() throws Exception {
//TODO: Test goes here...
  xmlUtils.getXmlContent(fileName1,names);
}


    /**
     *
     * Method: stringToDocument()
     *
     */
    @Test
    public void testStringToDocument() throws Exception {
//TODO: Test goes here...
        xmlUtils.stringToXml(text,fileName2);
    }
    /**
     *
     * Method: createDocumentToXml()
     *
     */
    @Test
    public void testCreateDocumentToXml() throws Exception {
//TODO: Test goes here...
        xmlUtils.createDocumentToXml(fileName2);
    }


    /**
     *
     * Method: listNodes(Element node)
     *
     */
    @Test
    public void testListNodes() throws Exception {
//TODO: Test goes here...

    }

    /**
     *
     * Method: getElementText(String fileName)
     *
     */
    @Test
    public void testGetElementText() throws Exception {
//TODO: Test goes here...
        xmlUtils.getElementText(fileName1);
    }

    /**
     *
     * Method: writeToXml(Document document, String fileName)
     *
     */
    @Test
    public void testWriteToXml() throws Exception {
//TODO: Test goes here...

    }

    /**
     *
     * Method: addAttributeToXml(String fileName)
     *
     */
    @Test
    public void testAddAttributeToXml() throws Exception {
//TODO: Test goes here...
        xmlUtils.addAttributeToXml(fileName1);
    }
} 
