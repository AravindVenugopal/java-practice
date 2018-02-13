package oop;

class Person{

	String name;
	String email;
	String phone;

	void walking() {
		System.out.println(name +" is walking");
	}
	void email() {
		System.out.println(email);
	}
	void sleeping() {
		System.out.println(name +" is sleeping");
	}
}

public class demo {

	public static void main (String[] args) {

		Person Person1 = new Person();

		// Define Properties of the Person

		Person1.name = "Outlaw";
		Person1.email = "outlaw@outlaw.com";
		Person1.phone = " 123412341234";

		Person1.walking();
		Person1.email();
		Person1.sleeping();


	}



}
