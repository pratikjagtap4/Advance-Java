package basics;

public class ThreadExample20Daemon extends Thread{
	
	public  void run()
	{
		
		for(int i = 1 ; i<= 5; i++)
		{
			System.out.println(i);
		}
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName() + " is daemon thread");
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " is user Thread");
		}
	}
	

	public static void main(String[] args) {
		 
		ThreadExample20Daemon t1 = new ThreadExample20Daemon();
		ThreadExample20Daemon t2 = new ThreadExample20Daemon();
		ThreadExample20Daemon t3 = new ThreadExample20Daemon();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
		
		t3.start();
	}

}
