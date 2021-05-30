//1:Write a function to accept array of string.
//Display all elements in uppercase.

import java.util.Scanner;

public class UppercaseString {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.print("Enter size : ");
		size = input.nextInt();
		String arr[ ] = new String[ size ];
		
		for(int index = 0;index<arr.length;index++) {
		System.out.print("Enter character : ");
		arr [ index ] = input.next();
		}
			
		for(int index = 0; index < arr.length; index++) {
			System.out.println("Character in UPPER CASE : "+arr[ index].toUpperCase()); 
		}
		
		input.close();
	}

}
