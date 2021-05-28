// Check whether the number is palidrome or not

import java.util.Scanner;
public class PalidromeNumber {

	public static void main(String[] args) {
		int num,n,reverse=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		n = input.nextInt();
		num=n;
		
		while(n!=0)
		{
			reverse = (reverse * 10 ) + (n % 10);
			n /= 10;
		}
		
		if(num==reverse)
			System.out.println("It is palidrome number.");
		else
			System.out.println("It is not palidrome number.");
		input.close();
	}

}
