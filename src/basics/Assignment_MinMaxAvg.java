package basics;

public class Assignment_MinMaxAvg {
	
	public static void main(String[] arg) {
		
	//Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
	
	int Array [] = {6,2,3,4,5};
	
	int result1 = minArray(Array);
	int result2 = maxArray(Array);
	int result3 = avgArray(Array);
	System.out.println("The minimum Value is "+result1);
	System.out.println("The maximum Value is "+result2);
	System.out.println("The average Value is "+result3);

	
	}
	
	public static int minArray(int Arr1[]){
		
		int min = Arr1[0];
		for(int i=0;i<Arr1.length;i++) {
			if(Arr1[i]<min) {
				min = Arr1[i];
			}
		}
		return min;
		
	}
	
	public static int maxArray(int Arr1[]) {
		
		int max = Arr1[0];
		for(int i=0;i<Arr1.length;i++) {
			if(Arr1[i]>max) {
				max = Arr1[i];
			}
		}
		return max;
		
	}
	
	public static int avgArray(int Arr1[]) {
		
		int sum = 0 , avg = 0 , n = 0;
		n=Arr1.length;		
		for(int i=0;i<n;i++) {
			
			sum = sum +Arr1[i];
		}
		avg = sum / n;
		return avg;
		
	}
}
