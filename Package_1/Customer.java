
/*2:Create a java application for the following.
Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

2.1 Write acceptInfo() method to accept customer details:

2.2 Write a method , showDetails to display customer name & credit limit only.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

2.3 Create a TestCustomer class . Use scanner to accept user i/p.
Create 2 customers object.
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console. */






package Package_1;

import java.util.Scanner;

public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	Scanner input = new Scanner(System.in);
	void acceptRecord() {
		
		System.out.print("Enter Name : ");		
		this.name=input.nextLine();
		System.out.print("Enter Email: ");
		this.email=input.next();
		System.out.print("Enter Age : ");
		this.age=input.nextInt();
		System.out.print("Enter Credit Limit: ");
		this.creditLimit=input.nextDouble();
		
		
	}
	 void showDetails() {
		System.out.println("Name : "+this.name);
		System.out.println("Credit Limit :"+this.creditLimit);		
	}		
	 
	 public void setCreditLimit(double creditLimit) {
		 this.creditLimit=creditLimit;
	 }
	 public double getCreditLimit() {
		 return this.creditLimit;
	 }

}
