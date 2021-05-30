/* 3:Consider that payroll software needs to be developed for computerization of
operations of an ABC organization. The organization has employees.
3.1. Construct a class Employee with following members using private access
specifies:
 Employee Id integer
 Employee Name string
 Basic Salary double
 HRA double
 Medical double
 PF double
PT double
 Net Salary double
 Gross Salary double
Please use following expressions for calculations:
 * HRA = 50% of Basic Salary
* PF = 12% of Basic Salary
* PT = Rs. 200
3.2. Write methods to display the details of an employee and calculate the gross
and net salary.
* Gross Salary = Basic Salary + HRA + Medical
* Net Salary = Gross Salary – (PT + PF)

Create a TestEmployee Class.Create Object of employee class and assign values and display Details.*/


package Package_2;

public class Employee {
	private int EmpId;
	private String name;
	private double basic_salary;
	private double HRA;
	private double Medical;
	private double PF;
	private double PT;
	private double gross_salary;
	private double net_salary;
	
	public void setEmpId(int Empid) {
		this.EmpId=Empid;
	}
	
	public int getEmpId() {
		return this.EmpId;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBasicSalary(double basic_salary) {
		this.basic_salary=basic_salary;
	}
	
	public double getBasicSalary() {
		return this.basic_salary;
	}
	
	public void setHRA(double HRA) {
		this.HRA=HRA;
	}
	
	public double getHRA() {
		return this.HRA;
	}
	
	public void setMedical(double Medical) {
		this.Medical=Medical;
	}
	
	public double getMedical() {
		return this.Medical;
	}
	
	public void setPF(double PF) {
		this.PF=PF;
	}
	
	public double getPF() {
		return this.PF;
	}
	
	public void setPT(double PT) {
		this.PT=PT;
	}
	
	public double getPT() {
		return this.PT ;
	}
	
	public void setGrossSalary(double gross_salary) {
		this.gross_salary = gross_salary;
	}
	
	public double getGrossSalary() {
		return this.gross_salary;
	}
	
	public void setNetSalary(double net_salary) {
		this.net_salary = net_salary;
	}
	
	public double getNetSalary() {
		return this.net_salary ;
	}
	
	public double calcGrossSalary(double basic_salary,double HRA,double Medical)
	{
		double gross = basic_salary + HRA +Medical;
		return gross;
	}
	
	public double calcNetSal(double gross, double PT, double PF)
	{
		double net = gross - (PT + PF);
		return net;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee Id: "+getEmpId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Basic Salary: "+getBasicSalary());
		System.out.println("HRA: "+getHRA());
		System.out.println("Medical: "+getMedical());
		System.out.println("Provident Fund: "+getPF());
		System.out.println("Professional Tax: "+getPT());
		System.out.println("Gross Salary: "+getGrossSalary());
		System.out.println("Net Salary: "+getNetSalary());
	}
	
}
