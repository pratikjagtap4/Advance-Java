package basics;

public class ThreadExample05Sleep extends Thread {
	public void run()  {
		for (int i = 65 ; i<91;i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e){
				System.out.println(e);
			}
			
			System.out.println((char)i);
		}
	}

	public static void main(String[] args) {
		
		ThreadExample05Sleep t1 = new ThreadExample05Sleep();
		t1.start();
		
	
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i = 1 ; i<= 5; i++) {
					
					System.out.println(i);
				}
			}
		};
		
		Thread t2 = new Thread(r2);
		t2.start();
		
	}

}
