package day3;

public class Bank {
	String name;
	int balance;
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public void doWithdrawal(int amount) {
		if(balance>10000) {
			if(balance > amount) {
				balance = balance - amount;
				System.out.println("Withdrawal successful");
					
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Low balance");
		}
	}
	public void doDeposit(int amount)
	{
		balance = balance + amount;
		System.out.println("Amount depositted");
	}

}
