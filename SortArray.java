//6:Write a java program to sort array.

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
	

	public static void main(String[] args) {
		int size;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array size :");
		size=input.nextInt();
		
		int arr[ ] = new int[ size ];
		
		for(int index=0;index<arr.length;index++) {
			System.out.print("Enter Array Elements :");
			arr[ index ] = input.nextInt(); 
		}
		System.out.println();
		System.out.println("Unsorted Array Elements are :"+Arrays.toString(arr));
		
		for(int count=0;count<arr.length;count++) {
		for(int index=0;index<arr.length-1;index++) {
			if(arr[index]>arr[index+1]) {
			
				int temp = arr[index];
				arr[ index ] = arr[ index+1 ];
				arr[ index+1 ] =temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted Array Elements are :"+Arrays.toString(arr));
		input.close();

	}

}
