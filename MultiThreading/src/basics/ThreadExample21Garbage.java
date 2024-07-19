package basics;

public class ThreadExample21Garbage {

	public void finalize()
	{
		System.out.println("garbage collcted");
	}
	
	public static void main(String[] args) {
		ThreadExample21Garbage g1 = new ThreadExample21Garbage();
		ThreadExample21Garbage g2 = new ThreadExample21Garbage();
		ThreadExample21Garbage g3 = new ThreadExample21Garbage();
		
//		g1 = null;
//		g2.hashCode();
//		g3 = null;
		
		g1 = g2;
		System.gc();
		
		
	}

}

