//4:Write functions for making addition of different types
//(use FunctionOverloading);

import java.util.Scanner;
public class Overload {
	
	public static void add() {
		
		System.out.println("Adding");
	}
	public static void add(int num1, int num2) {
		
		System.out.println("sum :"+(num1+num2));
	}
	public static void add(float num1, float num2) {
		
		System.out.println("sum :"+(num1+num2));
	}
	public static void add(double num1, double num2) {
		
		System.out.println("sum :"+(num1+num2));
	}
	public static void add(int num1, float num2,double num3) {
		
		System.out.println("sum :"+(num1+num2+num3));
	}

	public static void main(String[] args) {
		int num1,num2;
		float num3,num4;
		double num5,num6;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Num1 : ");
		num1=input.nextInt();
		System.out.print("Enter Num2 : ");
		num2=input.nextInt();
		System.out.print("Enter Num3 : ");
		num3=input.nextFloat();
		System.out.print("Enter Num4 : ");
		num4=input.nextFloat();
		System.out.print("Enter Num5 : ");
		num5=input.nextDouble();
		System.out.print("Enter Num6 : ");
		num6=input.nextDouble();
		
		add();
		add(num1,num2);
		add(num3,num4);
		add(num5,num6);
		add(num1,num3,num5);
		
		
		input.close();

	}

	

}
