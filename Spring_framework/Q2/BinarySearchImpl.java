package com.arunish.project.myCode;

public class BinarySearchImpl {

	
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers,int numberToSearchFor)
	{
		//Step 1 -> sorts the array according to instance created (either bubble or quick). Lossely coupled
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
