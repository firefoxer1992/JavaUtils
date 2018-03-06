package test.com; 

import com.JsonUtils;
import com.bean.Person;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* JsonUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>03/05/2018</pre> 
* @version 1.0 
*/ 
public class JsonUtilsTest { 

    private Person person1=new Person("feng","male",26);
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: objectToJson(Object object) 
* 
*/ 
@Test
public void testObjectToJson() throws Exception { 
//TODO: Test goes here...

    System.out.println( JsonUtils.objectToJson(person1)  );
} 

/** 
* 
* Method: listToJson(List<T> list) 
* 
*/ 
@Test
public void testListToJson() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: jsonToObject(JSONObject jsonObject, Class beanClass) 
* 
*/ 
@Test
public void testJsonToObject() throws Exception { 
//TODO: Test goes here...
    JSONObject jsonObject=JSONObject.fromObject(person1);
    Person person=  (Person)JSONObject.toBean(jsonObject,Person.class) ;
    System.out.println(person.getAge());

} 


} 
