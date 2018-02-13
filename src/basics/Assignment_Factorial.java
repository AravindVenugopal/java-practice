package basics;

public class Assignment_Factorial {
	
	public static void main (String[] args) {
		//	Definition: n! = n*(n-1)! , where 0! = 1
		//	1! = 1
		//	2! = 2 * 1! = 2 * 1
		//	3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		//	4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
		
		int factorial ;
		factorial = fact (4);
		System.out.println("The factorial is "+factorial);

		
	}
	
	public static int fact(int number) {
		
		if (number==0) {
			return 1;
			}
		else return (number*fact(number-1));
	}

}
