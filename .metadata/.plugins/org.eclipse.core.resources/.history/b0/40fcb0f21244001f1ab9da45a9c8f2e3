package basics;

public class ThreadExample10Garbage {

	public void finalize()
	{
		System.out.println("garbage collcted");
	}
	
	public static void main(String[] args) {
		ThreadExample10Garbage g1 = new ThreadExample10Garbage();
		ThreadExample10Garbage g2 = new ThreadExample10Garbage();
		ThreadExample10Garbage g3 = new ThreadExample10Garbage();
		
//		g1 = null;
//		g2.hashCode();
//		g3 = null;
		
		g1 = g2;
		System.gc();
	}

}

