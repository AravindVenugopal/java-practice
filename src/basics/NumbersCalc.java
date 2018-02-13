package basics;

public class NumbersCalc {
	public static void main (String[] args) {
		// 1. Call a function and print name . 
		// 2. Call a function - pass values and print results . 
		// 3. Call a function - pass values and return result and print it .
		int numA = 40;
		int numB = 50;
		printName();
		addNumbers(numA,numB);
		int product = multiplyNumbers(numA,numB);
		System.out.println("The product of "+numA+" and "+numB+" is "+product);
		}
	static void printName() {
		System.out.println("Name is Outlaw");
	}
	static void addNumbers(int numberA,int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of "+numberA+" and "+numberB+" is : "+sum);
		
	}
	static int multiplyNumbers(int number1, int number2) {
		int product = 	number1 * number2;
		addNumbers(product, product);
		return product;		
	}
	

}
