package basics;

public class ThreadExample03 implements Runnable {
	public void run() {
		
		System.out.println("Name : " + Thread.currentThread().getName());
		System.out.println("Priority : " + Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
		Runnable r1 =  new ThreadExample03();
		
		Thread t3 = new Thread(r1);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);

		t1.setName("Pratik");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t2.setName("Swapnil");
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t3.setName("Lucky");
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t3.start();
		t1.start();
		t2.start();
	}

}
