//4.Write a function /method which takes variable no of int numbers as an argument
//and returns the sum of these arguments as an output.

import java.util.Scanner;
import java.util.Arrays;
public class MethodSum {
	private static int sumArray(int... arr) {
			int sum=0;
			for(int index=0;index<arr.length;index++) {
				sum+= arr[index];
			}

		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size,sum ;
		System.out.print("Enter Array Size :");
		size=input.nextInt();
		
		int arr[ ] = new int[ size ];
		
		for(int index = 0; index<arr.length;index++) {
			System.out.print("Enter Array Elements :");
			arr[ index ] = input.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
		
		sum=MethodSum.sumArray(arr);
		
		System.out.println("Sum :"+sum);
		
		
		input.close();
	}

}
