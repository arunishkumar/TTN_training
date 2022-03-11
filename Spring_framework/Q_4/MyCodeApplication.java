package com.arunish.project.myCode;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyCodeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext=SpringApplication.run(MyCodeApplication.class, args);
		
		BinarySearchImpl obj= applicationContext.getBean(BinarySearchImpl.class);
		int result=obj.binarySearch(new int[] {3,8,9,7},8);
		System.out.println(result);
	
		//display properties of one bean
        System.out.println(applicationContext.getDisplayName());
        System.out.println(applicationContext.getId());
        
	}

}
