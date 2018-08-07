package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hello.HelloSender1;


@RestController
@RequestMapping("/rabbit")
public class RabbitTest {
    
    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
//    private HelloSender1 helloSender2;
    
//    @PostMapping("/hello")
//    public void hello() {
//        helloSender1.send();
//    }
    @RequestMapping("/sss")
    public String ss(){
    	return "sdfsdfs";
    }
}