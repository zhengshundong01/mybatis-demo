package com.tz.demo.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/16
 * @Version: 1.0
 * @Description:
 **/

@Data
public class Person {

    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 关键词
     */
    private String keyWord;

    /**
     * 关系
     */
    private String relationShip;

    /**
     * 描述
     */
    private String desc;

}
