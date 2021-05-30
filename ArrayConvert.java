//7:Write a java program to convert char array into String.

import java.util.Arrays;
import java.util.Scanner;
public class ArrayConvert {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		String letter = " ";
		System.out.print("Enter no. of characters you want to enter :");
		size=input.nextInt();
		System.out.println();
		char arr[] = new char[ size ];
		for(int index=0;index<arr.length;index++) {
			System.out.print("Enter characters :");
			arr[ index ] = input.next().charAt(0);
		}
		System.out.println();
		System.out.println("Input Character Array : "+Arrays.toString(arr));
		
		for(int element=0 ; element<arr.length;element++) {
			letter += arr[ element ];
		}
		System.out.println();
		System.out.println("String : "+letter);
		input.close();
	}

}
