package labs;

public class BankAccountApp{

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("1212234", 2000);
		acc1.setName("Camp");
		System.out.println("Name : " +acc1.getName());
		acc1.showBalance();
		acc1.makeDeposit(300);
		acc1.makeDeposit(450);
		acc1.payBill(600);
		
		acc1.accrue();
		System.out.println(acc1.toString());

	}

	
}

class BankAccount implements IInterest{
	
	//Properties of Bank Account .
	private int iD = 100;
	private String accountNumber; //iD + random 2-digits +first 2of SSN .
	private String routingNumber = "223344";
	private String name;
	private String SSN;
	private double balance ;
	
	//Constructor
	
	public BankAccount(String SSN,double initDeposit) {
		
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		
		
	}
	
	private void setAccountNumber() {
		
	int random = (int) (Math.random()*100);
	System.out.println("Random :"+random);
	accountNumber = iD + "" + random + SSN.substring(0,2);
	System.out.println("Your Account Number :" +accountNumber);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		
		balance = balance - amount;
		System.out.println("Paying Bill");
		showBalance();
	}
	
	public void makeDeposit(double amount) {
	
		balance = balance + amount;
		System.out.println("Making Deposit");
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance :" +balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		
		balance = balance * (1+rate/100);
		showBalance();
		
			
	}
	
	@Override
	public String toString() {
		
		return "[Name: " + name + "]\n[Account Number : "+accountNumber + "]\n" + "[Routing Number : " +routingNumber +"]\n" + "[Balance : " +balance +"]";
	}
	
	
		

	}

		
	
	
	
