package com.example.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(InversionControlApplication.class, args);
//		Mobiles obj = new Iphone();
//		obj.getModelAndColor();
//		Mobiles obj = new Oneplus();
//		obj.getModelAndColor();
		//spring Bean Container
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobilesConfig.class);
		Mobiles obj=context.getBean("getIphoneObject",Mobiles.class);
		obj.getModelAndColor();
		
	}

}
