package Package_8;
import Package_7.Customer;

import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Customer C1 = new Customer();
		System.out.println();
		Customer C2 = new Customer("Parth","parth@gmail.com", 20, 55000.00);
		System.out.println();
		
		System.out.print("Enter new Credit Limit :");
		double creditLimit = input1.nextDouble();
		
		C2.setCreditlimit(creditLimit);
		System.out.println("New Credit Limit: "+C2.getCreditlimit());
	}

}
