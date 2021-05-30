package Package_2;

import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter Emplyee Id: ");
		emp.setEmpId(input.nextInt());
		
		System.out.print("Enter Emplyee name: ");
		input.next();
		emp.setName(input.nextLine());
		
		System.out.print("Enter Basic salary: ");
		emp.setBasicSalary(input.nextDouble());
		
		System.out.print("Enter Medical: ");
		emp.setMedical(input.nextDouble());
		
		emp.setHRA(0.5 * emp.getBasicSalary());
		
		emp.setPF(0.12 * emp.getBasicSalary());
		
		emp.setPT(200);
		
		emp.setGrossSalary(emp.calcGrossSalary(emp.getBasicSalary(), emp.getHRA(), emp.getMedical()));
		emp.setNetSalary(emp.calcNetSal(emp.getGrossSalary(), emp.getPF(), emp.getPT()));
		
		System.out.println("---------------------------------------------");
		emp.displayDetails();
		input.close();
	}

}