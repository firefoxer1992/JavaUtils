package com;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试运行。见test.com文件夹的测试类
 * StringUtils中的方法大多是不会对null报空指针异常的。
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

    public static void equalsIgnoreCase(){
        if(StringUtils.equalsIgnoreCase("abc","Abc")) {
            System.out.println("第一组字符串忽略大小写是一样的");
        }

        if(StringUtils.equalsIgnoreCase("  ","")){
            System.out.println("第二组字符串忽略大小写是一样的");
        }
    }


    public static void main(String[] args) {

    }


}
