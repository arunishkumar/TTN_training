package com.arunish.project.myCode;

public class BinarySearchImpl {

	
	public int binarySearch(int[] numbers,int numberToSearchFor)
	{
		//Step 1 -> sort the array(Code of Bubble sort or quick sort logic here)
		//we have to manually change the code here in order to choose the type of sorting algorithm.(Tight coupling)
		for(int i=0;i<numbers.length;i++)
		{
			//bubble sort code or quick sort code
		}
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
