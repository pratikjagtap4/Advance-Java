package basics;

class MyClass1
{
	int count =0;
	public  void display(int a , int b)
	{
		System.out.println("Before Synchronization " + count);
		synchronized(this)
		{
			
			for(int i = a ; i < b; i++)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("after Synchronization " + count);

	}
}
public class ThreadExample13LockedObject
{
	public static void main(String[] args) 
	{
		MyClass1 obj = new MyClass1();
		MyClass1 obj2 = new MyClass1();
		
		Runnable r1 = new Runnable() {
			public void run()
			{
			
				obj.display(10,20);
			}
		};
		Thread t1 = new Thread(r1);
		
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				obj2.display(50,60);
			}
		};
		Thread t2 = new Thread(r2);
		
		
		t1.start();
		t2.start();

	}
}