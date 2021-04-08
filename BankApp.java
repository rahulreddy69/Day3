package day3;

public class BankApp {
	public static void main(String[] args) {
		Bank ramesh = new Bank();
		Bank suresh = new Bank();
		ramesh.setName("Ramesh");
		ramesh.setBalance(12000);
		ramesh.doDeposit(12000);
		ramesh.doWithdrawal(20000);
		System.out.println("Name : "+ramesh.getName());
		System.out.println("Balance : "+ramesh.getBalance());
		
		suresh.setName("Suresh");
		suresh.setBalance(1000);
		suresh.doDeposit(10000);
		suresh.doWithdrawal(20000);
		System.out.println("Name : "+suresh.getName());
		System.out.println("Balance : "+suresh.getBalance());
		
	}

}
