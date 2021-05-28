import java.util.Scanner;

//4:Write a program to calculate power of a number. 

public class PowerCalci {
	public static void main(String[] args)
	{
		int i=0,num=0,power=0,result=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		num= input.nextInt();
		System.out.print("Enter power : ");
		power=input.nextInt();
		
		for(;i<power;i++)
			result*=num;
		System.out.println("Result = "+result);
		input.close();
	}
	
}
