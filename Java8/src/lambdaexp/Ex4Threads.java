package lambdaexp;

public class Ex4Threads {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread());
			}
		};
		Thread t1 = new Thread(r1 , "ChinnaSwammy");
		
		Runnable r2 = ()->System.out.println(Thread.currentThread());;
		
		Thread t2 = new Thread(r2 , "MuthhuSwammy");
		Thread t3 = new Thread(r2 , "Venugopal");
		Thread t4 = new Thread(r2 , "Iyyer");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
