package java_features;

interface inter1
{
	default void display()
	{
		System.out.println("Printing inter1 interface display method");
	}
}

interface child1 extends inter1
{
	default void display()
	{
		System.out.println("Printing child 1 interface display method");
	}
}

interface child2 extends inter1
{
	default void display()
	{
		System.out.println("Printing child 2 interface display method");
	}
}
public class Main5 implements child1,child2{
	    public void display()
	    {
	    	System.out.println("Printing Main5 class display method");
	    }
       public static void main(String[] args)
       {
    	   Main5 ob=new Main5();
    	   ob.display();
       }
}
