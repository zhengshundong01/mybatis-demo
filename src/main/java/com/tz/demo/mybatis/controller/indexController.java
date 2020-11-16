package com.tz.demo.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zhengshundong
 * @Date: 2020/11/16
 * @Version: 1.0
 * @Description:
 **/
@Controller
public class indexController {

    @GetMapping
     public String index() {
         return "index";
     }
}
