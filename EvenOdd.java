//11:Write a  program to find sum of all even and odd numbers between 
//1 to n.

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int startnum=0,endnum,evensum=0,oddsum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the num upto which even and odd num. sum is to display :");
		endnum=input.nextInt();
		
		for(;startnum<=endnum;startnum++)
		{
			if(startnum%2==0)
				evensum+=startnum;
			else
				oddsum+=startnum;
		}
		System.out.println("Sum of all even numbers is : "+evensum);
		System.out.println("Sum of all odd numbers is : "+oddsum);
		input.close();
	}

}
