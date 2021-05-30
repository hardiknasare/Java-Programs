package Package_1;

import Package_1.Customer;
import java.util.Scanner;
public class TestCustomer {
	
	public static void main(String[] args) {
		double newcredit;
		Scanner input=new Scanner(System.in);
		Customer C1 = new Customer();
		Customer C2 = new Customer();
		
		System.out.println("Customer 1 Details :");
		C1.acceptRecord();
		System.out.println();
		C1.showDetails();
		System.out.println();
		System.out.println("Customer 2 Details :");
		C2.acceptRecord();
		C2.showDetails();
		System.out.println();
		
		System.out.println("Changing Credit Limit---------");
		System.out.print("Enter new Credit Limit :");
		newcredit=input.nextDouble();
		C2.setCreditLimit(newcredit);
		System.out.println("New Credit Limit : "+C2.getCreditLimit());
		input.close();
	}
	
}

