package com.baizhi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloController {
    @RequestMapping
    public String hello(){
        System.out.println("springmvc");
        System.out.println("may");
        return  "index";
    }
}
