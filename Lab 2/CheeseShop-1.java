
package CheeseShop;
import java.util.Scanner;

public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("We sell three kinds od cheese");
		System.out.println("Dalaran Sarp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swss: $40.00 per pound");
		
		System.out.print("Enter the amount of Sharp:");
		int sharp= input.nextInt();
		
		System.out.print("Enter the amount of Brie:");
		int brie= input.nextInt();
		
		System.out.print("Enter the amount of Swiss:");
		int swiss= input.nextInt();
		
		System.out.print("Display the itemized list? (1 for yes)");
		int display= input.nextInt();
		
		if (display==1){
			System.out.println( sharp+" lbs of Sharp @ 1.25 = " + sharp*1.25);
			System.out.println(brie+" lbs of Brie @ $10.00 = " + brie*10);
			System.out.println(swiss + " lbs of Swiss @ $40.00 = " + swiss*40);
			}
		
		double subtotal =0;
		 subtotal= sharp*1.25 + brie*10 + swiss*40;
		 System.out.println("Sub Total: $" + subtotal);
		 
		 int discount= 10;
		 	if (subtotal >= 100){
				System.out.println("-Dicounts: $25.0");
				System.out.println("Total:" + (subtotal - 25));}
		 	
		 	else if (subtotal >= 50){
			System.out.println("- Discount: $10.0");
			System.out.println (" Total:" + (subtotal - discount));
			}
			
		 	else {
				System.out.println("-Discount: $0.0");
				System.out.println("Total:" + subtotal);}}
					
	//collaborators: David Philips
			
					
		
		 
		
		
		
		

	

}