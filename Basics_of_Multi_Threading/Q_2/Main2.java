import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable
{
    private int id;
    
    public Processor(int id)
    {
    	this.id=id;
    }
	@Override
	public void run() {
		System.out.println("Started : "+ id);
		
		try {
			System.out.println("Executing : "+id);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed : "+ id);
	}
	
}
public class Main2 {
      public static void main(String[] args) throws InterruptedException
      {
    	  //ExecutorService executor=Executors.newSingleThreadExecutor();
    	  //ExecutorService executor=Executors.newCachedThreadPool();
    	  ExecutorService  executor=Executors.newFixedThreadPool(2);
    	  for(int i=0;i<5;i++)
    	  {
    		  executor.submit(new Processor(i));
    	  }
    	  
    	  executor.shutdown();
    	  
    	  executor.awaitTermination(1, TimeUnit.HOURS);
    	  System.out.println("Execution of all threads complete....");
      }
}
