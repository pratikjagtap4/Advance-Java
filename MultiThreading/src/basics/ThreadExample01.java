package basics;

public class ThreadExample01 extends Thread {

	public void run()
	{
		for(int i = 1 ; i<= 10; i++)
		{
			System.out.println(i +" " + Thread.currentThread().getName());
			
		}
	}
	public static void main(String[] args) {
		ThreadExample01 t1 =  new ThreadExample01();
		ThreadExample01 t2 =  new ThreadExample01();
		ThreadExample01 t3 =  new ThreadExample01();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
