/*Problem Statement 1
1.1:Create 2 classes Student and Batch. Student class is in pack1 and Batch class is in pack2. 
Write accept() and  display() method in both the class to accept and to display info.
Write a Test class to print Student and Batch
information.
1.2:Use the Student and Batch classes created earlier. It should contain
public  rollNo,Public  Name, private  Grade and default  totalMarks attributes and using Batch
class, check accessibility of there attributes in same package .
1.3:
Create new package pack3.
create class testStudent in pack3;
create object of Student class from pack1 and access methods.Try to check accessibility.*/

package Package_1;

import java.util.Scanner;

public class Student {
	
	public int rollNo;
	public String name;
	private char grade;
	int totalMarks;

	
	public void acceptRecord() {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter Roll No :");
		rollNo=input.nextInt();
		input.nextLine();
		System.out.print("Enter Name :");
		name=input.nextLine();
		System.out.print("Enter TotalMarks out of 100 :");
		totalMarks=input.nextInt();
		
	}

	public void displayRecord() {
		
		System.out.println("Roll No : "+this.rollNo);
		System.out.println("Name : "+this.name);
		
		if(totalMarks>=80) 
			this.grade = 'A';
		else 
			if(totalMarks>=60 && totalMarks<80)
				this.grade = 'B';
			else
				this.grade = 'C';
		
		System.out.println("Grade : "+this.grade);
		System.out.println("Total Marks : "+this.totalMarks);

	}
	
}
	
