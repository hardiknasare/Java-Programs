//2:Write a Java program to accept 2D array elements. Display all elements.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDisplay2D {
	
	public static void main(String[] args) {
		int size ;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		size = input.nextInt();
		int arr[ ][ ] = new int[ size ][ size ];
		
		for(int row = 0; row < arr.length;row++) {
			for(int col = 0; col < arr[ row ].length; col++) {
				System.out.print("Enter array elements :");
				arr[ row ][ col ] = input.nextInt();
			}
		}		
		System.out.print("Array : "+Arrays.deepToString(arr));
		input.close();
	}
}
