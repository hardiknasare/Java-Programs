//7:Write a program to find m to the power n

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
	
		int m,n,i=0;
		long result=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base number :");
		m=input.nextInt();
		System.out.print("Enter the power number :");
		n=input.nextInt();
		for(;i<n;i++)
			result*=m;
		System.out.print(m+"^"+n+"=  "+result);
		input.close();
	}
	
}
