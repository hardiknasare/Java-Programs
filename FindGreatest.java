//15:Write a program to find greatest of three numbers
//using nested if-else.

import java.util.Scanner;

public class FindGreatest {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number :");
		num1=input.nextInt();
		System.out.print("Enter second number :");
		num2=input.nextInt();
		System.out.print("Enter third number :");
		num3=input.nextInt();
		
		if(num1>=num2)
			{ 
			if(num1>=num3)
			System.out.println(num1+" is greatest among all.");
			else
			System.out.println(num3+" is greatest among all.");
			}
		else
		{
			if(num2>=num3)
				System.out.println(num2+" is greatest among all.");
				else
				System.out.println(num3+" is greatest among all.");
		}
			
		input.close();
	}

}
