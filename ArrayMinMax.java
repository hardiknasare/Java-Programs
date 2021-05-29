//8:Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
	public static int getMaxValue(int[] arr) {
		int maxvalue = arr[0];
		for(int index = 0;index<arr.length;index++) {
			if(arr[index]>maxvalue)
				maxvalue=arr[index];
		}
		
		return maxvalue;
	}
	public static int getMinValue(int[] arr) {
		int minvalue=arr[ 0 ];
		for(int index=0;index<arr.length;index++) {
			if(arr[ index ] < minvalue)
				minvalue = arr[ index ];
		}
		
		return minvalue;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.print("Enter array size :");
		size=input.nextInt();
		int arr[ ] = new int [ size ];
		
		for(int index=0;index<arr.length;index++) {
			System.out.print("Enter Array elements :");
			arr[ index ] = input.nextInt();
		}
		
		System.out.println("Array elements are : "+Arrays.toString(arr));
		
		int maxvalue = getMaxValue(arr);
		System.out.println("Maximum Value : "+maxvalue);
		
		
		int minvalue = getMinValue(arr);
		System.out.println("Minimum Value : "+minvalue);
		
		input.close();
	}
}