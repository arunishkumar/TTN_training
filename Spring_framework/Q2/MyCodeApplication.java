package com.arunish.project.myCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCodeApplication {

	public static void main(String[] args) {
	
		
		BinarySearchImpl obj=new BinarySearchImpl(new BubbleSort()); //use either bubblesort or quicksort instance
		
		int result=obj.binarySearch(new int[] {3,8,9,7},8);
		System.out.println(result);
		//SpringApplication.run(MyCodeApplication.class, args);
	}

}
