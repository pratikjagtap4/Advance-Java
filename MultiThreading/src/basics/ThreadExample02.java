package basics;

public class ThreadExample02  implements Runnable {

	public static void main(String[] args) {
		Runnable r1 = new ThreadExample02();
		Thread t1 = new Thread(r1 , "Pratik");
		t1.start();
		
		Runnable r2 = new ThreadExample02();
		Thread t2 = new Thread(r2 , "Swapnil");
		t2.start();
		
		Runnable r3 = new ThreadExample02();
		Thread t3 = new Thread(r3 , "Lucky");
		t3.start();

		Thread t4 = new Thread(r3 , "Tushar");
		t4.start();
	}

	
	public void run() {
		System.out.println(Thread.currentThread());
		
	}

}
