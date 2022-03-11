package com.arunish.project.myCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//can use qualifier bean to access any particular bean

@Component
public class BinarySearchImpl {

	
	@Autowired
	@Qualifier("quicksort") //use qualifier to invoke any particular bean by their name
	 	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers,int numberToSearchFor)
	{
		//Step 1 -> sorts the array according to the bean created (either of bubble or quick). Loosely coupled
          sortAlgorithm.sort(numbers);
		
		
		//Step 2 -> Search the array
		int low=0,high=numbers.length-1;
		while(low<high)
		{
			low++;
			//Binary Search logic here
		}

		//Step 3 -> Return result
		return 3;
	}
}
