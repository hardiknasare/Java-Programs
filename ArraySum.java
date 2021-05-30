//3:Write a java program to make the addition of two 2D array And store result in Third array.

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int arr1[][] = new int[2][2];

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.print("Enter First Array Elements  :");
				arr1[row][col] = input.nextInt();
			}
		}
		System.out.println();
		int arr2[][] = new int[2][2];

		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print("Enter Second Array Elements :");
				arr2[row][col] = input.nextInt();
			}
		}
		System.out.println();
		int arr3[][] = new int[2][2];

		for (int row = 0; row < arr3.length; row++) {
			for (int col = 0; col < arr3[row].length; col++) {
				arr3[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		System.out.println("First Array : ");
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.print(" " + arr1[row][col]);
			}
			System.out.println();
		}
		System.out.println("Second Array : ");
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(" " + arr2[row][col]);
			}
			System.out.println();
		}
		System.out.println("Addition of both Array : ");
		for (int row = 0; row < arr3.length; row++) {
			for (int col = 0; col < arr3[row].length; col++) {
				System.out.print(" " + arr3[row][col]);
			}
			System.out.println();
		}
		input.close();

	}

}
