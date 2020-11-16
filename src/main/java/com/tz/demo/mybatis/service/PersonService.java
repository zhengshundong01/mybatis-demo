package com.tz.demo.mybatis.service;

import com.tz.demo.mybatis.entity.Person;
import com.tz.demo.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/16
 * @Version: 1.0
 * @Description:
 **/
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> findAll () {
        return personMapper.findAll();
    }

    public void add(Person person){
        personMapper.insert(person);
    }
}
