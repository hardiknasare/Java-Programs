//5:Write a program to  merge two arrays into a single array.

import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size1,size2;
		
		System.out.print("Enter Array1 size : ");
		size1=input.nextInt();
		System.out.print("Enter Array2 size : ");
		size2=input.nextInt();
		int size3 = size1 + size2 ;
		
		int arr1[ ] = new int[ size1 ];
		int arr2[ ] = new int[ size2 ];
		int arr3[ ] = new int[ size3 ];
		
		for(int index = 0; index <arr1.length;index++) {
			System.out.print("Enter Array1 Element : ");
			arr1[ index ] = input.nextInt();
		}
		System.out.println();
		for(int index = 0; index <arr2.length;index++) {
			System.out.print("Enter Array2 Element : ");
			arr2[ index ] = input.nextInt();
		}
		
		for(int index = 0; index <arr1.length;index++) {
			arr3[ index ] = arr1[ index ];			
		}
		for(int index = size1,element=0; index <arr3.length;index++,element++) {
			arr3[ index ] = arr2[ element ];			
		}
		
		
		System.out.println("Array1 Elements are :"+Arrays.toString(arr1));
		System.out.println();
		System.out.println("Array2 Elements are :"+Arrays.toString(arr2));
		System.out.println();
		System.out.println("Array3 Elements are :"+Arrays.toString(arr3));
		System.out.println();
		
		input.close();
	}

}
