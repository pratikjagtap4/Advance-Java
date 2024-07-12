package basics;

public class ThreadExample06 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		ThreadExample06 t1 = new ThreadExample06();
		ThreadExample06 t2 = new ThreadExample06();
		ThreadExample06 t3 = new ThreadExample06();
		
		
		t1.start();
		t2.start();
//		t1.start();
		t3.start();
	}

}
