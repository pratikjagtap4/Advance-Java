package basics;

class Counter {
	private int count =0 ;
	
	public synchronized void increment() {
		count++;
	}
	
	public int  getCount() {
		return count;
	}
	
}

class CounterThread extends Thread {
	
	Counter counter;
	
	public CounterThread(Counter counter) {
		this.counter = counter;
	}
	
	public  void run() {
		for(int i = 1 ;i <= 1000 ;i++) {
			counter.increment();
		}
	}
}

public class ThreadExample09Synchronized {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		CounterThread t1 = new CounterThread(counter);
		CounterThread t2 = new CounterThread(counter);
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		
		int val = counter.getCount();
		System.out.println(val);
	}

}
