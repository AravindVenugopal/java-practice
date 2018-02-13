package basics;

public class Strings {

	public static void main(String[] args) {
		
		String chosenWord = "Ring";
		String titleOfBook = "The Lord of the Rings";
		
		if(titleOfBook.contains(chosenWord)) {
			System.out.println("The Title Contains "+chosenWord);
			
		}
		String firstName = "Outlaw";
		String lastName = "Modern";
		String SSN = "121212344";
		
		System.out.println("***********");
		
		System.out.print(firstName.substring(0, 2));
		System.out.print(lastName.substring(0, 2));
		System.out.print(SSN.substring(5));
				

	}

}
