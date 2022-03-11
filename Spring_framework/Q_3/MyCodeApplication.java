package com.arunish.project.myCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyCodeApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=SpringApplication.run(MyCodeApplication.class, args);
		BinarySearchImpl obj= applicationContext.getBean(BinarySearchImpl.class);
		int result=obj.binarySearch(new int[] {3,8,9,7},8);
		System.out.println(result);
	}

}
