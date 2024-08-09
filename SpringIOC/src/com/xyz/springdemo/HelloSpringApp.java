package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c1=(Coach) context.getBean("my1");
		
		Coach c2=(Coach) context.getBean("my2");
		
		System.out.println(c1.getDailyWorkOut());
		
		System.out.println(c2.getDailyWorkOut());

	}

}
