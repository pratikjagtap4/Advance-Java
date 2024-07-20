package basics;

public class ThreadExample16DeadLock {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample16ThreadLock obj = new ThreadExample16ThreadLock();
		
		Thread t1 = new Thread() {
			public void run()
			{
				obj.display();
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				obj.info();
			}
		};
		
		t1.start();
		t1.join();
		t2.start();
		

	}
}
