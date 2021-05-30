/*Problem STatement3 
3->Create Date Class with Data Members day,month, year

3.1:
Create an object and initialize it using mutator methods and accesses it using
accessor methods. Print the date.

3.2
Create two objects and initialize them using no-argument and parameterized
constructor respectively. Print the date.  */


package Package_6;

public class Date {
	private  int day;
	private int month;
	private int year;
	

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	public Date() {
		this.day = 29;
		this.month = 05;
		this.year = 1998;
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		Date D1 = new Date();
		
		D1.setDay(15);
		D1.setMonth(8);
		D1.setYear(1947);
		
		System.out.print("Date using Mutators method: ");
		System.out.println(D1.getDay()+"/"+D1.getMonth()+"/"+D1.getYear());
		
		System.out.println();
		
		Date D2 = new Date();
		System.out.print("Date using Default Constructor: ");
		System.out.println(D2.getDay()+"/"+D2.getMonth()+"/"+D2.getYear());
		
		System.out.println();
		
		Date D3 = new Date(17,05,2021);
		System.out.print("Date using Parameterozed Constructor: ");
		System.out.println(D3.getDay()+"/"+D3.getMonth()+"/"+D3.getYear());
	}
	
}
