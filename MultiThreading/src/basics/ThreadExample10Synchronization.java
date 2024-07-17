package basics;

public class ThreadExample10Synchronization  extends Thread{

	public static synchronized void display()
	{
		System.out.println("Thread " + Thread.currentThread().getName() + "started");
		for(int i=1; i <= 5; i++ )
		{
			System.out.println(i);
		}
		System.out.println("Thread " + Thread.currentThread().getName() + "ended");
	}
	public void run()
	{
		display();
	}
	public static void main(String[] args) {
		ThreadExample10Synchronization t1 = new ThreadExample10Synchronization(); 
		ThreadExample10Synchronization t2 = new ThreadExample10Synchronization(); 
		ThreadExample10Synchronization t3 = new ThreadExample10Synchronization(); 
		ThreadExample10Synchronization t4 = new ThreadExample10Synchronization(); 
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
