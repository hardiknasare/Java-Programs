//9:Sum of series :
//	1+2+3+….+n

import java.util.Scanner;
public class SumSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=0,result=0;
		System.out.print("Enter a number up to which sum to be print :");
		n=input.nextInt();
		
		for(;n>0;n--)
		{
		result +=n;		
		}
		System.out.println("Result :"+result);
		input.close();
	}

}
