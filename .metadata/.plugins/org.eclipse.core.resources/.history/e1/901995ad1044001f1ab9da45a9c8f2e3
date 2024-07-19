package basics;

public class ThreadExample11Synchronization  extends Thread{

	public static synchronized void display()
	{
		for(int i=1; i <= 5; i++ )
		{
			System.out.println(i);
		}
	}
	public void run()
	{
		display();
	}
	public static void main(String[] args) {
		ThreadExample11Synchronization t1 = new ThreadExample11Synchronization(); 
		ThreadExample11Synchronization t2 = new ThreadExample11Synchronization(); 
		ThreadExample11Synchronization t3 = new ThreadExample11Synchronization(); 
		ThreadExample11Synchronization t4 = new ThreadExample11Synchronization(); 
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
