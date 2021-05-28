//12: Write a  program to enter a number and print its reverse.

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num,n,reverse=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to print its reverse : ");
		num=input.nextInt();
		
		while(num!=0)
		{
			reverse= (reverse * 10) +(num%10);
			num/=10;
		}
		System.out.println("Reverse is "+reverse);
		input.close();
	}

}
