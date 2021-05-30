package Package_5;

import Package_4.Employee;
public class TestEmployee {
	public static void main(String[] args) {
		
		
		Employee emp[ ] = new Employee[ 5 ];
		
		for(int index=0; index<emp.length; index++)
		{	
			emp[ index ]= new Employee();
			System.out.println("");
			System.out.println("Enter Employee details: ");
			emp[index].acceptRecord();
		}
		
		for(int index=0; index<emp.length; index++)
		{
			System.out.println();
			System.out.println("Employee "+(index+1)+"==>");
			System.out.println();
			emp[index].displayRecord();
		}
		
		System.out.println();
		System.out.println("Employees with 20000+ Salary==> ");
		System.out.println();
		for(int index=0; index<emp.length; index++)
		{	
			if(emp[index].getSalary()>20000)
			{
				System.out.println(emp[index].getEmpId()+"\t"+emp[index].getName());
				System.out.println();
			}
		}
	
		
	}
	
	
	
}
