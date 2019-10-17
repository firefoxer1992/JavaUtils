package com.collection;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019\10\17 0017 23:11
 * @Description: 判断集合是否为空。简单方便的工具类
 */
public class CollectionUtilsDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        if(CollectionUtils.isEmpty(list)){
            System.out.println("list集合为空");
        }
    }

}
