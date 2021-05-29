/*Write a program to create an array of integers and perform following 
 operations on that array like finding the sum, average, maximum and
 minimum number in that array. Accept the numbers of the array from user.*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalci {
	public static void main(String[] args) {
		int size;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array Size :");
		size=input.nextInt();
		
		int arr[ ] = new int[ size ];
		
		for(int index=0;index<arr.length;index++) {
			System.out.print("Enter Array elements :");
			arr[ index ]= input.nextInt();
		}
		System.out.println("Array = "+Arrays.toString(arr));
		
		int arrsum=getArrSum(arr);
		System.out.println("Array Sum : "+arrsum);
		
		int arravg=getArrAvg(arr);
		System.out.println("Array Average : "+arravg);
		
		int maxvalue=getMaxValue(arr);
		System.out.println("Max Value :"+maxvalue);
		
		int minvalue=getMinValue(arr);
		System.out.println("Min Value :"+minvalue);
		
		input.close();
	}
	public static int getArrSum(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[ index ];
		}
		return sum;
		
	}
	private static int getArrAvg(int[] arr) {
		int average=0;
		average = (getArrSum(arr)/arr.length);
		return average;
	}

	private static int getMaxValue(int[] arr) {
		int maxvalue=arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[ index] > maxvalue)
				maxvalue=arr[ index ];
		}
		return maxvalue;
	}
	private static int getMinValue(int[] arr) {
		int minvalue=arr[ 0 ];
		for(int index=0;index<arr.length;index++) {
			if(arr[ index ] < minvalue)
				minvalue = arr [ index ];
		}
		return minvalue;
	}
}
