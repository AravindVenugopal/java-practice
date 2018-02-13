package basics;

public class Assignment_SumofN {
	
	public static void main (String[] args) {
		// 1. Function takes Value N as input .  -> If N == 5 , sum = 1+2+3+4+5 = 15 .
		// 2. Compute sum of numbers from 1 to N . 
		// 3. Display the sum . 
		
		sumOfN(5);
		
		
	}
	
	public static void sumOfN(int number) {
		
		int sum =0;
		for (int i=1;i<=number;i++) {
			sum = sum + i ;
			
		}
		System.out.println("The sum from 1 to " +number+ " is "+sum);
						
	}

}
