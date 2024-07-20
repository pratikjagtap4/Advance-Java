package basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTask implements Runnable
{
	char printChar;
	
	PrintTask(char printChar)
	{
		this.printChar = printChar;
	}
	
	public void run() {
		for(int i = 1 ; i<= 100 ; i++)
		{
			System.out.println(i + " "+printChar);
		}
		System.out.print( "    "+Thread.currentThread().getName() + "  completes its task");
		
	}
	
}
public class Ex19ExecutorService {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		PrintTask  t1 = new PrintTask('*');
		PrintTask  t2 = new PrintTask('+');
		PrintTask  t3 = new PrintTask('#');
		PrintTask  t4 = new PrintTask('$');
		
		ex.submit(t1);
		ex.submit(t2);
		ex.submit(t3);
		ex.submit(t4);
		
		ex.shutdown();
		
		
	}

}
