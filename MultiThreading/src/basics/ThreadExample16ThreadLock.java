package basics;

public class ThreadExample16ThreadLock {

	
		
		String red = "Red";
		String pink = "Pink";
		
		public void display()
		{
			synchronized(red)
			{
				System.out.println("Red is used by display");
			
				
				
				synchronized(pink)
				{
					System.out.println("pink is used by display method");
				}
			}
			
			
		}
		public void info()
		{
			synchronized(pink)
			{
				System.out.println("pink is used by info");
			
				
				
				synchronized(red)
				{
					System.out.println("red is used by info");
				}
			}
			
			
		}

	

}
