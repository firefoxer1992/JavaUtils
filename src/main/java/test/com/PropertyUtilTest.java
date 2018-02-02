package test.com; 

import com.PropertyUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* PropertyUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>02/02/2018</pre> 
* @version 1.0 
*/ 
public class PropertyUtilTest { 
  private String url=null;
  private String userName=null;
  private String password=null;
@Before
public void before() throws Exception {
    url= PropertyUtil.getProperty("url");
    userName= PropertyUtil.getProperty("username");
    password= PropertyUtil.getProperty("password");
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getProperty(String key) 
* 
*/ 
@Test
public void testGetProperty() throws Exception { 
//TODO: Test goes here...
    System.out.println(url);
    System.out.println(userName);
    System.out.println(password);
} 


} 
