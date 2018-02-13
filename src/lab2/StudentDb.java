package lab2;

import java.util.Random;

public class StudentDb {
	
	public static void main(String[] args) {
		
	Student S1 = new Student("JOE","111234567891");
//	S1.setCity("Mlore");
//	S1.setPhone("75511223344");
//	S1.setState("KA");
//	System.out.println("City : " +S1.getCity());
//	System.out.println("Phone : "+S1.getPhone());
//	System.out.println("State : "+S1.getState());
//	System.out.println("User Id: "+S1.getUserId());
//	S1.checkBalance();
//	S1.enroll();
//	S1.pay();
//	S1.toString();
//	S1.showCourses();

	}
}


class Student {
	
	private String name;
	private String SSN;
	private String eMail;
	private static int iD =200;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private int random;
	
	//Constructor
	Student(String name,String SSN){
		this.name = name;
		this.SSN = SSN;
		eMail = name.toLowerCase()+"@"+"uni.com";
		System.out.println("Email : " +eMail);
		generateUserId();
	}
	
	public void generateUserId() {
		
		iD++;
		int min = 1000 , max = 9000;
		//Random randNum = new Random();
		//random = randNum.nextInt((max-min)+1)+min;
		int rand1 = (int) (Math.random() * (max-min)) ;
		System.out.println("Radom :" +rand1);
		
		//System.out.println("Radom : "+Rnum);
		int StrLen = SSN.length();
		//System.out.println("Length = " +StrLen);
		userId = iD + "" + random + SSN.substring((StrLen-4));
		//System.out.println("User Id: " +userId);
		
	}
	
	

	public String getUserId() {
		return userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll() {
		
		System.out.println("Enrolling");
	}
	
	public void pay() {
		
		System.out.println("Paying");
	}
	
	public void checkBalance() {
		
		System.out.println("Checking Balance");
	}
	
	@Override
	public String toString() {
		
		return "[Name : " +name +"]";
	}
	
	public void showCourses() {
		
		System.out.println("Showing Courses");
	}
}