package com.pujariz;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Compiling in Laptop Constructor...");
    }

    public void compile(){
        System.out.println("Compiling in Laptop...");
    }
}
