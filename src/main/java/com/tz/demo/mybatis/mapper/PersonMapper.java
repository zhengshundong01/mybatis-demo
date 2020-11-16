package com.tz.demo.mybatis.mapper;

import com.tz.demo.mybatis.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/16
 * @Version: 1.0
 * @Description:
 **/
@Repository
public interface PersonMapper {

    @Select("select * from person")
    ArrayList<Person> findAll();


    void insert(Person person);
}
