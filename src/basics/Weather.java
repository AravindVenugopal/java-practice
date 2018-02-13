package basics;

public class Weather {
	
	public static void main (String[] args) {
		
		int temperature = 60 ;
		String weather = "Overcast";
		
		if ( temperature > 60) {
			System.out.println("It is warm , wear something simple");
		}
		else if (temperature < 50 && weather == "Sunny") {
			System.out.println("It is cold , wear something warm and sport a cap to block the sun");
		}
		else if (temperature > 50 || weather == "Sunny") {
			System.out.println("Wear a cap");
		}
				
		}
		
		
	}
	


