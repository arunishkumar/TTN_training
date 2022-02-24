package java_features;

public class Main2 {
        public static void main(String[] args)
        {
        	// Child Thread
        	new Thread(() -> {
        		for(int i=0;i<5;i++)
        		{
                  System.out.println("Child Thread :"+ i);
                  try
                  {
                	  Thread.sleep(100);
                  }
                  catch(Exception e)
                  {
                	 System.out.println("Caught exception in child thread");
                  }
        		}
        	}).start();
        	
        	//Parent Thread
        	for(int i=0;i<5;i++)
        	{
        		System.out.println("Parent thread :"+ i);
        		try
        		{
        		   Thread.sleep(100);
        		}
        		catch(Exception e)
        		{
        			System.out.println("Caught exception in Parent thread");
        		}
        	}
        }
}
