package oop;

public class BankAccount implements IRate {

	String accountType;
	String accountNumber;
	private final static String routingNumber = "1414141";
	private String name;
	private String ssn;
	double balance = 0;


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setName(String name) {
		
		this.name = "Mr."+name ;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	
	
	
	
	
	
	BankAccount() {

		System.out.println("New Bank Account Created!");
	}
	BankAccount(String accType){
		System.out.println("New Bank Account Created");
		System.out.println("Account Type : "+accType);
	}
	BankAccount(String accType , Double initDeposit){
		System.out.println("New Back Account Created");
		System.out.println("Account Type :"+accType);
		System.out.println("Initial Deposit :"+initDeposit);

		balance = balance + initDeposit;
	}

	// Methods 
	void deposit() {

	}

	void withdraw() {

	}

	void checkStatus() {

	}
	@Override
	public String toString() {

		return ("Name : "+name + " Balance : " +balance + " Account Type : " +accountType +" Routing # "+routingNumber);
	}

	@Override
	public void setRate() {
		
		System.out.println("Setting Rate");
		
	}

	@Override
	public void increaseRate() {
		
		System.out.println("Increasing Rate");
		
	}
}
