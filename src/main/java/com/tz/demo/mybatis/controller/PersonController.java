package com.tz.demo.mybatis.controller;

import com.tz.demo.mybatis.entity.Person;
import com.tz.demo.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/16
 * @Version: 1.0
 * @Description:
 **/
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    
    @GetMapping("/all")
    @ResponseBody
    public List<Person> findAll () {
        return personService.findAll();
    }

    @GetMapping("/add")
    @ResponseBody
    public void add(){
        personService.add(new Person());
    }
}
