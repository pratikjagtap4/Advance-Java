package basics;

public class ThreadExample08{
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Runnable() {
			public void run()
			{
				for(int i = 1 ; i<=15 ; i++)
				{
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					System.out.println(" | ");
					
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				for(int i = 5; i>=1 ; i--)
				{
					for(int j = 1 ; j<=i ; j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
				}
			}
		};
		
		Runnable r3 = new Runnable() {
			public void run()
			{
				for(int i = 1; i<=5 ; i++)
				{
					for(int j = 1 ; j<=i ; j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
				}
			}
		};
		
		Thread t1 =  new Thread(r1);
		Thread t2 =  new Thread(r2);
		Thread t3 =  new Thread(r3);

		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
}
