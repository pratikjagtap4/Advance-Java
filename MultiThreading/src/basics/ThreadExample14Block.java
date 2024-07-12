package basics;

public class ThreadExample14Block {
	public  void display(int a , int b)
	{
		System.out.println("Before Synchonization");
		synchronized(this)
		{
			
			for(int i = a ; i <= b; i++)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("after Synchonization");

	}

	
	public static void main(String[] args) {
		ThreadExample14Block obj = new ThreadExample14Block();
		Runnable r1 = new Runnable() {
			public void run()
			{
				obj.display(10,20);
			}
		};
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				obj.display(50,60);
			}
		};
		Thread t2 = new Thread(r2);
		
		t2.start();

	}
}
