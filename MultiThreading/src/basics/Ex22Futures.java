package basics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FetchName implements Callable<String>
{

	String name;
	
	FetchName(String name)
	{
		this.name = name;
	}
	
	public String call() throws Exception {
		Thread.sleep(4000);
		return "Your name is " + name;
	}
	
}

public class Ex22Futures {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		FetchName t1 = new FetchName("Pratik");
		FetchName t2 = new FetchName("Swapnil");
		FetchName t3 = new FetchName("Tushar");
		FetchName t4 = new FetchName("Dhananjay");
		
		
		Future<String> name1 = ex.submit(t1);
		Future<String> name2 = ex.submit(t2);
		Future<String> name3 = ex.submit(t3);
		Future<String> name4 = ex.submit(t4);
		
		System.out.println(name1.get());
		System.out.println(name2.get());
		System.out.println(name3.get());
		System.out.println(name4.get());
	}

}
