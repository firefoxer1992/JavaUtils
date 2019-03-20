package com.json;

import com.alibaba.fastjson.JSONObject;
import com.bean.Person;

public class FastJsonUtil {
    /**
     *  json转化为对象
     */
    public static void jsonToObject(){
        //第二个参数类名.class，替换为需要的类就可以了
        String jsons="{ 'name':'feng' , 'sex':'male' , 'age':26 }";
        Person person= JSONObject.parseObject(jsons,Person.class);
        System.out.println(person.getAge());
    }
}
