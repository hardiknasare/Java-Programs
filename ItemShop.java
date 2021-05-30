/* :Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 
 * 	3:NoteBook 4:Bottle 5:ColorBox.
	1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and
 	ColorBox is at 50 Rs.	
	Calculate Total of all purchased items.  */

import java.util.Scanner;
public class ItemShop {
	private static void stationaryMenuList(String[] args) {
		
		System.out.println("0. Exit");
		System.out.println("1. Pen (10 Rs) ");
		System.out.println("2. Pencil (5 Rs)");
		System.out.println("3. Notebook (20 Rs)");
		System.out.println("4. Bottle (30 Rs)");
		System.out.println("5. ColorBox (50 Rs)");
		System.out.println("------------------------");
		
	}
	public static void main(String[] args) {
		boolean flag= true;
		int choice = 0;
		Scanner input = new Scanner(System.in);
		
		ItemShop.stationaryMenuList(args);
		System.out.print("Enter Choice to Purchase : ");
		
		while(flag!=false)
		{
			
			choice=input.nextInt();
			switch(choice)
			{
			
			case 1:
				int total=0;
				System.out.print("Enter number of Pen :");
				int numpen=input.nextInt();
				for(int i=0;i<numpen;i++)				
					total+=10;
				System.out.println("Total Amount= "+total);
				System.out.print("Enter Choice to Purchase : ");
				break;
			
			case 2:
				int total1=0;
				System.out.print("Enter number of Pencil :");
				int numpens=input.nextInt();
				for(int i=0;i<numpens;i++)
					total1+=5;
				System.out.println("total amt= "+total1);
				System.out.print("Enter Choice to Purchase : ");
				break;
			
			case 3:
				int total2=0;
				System.out.print("Enter number of Notebook :");
				int numnot=input.nextInt();
				for(int i=0;i<numnot;i++)
					total2+=20;

				System.out.println("total amt= "+total2);
				System.out.print("Enter Choice to Purchase : ");
				break;
			
			case 4:
				int total3=0;
				System.out.print("Enter number of Bottle :");
				int numbott=input.nextInt();
				for(int i=0;i<numbott;i++)
					total3+=30;
				System.out.println("total amt= "+total3);
				System.out.print("Enter Choice to Purchase : ");
				break;
			
			case 5:
				int total4=0;
				System.out.print("Enter number of ColorBox :");
				int numcol=input.nextInt();
				for(int i=0;i<numcol;i++)
					total4+=50;
				System.out.println("Total Amount= "+total4);
				System.out.print("Enter Choice to Purchase : ");
				break;

			case 0:
				flag=false;
				break;
				
			default:
				System.out.print("Wrong Option.");
				System.out.print("Enter Choice to Purchase : ");
				break;
			}
			
				
		}
		System.out.println("Thank You! Visit Again.");
		input.close();
	}

}