package basics;

public class ThreadExample04 {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("Hello World" + " " + Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(r1 , "t1");

		Runnable r2 = new Runnable() {
			public void run()
			{
				System.out.println("How Are You" + " " + Thread.currentThread().getName());
			}
		};
		Thread t2 = new Thread(r2 , "t2");

		
		Runnable r3 = new Runnable() {
			public void run()
			{
				System.out.println("I am Fine" + " " + Thread.currentThread().getName());
			}
		};
		Thread t3 = new Thread(r3 , "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
