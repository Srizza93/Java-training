package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	
	void emailaddress() {
		System.out.println("email: " + email);
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "984394839";
		
		person1.walk();
		person1.emailaddress();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
	
		/* Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe.testemail.com";
		String phone = "84930840";
		
		// Actions, activities, behaviors
		//  System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// If we wanted another person
		String name2 = "Sarah";
		String email2 = "sarah.testemail.com";
		String phone2 = "93474934";
		
		// Actions, activities, behaviors
		//  System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		}
	// Enhance by adding functions to minimize code
     static void walking(String name) {
		System.out.println(name + " is walking");
*/
	}

}
