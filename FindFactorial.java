//6:Write a program to find factorial of a given number.

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
	int num,result=1;	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number to display its factorial :");
	num=input.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		result*=i;      

	}
	
	System.out.println("Result : "+result);
	input.close();
	}

}
