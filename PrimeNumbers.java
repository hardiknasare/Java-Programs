//13:Write a program to print all Prime numbers between 1 to n.

import java.util.Scanner;

class PrimeNumbers{
	public static void main(String[] args) 
	{
		int i,count;
		System.out.print("Enter a number up to which prime nos. are to be print :");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("Prime numbers between 1 to "+n+" are ");
		
		for(int j=2;j<=n;j++)
			{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				count++;
			}
				if(count==2)
				System.out.print(j+"  ");     
			}
		input.close();
	}
		
}
