package com.dto;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * @Auther: Administrator
 * @Date: 2019\9\30 0030 23:24
 * @Description:
 */
@Builder
public class UserDTO {
    private String name;
    private String adress;
    private int age;
    private BigDecimal score;
    private String description;

    public UserDTO(String name, String adress, int age, BigDecimal score, String description) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.score = score;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
