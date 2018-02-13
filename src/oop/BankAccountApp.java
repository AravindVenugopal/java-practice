package oop;

public class BankAccountApp {

	public static void main (String[] args) {

		BankAccount acc3 = new BankAccount();
		//BankAccount acc2 = new BankAccount("Current Account");
		//BankAccount acc3 = new BankAccount("Savings Account",30000.0);
		//System.out.println(acc3.balance);
		
		acc3.setName("Tom");
		System.out.println("Name : "+acc3.getName());
		
		acc3.setRate();
		acc3.increaseRate();
		
		acc3.setSsn("121341234");
		System.out.println("The SSN is : "+acc3.getSsn());

		//acc3.name = "Sam";
		acc3.accountType = "Savings";

		//System.out.println(acc3.toString());

		//System.out.println("The Routing number is : "+acc3.routingNumber);

		// Demo for Inheritence 
		/*CDAccount cd1 = new CDAccount();
		cd1.interestRate = 6;
		cd1.balance = 45000;
		//cd1.name = "Tom";
		cd1.accountType = "CD Account";	
		System.out.println(cd1.toString());
		cd1.compund();*/
	}

}
