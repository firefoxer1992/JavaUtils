package com.string;

/**
 * @Auther: Administrator
 * @Date: 2019\10\28 0028 23:14
 * @Description:
 */
public class StringDemo {

    public static void main(String[] args) {
        stringToInt();
        stringToDouble();
    }


    public static void stringToInt(){
        String test="123";
        Integer number=Integer.parseInt(test);
        System.out.println(number);
    }

    public static void stringToDouble(){
        Double value3=new Double("1.23");
        String test="1.23";
        Double number=Double.valueOf(test);
        System.out.println(number);
    }

    public static void stringToInteger(){
        String test="123";
        Integer number=Integer.valueOf(test);
    }

    public static void intToLong(){
        int number=1;
        long longNumber=(long)number;
    }
}
