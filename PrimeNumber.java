//8:Check if number is a prime number or not.

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num,i=2;
	boolean flag = false;
	System.out.print("Enter number to check whether it is prime number or not :");
	num=input.nextInt();
		
	for(; i < num/2 ; i++) {
		   if(num%i == 0) {
		         flag = true;
		         break;
		      }
		   }
		
	if(flag == false)
		System.out.println("It is prime number.");
	else
		System.out.println("It is composite number.");
	input.close();
	}

}
