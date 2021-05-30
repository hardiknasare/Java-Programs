/*9:Create Date class with  data members day,month,year.create getter setter for data members.
Write display function to display date. */

import java.util.Scanner;

public class Date {
	private int day,year;
	String month;
	Scanner input = new Scanner(System.in);
	
	public int getDay() {
		return day;
	}
	
	public String getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public void displayDate() {
	System.out.println("Date :  "+day+"/"+month+"/"+year);
		
	}
	
	public static void main(String[] args) {
		
		Date d1 = new Date();
		
		d1.setDay(2);
		d1.setMonth("June");
		d1.setYear(2020);
		
		System.out.println(d1.getDay()+" / "+d1.getMonth()+" / "+d1.getYear());
		
		System.out.println();
		d1.displayDate();
	}

	

}
