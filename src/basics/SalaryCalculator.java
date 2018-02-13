package basics;

public class SalaryCalculator {
	
	public static void main (String[] args) {
		// 1. Create a Variable 
		// 2. Define the Variable
		
		String career ;
		System.out.println("Program is starting");
		//Define Variable career 
		
		career = "Java Developer";
		System.out.println("Career : "+career);
		
		// 3. Declare and Define 
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// 4. Compute Salary = hoursPerWeek * weeksPerYear * rate 
		double salary = hoursPerWeek * weeksPerYear * rate ;
		System.out.println("Salary as a " + career +" at the rate "+rate+" is equal to "+salary );
		
	}
	

}
