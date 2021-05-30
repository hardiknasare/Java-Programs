// 6:Write a program which read array of 5 elements and print reverse array.

import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[ ] = new int[ 5 ];
		
		for(int index = 0; index< arr.length; index++ ) {
			System.out.print("Enter Array element : ");
			arr[ index ] = input.nextInt();
		}
		
		System.out.println("Array in reverse ......");
		
		for(int index=arr.length-1;index>=0;index--) {
			System.out.println("Array elements are: "+arr[ index ]);
		}
		
		
		input.close();
	}

}
