package basics;

public class ThreadExample05Sleep extends Thread{
	public void run() {
		for (int i = 65 ; i<91;i++)
		{
			try {
				Thread.sleep(1000);
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
		
		

	}

}
