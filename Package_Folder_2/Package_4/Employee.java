/*
Problem Statement 2:
2.1:Create Employee class with empid,name,address,salary.Use Getter Setters
2.2:create array of 5 employees...show all employees using for loop as well as for each loop...in same assignment
2.3:create array of 5 employees ...show those employee who are getting salary >20000. */


package Package_4;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private float salary;
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	


	public void acceptRecord() {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter EmpId : ");
		setEmpId(input.nextInt());
		System.out.print("Enter Name :");
		input.nextLine();
		setName(input.nextLine());
		System.out.print("Enter Address :");
		setAddress(input.next());
		System.out.print("Enter Salary :");
		setSalary(input.nextFloat());
		
	}

	public void displayRecord() {
		System.out.println("EmpId : "+getEmpId());
		System.out.println("Name : "+getName());
		System.out.println("Address :"+getAddress());
		System.out.println("Salaray :"+getSalary());
	
	}
	
}
