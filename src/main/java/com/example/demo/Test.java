package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Test.class, args);
		Wish w=ac.getBean("wish",Wish.class);
		System.out.println(w.getWish("Shirish"));
	}
}
