//7:Write a Java program , accept array ,accept number from user and
//find the index of number in array if present else show message not exist.

import java.util.Scanner;
public class SearchArray {
	
		public static void main(String[] args) {
		int size=1,num;
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array size :");
		size=input.nextInt();
		int arr[ ] = new int[ size ];
		
		for(int index = 0; index<arr.length ; index++ ) {
			System.out.print("Enter Array elements :");
			arr [index ] = input.nextInt();
		}
		
		System.out.print("Enter number to Search :");
		num=input.nextInt();
		
		for(int index = 0; index<arr.length ; ++index ) {
			
			if(num==arr[ index ]) {
				flag = true;
				break;
			}
			else 
				flag = false;						
		}
		if(flag==true) 
			System.out.println("Number is exist");
		else
			System.out.println("Number is not exist");
		
		input.close();
		}
		
}
