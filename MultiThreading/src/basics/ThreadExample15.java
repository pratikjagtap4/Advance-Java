package basics;

class Music extends Thread{
	public void run() {
		System.out.println("listening to music while driving");
	}
}

class Driving extends Thread{
	public void run() {
		System.out.println("I am driving");
	}
}

class Eating extends Thread{
	public void run() {
		System.out.println("I am eating biryani while driving");
	}
}

public class ThreadExample15 {

	public static void main(String[] args) {
		Driving d1 = new Driving();
		Eating e1 = new Eating();
		Music m1 = new Music();
		
		d1.start();
		e1.start();
		m1.start();

	}

}
