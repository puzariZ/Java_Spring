package com.pujariz.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		//Saving Container object in ApplicationContext context
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		//Initialising context object from getBean method to dev(object)
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}

}
