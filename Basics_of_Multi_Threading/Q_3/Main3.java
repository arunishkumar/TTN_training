

public class Main3 {
	private int count=500;
	//syncronized method
	/*public synchronized void increment()
	{
		
		count++;
	}
	public synchronized void decrement()
	{
		count--;
	}*/
	
	//Synchronized block
	public void increment()
	{
		synchronized(this)
		{
			count++;
		}
		
	}
	public synchronized void decrement()
	{
		synchronized(this)
		{
			count--;
		}
	}
	
        public static void main(String[] args) throws InterruptedException
        {
        	Main3 obj=new Main3();
        	obj.doWork();

        }
        
        
    public void doWork() throws InterruptedException
    {
    	Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
					increment();
				}
			}
    		
    	});
    	Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10000;i++)
				{
				    decrement();
				}
			}
    		
    	});
    	t1.start();
    	t2.start();
    	
    	t1.join();
    	t2.join();
    	
    	System.out.println("Final value of count : "+count);
    }
}
