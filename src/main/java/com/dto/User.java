package com.dto;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * @Auther: Administrator
 * @Date: 2019\9\30 0030 23:19
 * @Description:
 */
@Builder
public class User {
    private String name;
    private int age;
    private BigDecimal score;

    public User(String name, int age, BigDecimal score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
