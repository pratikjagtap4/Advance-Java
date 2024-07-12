package basics;

public class ThreadExample03 implements Runnable {
	public void run() {
		System.out.println("Name : " + Thread.currentThread().getName());
		System.out.println("Name : " + Thread.currentThread().getPriority());

		
	}

	public static void main(String[] args) {
		
		Runnable r1 =  new ThreadExample03();
		
		Thread t3 = new Thread(r1);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);

		t1.setName("Pratik");
		t1.setPriority(8);
		
		t2.setName("Swapnil");
		t2.setPriority(6);
		
		t3.setName("Lucky");
		t3.setPriority(4);
		
		t3.start();
		t1.start();
		t2.start();
	}

}
