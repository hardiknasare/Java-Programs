/*Create a Customer class , with data members (all private : tight encapsulation) name(String),
email(String),age(int).Supply a parameterized constructor to accept all details from user.
Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25.
Write a method displayCustomer to display customer details.*/

import java.util.Scanner;

public class Customer {
	
	private String name;
	private String email;
	private int age;
	
	Scanner input = new Scanner(System.in);
	public Customer(String name,String email,int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public Customer() {
		this.name = "Riya";
		this.email = "riya@gmail.com";
		this.age = 25;
	}
	public void acceptCustomer() {
		
		System.out.print("Enter Name : ");
		this.name = input.nextLine();
		System.out.print("Enter Email: ");
		this.email = input.next();
		System.out.print("Enter Age : ");
		this.age= input.nextInt();
		input.close();
	}

	public void displayCustomer() {
		System.out.println("Name :"+this.name);
		System.out.println("Email :"+this.email);
		System.out.println("Age :"+this.age);
	}
	
	public static void main(String[] args) {
		
		Customer C1 = new Customer();
		
		C1.acceptCustomer();
		System.out.println();
		C1.displayCustomer();
		
	}

}

