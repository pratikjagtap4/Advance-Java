package basics;

public class ThreadExample07Join extends Thread {
	public void run() {
		for(int i =1 ; i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample07Join t1 = new ThreadExample07Join();
		ThreadExample07Join t2 = new ThreadExample07Join();
		ThreadExample07Join t3 = new ThreadExample07Join();

		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t3.join();
		

	}

}
