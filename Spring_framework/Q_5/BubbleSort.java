package com.arunish.project.myCode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//Ambiguity can be resolved by making one bean primary which run by default when no qualifier is specified.
public class BubbleSort implements SortAlgorithm{

	@Override
	public void sort(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("Bubble sort used");
	}

}
