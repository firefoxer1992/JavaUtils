package com;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * Created by lenovo on  三月
 */
public class JsonUtils {
    /**
     * 将对象转化为json文本
     * @param object
     * @param <T>
     * @return
     */
    public static <T> String objectToJson(Object object){
        //将对象转化为Json数组
        JSONObject jsonObject= JSONObject.fromObject(object);
        System.out.println(jsonObject.getString("age"));
        return  jsonObject.toString();
    }

    /**
     * 将List对象序列化为JSON文本
     * @param list
     * @param <T>
     * @return
     */
    public static <T> String listToJson(List<T> list) {
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }


    /**
     *  将Json对象转换为相关类型的对象
     * @param jsonObject
     * @param beanClass
     * @return
     */
    public static Object jsonToObject(JSONObject jsonObject,Class beanClass){
           return  JSONObject.toBean(jsonObject,beanClass);
    }

}
