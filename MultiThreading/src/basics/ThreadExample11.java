package basics;

public class ThreadExample11 {
	
	public static synchronized void display(int a , int b)
	{
		for(int i = a ; i <= b; i++)
		{
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run()
			{
				display(10,20);
			}
		};
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				display(50,60);
			}
		};
		Thread t2 = new Thread(r2);
		
		t2.start();

	}
	
}
