package basics;

public class Cities {

	public static void main(String[] args) {
		// 1. Declare and Define an Array -Array size here will be implicit
		// 2. Declare with size and then define an Array - explicit declaration
		// 3. Declare an array , define the array and finally add values - explicit declaration
		
		String cities[] = {"Mangaluru","Bengaluru","Mumbai","Chennai"};
		System.out.println(cities[0]);
		
		String states [] = new String[3];
		states[0] = "Karnataka";
		states[1] = "Maharashtra";
		states[2] = "Tamil Nadu";
		
		System.out.println(states[1]);
		
		String countries [];
		countries = new String [3];
		countries[0] = "India";
		countries[1] = "USA";
		countries[2] = "UK";
		int n=0,i=0;
		System.out.println("********Printing in Do-While********");
		do {
			System.out.println("Country : " +countries[n]);
			n=n+1;
		} while (n<3);
		
		System.out.println("********Printing in While********");
		while (i<3) {
			System.out.println("State : "+states[i]);
			i++;
		}
		
		System.out.println("********Printing in For********");
		for (int j=0;j<=3;j++)	{
			System.out.println("City : "+cities[j]);	
		}
		
	}

}
