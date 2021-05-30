package Package_2;

import java.util.Scanner;
public class Batch {
	private char batchName;
	
	public void acceptBatchInfo()
	{
		Scanner input1 = new Scanner(System.in);

		System.out.print("Enter Batch: ");
		
		this.batchName = input1.next().charAt(0);
		
	}
	public void displayRecord() {
		
		System.out.println("Batch : "+batchName);
		
	}

}
