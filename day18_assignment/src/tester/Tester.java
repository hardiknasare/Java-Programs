package tester;

import java.util.Scanner;

import tasks.EvenPrinterTask;
import tasks.OddPrinterTask;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Start number and End number");
			int start = sc.nextInt();
			int end = sc.nextInt();
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "even_printer");
			Thread t2 = new Thread(new OddPrinterTask(start, end), "odd_printer");
			System.out.println("Starting child threads ");
			t1.start();
			t2.start();
			System.out.println(Thread.currentThread().getName()+" is waiting for childs to comlete exc");
			t1.join();
			t2.join();
			System.out.println(Thread.currentThread().getName()+" continued after child comleted exc");
			System.out.println("Main Over");
			
		}catch(Exception e) {
			System.out.println(e +" Error in "+Thread.currentThread().getName());
		}

	}

}
