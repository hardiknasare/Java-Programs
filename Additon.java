//2:Write a program to addition of two numbers also 
//addition of two characters.

import java.util.Scanner;
public class Additon {
	public static void main(String[] args)
	{
		int num1,num2;
		char ch1,ch2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1 = input.nextInt();	
		System.out.print("Enter second number : ");
		num2 = input.nextInt();
		System.out.println("Addition of number : "+(num1+num2));
		System.out.print("Enter first character : ");
		ch1=input.next().charAt(0);
		System.out.print("Enter second character :");
		ch2=input.next().charAt(0);
		System.out.println("Addition of character :"+(ch1+ch2));
		input.close();
		
	}
}
