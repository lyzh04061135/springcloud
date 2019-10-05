package com.jusfoun.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController  
@SpringBootApplication  
public class CloudDemo 
{
    @RequestMapping("/")  
    String home(){  
        return "Hello World!";  
          
    }

    @RequestMapping("/hello")
    String hello(){
        return "World!";

    }

    public static void main(String[] args) {
        SpringApplication.run(CloudDemo.class, args);
    }  
}
