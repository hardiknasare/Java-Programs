/*2:Write a program which will accept student information like
 * rollno,name,5 subject marks.calculate total and percentage.
 * calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C */

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		int rollno,sub1,sub2,sub3,sub4,sub5;
		String name;
		float percentage,totalMarks;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Roll no :");
		rollno = input.nextInt();
		input.nextLine();
		System.out.print("Enter your Name :");
		name = input.nextLine();
		System.out.print("Enter English marks out of 100:");
		sub1=input.nextInt();
		System.out.print("Enter Maths marks out of 100:");
		sub2=input.nextInt();
		System.out.print("Enter Science marks out of 100:");
		sub3=input.nextInt();
		System.out.print("Enter History marks out of 100:");
		sub4=input.nextInt();
		System.out.print("Enter Geography marks out of 100:");
		sub5=input.nextInt();
		totalMarks=sub1+sub2+sub3+sub4+sub5;
		
		percentage= (totalMarks/500)*100;
		System.out.println();
		System.out.println("Name : "+name);
		System.out.println("Roll no : "+rollno);
		System.out.println("Total Marks of all subjects : "+totalMarks);
		if(percentage>=75 && percentage<=100)
		{
			System.out.printf("Percentage obtained : %.2f\n",percentage);
			System.out.println("Grade obtained : A");
		}
		else if(percentage<=74 && percentage>=60)
		{	
			System.out.printf("Percentage obtained : %.2f\n",percentage);
			System.out.println("Grade obtained : B");
			
		}
		else 
		{	
			System.out.printf("Percentage obtained : %.2f\n",percentage);
			System.out.println("Grade obtained : C");
			
		}
		
		input.close(); 
	}

}
