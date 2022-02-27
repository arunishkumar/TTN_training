import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
       ExecutorService executor=Executors.newCachedThreadPool();
       
       //using runnable we can't  return value from thread
       executor.submit(new Runnable() {

		@Override
		public void run() {
			Random random=new Random();
			int value=random.nextInt(1000);
			System.out.println("Value Generated from runnable class is :"+ value);
		}
    	   
       });
       
       //using callable we can return value from thread
       Future<Integer> fu=executor.submit(new Callable<Integer>() {

		@Override
		public Integer call() throws Exception {
			Random random=new Random();
			int value=random.nextInt(1000);
			return value;
		}
    	  
    	   
       });
       
       System.out.println("Value Generated from callable class is : "+ fu.get());
       
       executor.shutdown();
       executor.awaitTermination(1, TimeUnit.HOURS);
    }
}
