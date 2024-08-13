package com.xyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor txt=(TextEditor)context.getBean("textEditor");
		txt.spellCheck();

	}

}
