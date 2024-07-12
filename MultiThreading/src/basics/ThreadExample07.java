package basics;

public class ThreadExample07 extends Thread {
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
		ThreadExample07 t1 = new ThreadExample07();
		ThreadExample07 t2 = new ThreadExample07();
		ThreadExample07 t3 = new ThreadExample07();

		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t3.join();
		

	}

}
