package com.pujariz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //creating and Saving Container object in ApplicationContext context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = context.getBean(Dev.class);
        Dev obj = (Dev) context.getBean("dev");
//        obj.build();
//        Laptop lap = (Laptop) context.getBean("laptop");
//        lap.compile();
//        obj.age=10;
//        System.out.println(obj.age);
//        obj.getAge(); //Calling Getter and Setter for age...


        System.out.println( "Hello World!" );
    }
}
