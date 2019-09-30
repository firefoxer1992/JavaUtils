package com.dto;

import java.math.BigDecimal;

/**
 * @Auther: Administrator
 * @Date: 2019\9\30 0030 23:31
 * @Description:
 */
public class DTOTest {
    public static void main(String[] args) {
        UserDTO userDTO=new UserDTO("lin", "shenZhen", 26, BigDecimal.ONE, "test");
        User user=BeanMapperUtils.map(userDTO,User.class);
        System.out.println(user.getName()+","+user.getAge()+","+user.getScore());
    }


}
