package java_features;

interface checkTwoNumbers
{
	boolean greaterThan(int a,int b);
}

interface incrementByOne
{
	int inc_by_one(int num);
}

interface addTwoStrings
{
	String add_strings(String s1,String s2);
}

interface convertToUpperCase
{
	String to_upper(String s1);
}
public class Main1 {
      public static void main(String[] args)
      {
    	  //check num1 is greater than num2
    	  checkTwoNumbers s=(num1,num2) -> num1>num2;
    	  System.out.println("For numbers 2 & 3 : "+s.greaterThan(2, 3));
    	  
    	  //Increment number by 1
    	  incrementByOne s1=(number) -> number+1;
    	  System.out.println("2 after incrementing by one :"+s1.inc_by_one(2));
    	  
    	  //concatenate two strings
    	  addTwoStrings ob=(string1,string2) -> string1+string2;
    	  System.out.println("Tom and Harry after conactenation is : "+ob.add_strings("Tom", "Harry"));
           
    	  //Convert string to uppercase
    	  convertToUpperCase ob1=(string1)-> string1.toUpperCase();
    	  System.out.println("java after converting to upper case is :"+ ob1.to_upper("java"));
      }
}
