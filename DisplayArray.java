//5:Write a program to accept array of 5 numbers and display it.

import java.util.Scanner;
public class DisplayArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index;
		int arr[ ] = new int[ 5 ];
		
		for(index =0;index<arr.length;++index)
		{
			System.out.print("Enter Array element : ");
			arr[ index ]= input.nextInt();
		}
		
		for(int element : arr) {
			System.out.println("Array elements are :"+element );
		}
		
		input.close();
	}

}
