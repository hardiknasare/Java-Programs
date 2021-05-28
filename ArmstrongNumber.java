//14:Write a program to check entered number is Armstrong number or not.

import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args)
	{
	 int c=0,a,temp;  
	 int num;
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter number to check Armstrong number or not : ");
	 num=input.nextInt();
	 
	 temp=num;  
	 
	 while(num>0)  
	 {  
	    a=num%10;  
	    num=num/10;  
	    c=c+(a*a*a);  
	 }  
	 if(temp==c)  
	    System.out.println("It is armstrong number");   
	 else  
	    System.out.println("It is not armstrong number");   
	 input.close();
	 }  
}
