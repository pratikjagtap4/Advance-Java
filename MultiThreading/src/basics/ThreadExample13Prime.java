package basics;

public class ThreadExample13Prime {

	public static synchronized void display(int a , int b)
	{
		
		for(int i = a ; i <=b; i++) {
			int mid = i /2;
			int flag = 0;
			
			for(int j = 2 ; j<= mid ; j++)
			{
				
				if(i%j==0)
				{
					flag = 1;
				}
			}
			if(flag == 0 )
			{
				System.out.println(i + " is prime number");
				
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run()
			{
				display(1 , 1000);
			}
		};
		Thread t1 = new Thread(r1);
		
		t1.start();
		
		
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				display(1001 , 10000);
			}
		};
		Thread t2 = new Thread(r2);
		
		t2.start();

	}
}
