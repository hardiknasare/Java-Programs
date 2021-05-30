/*Problem Statement 4:
->Create a java application for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

4.1 Supply a parameterized constructor to accept all details from user

4.2 Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25,creditLimit=10000
(Must use constructor chaining)

4.3 Write a method , getDetails to return String form of customer name & credit limit only.
4.4 Supply getter & setter for creditLimit.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

4.5 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers using 2 different constructors(4.1 : customer1 ,4.2 : customer2)
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.  */


package Package_7;

public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditlimit;
	
	public Customer(String name, String email, int age, double creditlimit) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditlimit = creditlimit;
		
		System.out.println("In Parameterized Customer: "+name+"  "+email+"  "+age+"  "+creditlimit);
		
	}

	public Customer() {
		name= "Hardik";
		email = "hardik@vardan.com";
		age = 23;
		creditlimit = 65000.00;
		System.out.println("In Parameterless Customer: "+name+"  "+email+"  "+age+"   "+creditlimit);

	}

	public void setCreditlimit(double creditlimit) {
		
		this.creditlimit = creditlimit ;	
		
	}
	
	public double getCreditlimit() {
		return creditlimit;
	}

}


