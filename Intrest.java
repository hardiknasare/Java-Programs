//3:Find the compound amount and compound interest on the principal
//Rs.20,000 borrowed at 6% compounded annually for 3 years.

public class Intrest {
	public static void main(String[] args)
	{
		int principle = 20000,time=3, rate = 6;
		float totalAmount, compIntrest;
		
		totalAmount = principle * ( (1+0.06f) * (1+0.06f) * (1+0.06f) )  ;
		compIntrest = totalAmount-principle; 
		System.out.println("Total Compund amount : "+totalAmount);
		System.out.println("Compound Intrest : "+compIntrest);
	}

}
