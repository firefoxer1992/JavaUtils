package com;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by lenovo on  二月
 */
public class StringUtilsDemo {
    public static void remove(){
        String str= StringUtils.remove("abc","bc");
        System.out.println(str);
    }

    public static void stringCounts(){
        int count=StringUtils.countMatches("abcabcda","a");
        System.out.println(count);

    }

    public static void empty(){
          if( StringUtils.isEmpty(null)  ) {
              System.out.println("null检测为空，不会报空指针异常");
          }
          if(StringUtils.isEmpty("  ")) {
              System.out.println("字符串为空");
          }
          ;
    }

    public static void main(String[] args) {

    }


}
