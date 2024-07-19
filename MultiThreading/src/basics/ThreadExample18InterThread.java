package basics;

class BankDetails {
	int balance = 1000;

	public synchronized void withdraw(int amount) throws InterruptedException {

		if (balance < amount) {
			System.out.println("Insufficient balance");
			wait();
		}
		balance -= amount;
		System.out.println("Your balanace is " + balance);
	}

	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println("your account balance is " + balance);
		notify();
	}
}

public class ThreadExample18InterThread {

	public static void main(String[] args) {
		BankDetails cust1 = new BankDetails();

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {

					try {
						cust1.withdraw(250);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {

					cust1.deposit(200);
				}
			}
		};

		t1.start();
		t2.start();

	}

}