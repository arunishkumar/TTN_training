import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main5 { 
	 private static  String resource1 = "Arunish kumar";  
     private static String resource2 = "Argentina";  
    	private static Lock lock = new ReentrantLock();
    	
    	private static void lockedResource(int id)
    	{
                System.out.println("Thread :"+id+ " locked resource 1 "+resource1);  
                System.out.println("Thread :"+id+" locked resource 2 "+resource2);  
           
    	}
      public static void main(String[] args) {  
       
        
                Thread t1 = new Thread() {  
          public void run() {  
                lock.lock();
                try
                {
                	lockedResource(1);
                }
                finally
                {
                	lock.unlock();
                }
          }  
        };  
      
                Thread t2 = new Thread() {  
          public void run() {  
        	  lock.lock();
              try
              {
              	lockedResource(2);
              }
              finally
              {
              	lock.unlock();
              }
           
          }  
        };  
      
          
        t1.start();  
        t2.start();  
      }  
    }       