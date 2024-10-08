package basics;

class Bank
{
	int balance;
	
	Bank(int balance)
	{
		this.balance = balance;
		System.out.println("Your Initial Balance is " + balance);
	}
	
	public void withdraw(int amount)
	{
			if(balance<=amount)
			{
				System.out.println("Insufficient balance");
			}
			balance = balance - amount ;
			System.out.println("Your new balance is " + balance);
		
	}
	
	public void deposit(int amount)
	{
		
			balance = balance +amount ;
			System.out.println("Your new balance is " + balance + " rs");
	}
}

public class ThreadExample17 {

	public static void main(String[] args) {
		Bank cust1 = new Bank(1000);
		
		Thread t1 = new Thread() {
			public void run()
			{
				for(int i = 1 ; i<= 6 ; i++)
				{
					cust1.withdraw(250);
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run()
			{
				for(int i = 1 ; i<= 5 ; i++)
				{
					cust1.deposit(200);
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
