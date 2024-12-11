package com.pujariz.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//using Component annotation
@Component
public class Dev {

    // Field Injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;

    // Constructor Injection
    // @Autowired is optional in Constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }

    // Setters Injection
//    @Autowired
//    public  void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();
        System.out.println("I'm about to build great application...");
    }
}
