public class multhread implements Runnable
{private int number;
	public multhread(int number) 
	{
		this.number=number;
	}
 	@Override
	public synchronized void run() 
	{
		for (int i = 1; i <= 10; i++) 
			{
	            		System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
	        	}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Tables from 1 to 3 ");
		for (int i = 1; i <= 3; i++) 
		{
			multhread mul = new multhread(i);
	        	Thread thread = new Thread(mul);
	        	thread.start();
	        }
	}}
