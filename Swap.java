//3:Write function to swap two numbers.

import java.util.Scanner;
public class Swap {
	public static void swap(int num1, int  num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping Num1 ="+num1+" Num2 ="+num2);
	}

	public static void main(String[] args) {
		int num1,num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		num1=input.nextInt();
		System.out.print("Enter num2 : ");
		num2=input.nextInt();
		System.out.println("Before Swapping Num1 ="+num1+" Num2 ="+num2);
		Swap.swap(num1,num2);
		input.close();

	}

}
