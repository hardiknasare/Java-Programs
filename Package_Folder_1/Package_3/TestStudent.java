package Package_3;

import Package_2.Batch;
import Package_1.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		Batch B1 = new Batch();
		Student S1 = new Student();
		
		B1.acceptBatchInfo();
		
		//B1.batchName = 'A';   private member is not accessible
			
		B1.displayRecord();
		
		System.out.println();
		S1.acceptRecord();
		System.out.println();
		
		S1.rollNo = 29;   //Roll No is public 
		
		S1.displayRecord();
		
	}

}
