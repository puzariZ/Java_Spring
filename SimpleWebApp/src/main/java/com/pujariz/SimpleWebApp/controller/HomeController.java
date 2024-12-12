package com.pujariz.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller  // If use Controller then use @ResponseBody
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Hi, This is pujariZ!!!";
    }
}
