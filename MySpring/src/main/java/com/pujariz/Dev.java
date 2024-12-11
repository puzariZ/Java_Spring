package com.pujariz;

public class Dev {

    private Computer comp;

//    private int age;
//    public Dev(int age) {
//        this.age = age;
//        System.out.println(age);
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//        System.out.println(age);
//    }

    // Dev constructor for laptop
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev laptop constructor...");
//    }

    //Getters and setters for laptop
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Laptop getter and setter...");
//    }

    // Dev Constructor for Computer
    public Dev(Computer comp) {
        this.comp = comp;
    }

    //Getter and setters for Computer
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
        System.out.println("Getter and setter for Computer...");
    }

    public Dev(){
        System.out.println("Calling Dev Constructor...");
    }

    public void build(){
        System.out.println("Working on this awesome project...");
    }
}