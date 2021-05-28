////5:Write a program to swap two numbers.

import java.util.Scanner;

public class NumSwap {
	public static void main(String[] args)
	{
		int num1, num2,temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number num1 :");
		num1=input.nextInt();
		System.out.print("Enter second number num2 :");
		num2=input.nextInt();
		System.out.println("Before swapping num1 = "+num1+" num2 ="+num2);
		
		temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping num1 = "+num1+" num2 ="+num2);
		input.close();
	}

}
