package basics;

public class ThreadExample16DeadLock {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample16ThreadLock tl = new ThreadExample16ThreadLock();
		
		Thread t1 = new Thread() {
			public void run()
			{
				tl.display();
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				tl.info();
			}
		};
		
		t1.start();
		t1.join();
		t2.start();
		

	}
}
