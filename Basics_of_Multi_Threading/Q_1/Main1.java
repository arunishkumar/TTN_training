

class MultiThreading1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread 1 is running....");
		try {
			System.out.println("Thread 1 is sleeping");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}


class MultiThreading2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread 2 is running....");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Main1 {
  public static void main(String[] args) throws InterruptedException
  {
	  	  Thread t1=new Thread(new MultiThreading1());
	  	  
	  MultiThreading2 t2=new MultiThreading2();
	  
	  t1.start();
	  t2.start();
	  
	  t1.join();
	  System.out.println("Thread 1 exited");
	  t2.join();
	  System.out.println("Thread 2 exited");

	  System.out.println("Both thread execution ended");
  }
}
