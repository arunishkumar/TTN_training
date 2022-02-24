package java_features;


public class Main3 {
	
	  void addNumbers(int a,int b)
	  {
		  System.out.println("Sum of "+a+" and "+b+" is :"+(a+b));
	  }
	  void subtractNumbers(int a,int b)
	  {
		  System.out.println(+a+"-"+b+" is :"+(a-b));
	  }
	  
	  static void multiplyNumbers(int a,int b)
	  {
		  System.out.println(a+" * "+b+" = "+(a*b));
	  }
      public static void main(String[] args)
      {
    	  MRI ob1=new Main3()::addNumbers;
    	  ob1.calculate(5,6);
    	  
    	  MRI ob2=new Main3():: subtractNumbers;
    	  ob2.calculate(5, 6);
    	  
    	  MRI ob3=Main3:: multiplyNumbers;
    	  ob3.calculate(5, 6);
      }
}
