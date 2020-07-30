import java.util.Scanner;

public class Shop {

	public static void Shop(String []names, double []price, int []amount, double drate, Scanner input){
		
		int f = 0;
		int items = 0;
		double damount = 0.0;
		drate = 0.0;
		boolean shop = false;
		boolean item = false;
		boolean buy = false; 
		
		while (true) {
			System.out.println("");
			System.out.println("This program supports 4 functions: ");
			System.out.println("1. Setup Shop ");
			System.out.println("2. Buy ");
			System.out.println("3. List Items ");
			System.out.println("4. Checkout ");
			System.out.print("Please choose the function you want: ");
			
			
			f = input.nextInt();
			
			if (f > 4){
				System.out.println("");
				System.out.print("Error Check Again");	
			}
			
		if (!buy && !shop && f > 1&& f < 5){
			System.out.println("Shop is not setup yet.!");		
		}
		if (f == 1){
			System.out.println("");
			System.out.print("Please enter the number of items: ");
			
			items = input.nextInt();
			
			for (int i= 0; i< items; i++){
				System.out.println("");
				System.out.print("Enter name of product " +i+ ":" );
				
				
				names [i]= input.next();
				System.out.println("");
				System.out.print("Enter price of product " +i+" : ");
				
				price [i]= input.nextDouble();
				}
			System.out.println("");
			System.out.print("Please enter the amount to qualify for discount: ");
			damount = input.nextDouble();
			
			System.out.println("");
			System.out.print("Please enter the discount rate(0.1 for 10%): ");
			drate = input.nextDouble();
			
			shop = true;
			
		}
		
		if (!buy && !item && shop && f > 2&& f < 5){
			
			System.out.println("");
			System.out.print("Try again: You have not bought anything");
			
			shop = true;
			
			
		}
		
		if (shop && f == 2){
			getamount(input,names,amount,items,shop);
			
			shop = true;
			buy = true;
			item = true;			
		}
		
		if (buy && shop && f == 3)	{
			itemlist(names, price, amount, items, buy);
			
			shop = true;
			buy = true;
		}
		if (item && shop && f ==4) {
			checkout(subTotal(price, amount, items), discount(subTotal(price, amount, items), drate, damount),item);
		
			shop = false;
			buy = false;
			break;
		}
	}
}
		public static void getamount(Scanner input, String [] names, int [] amounts, int items, boolean shop){
			for (int i= 0; i< items; i++){
				if (shop){
					System.out.println("");
					System.out.print("Enter the amount of "+names[i]+":");
					
					amounts[i] = input.nextInt();
				}
			}
		}
		
		public static void itemlist (String[] name, double [] prices, int [] amounts, int items, boolean buy){
			
			for (int i= 0; i< items; i++){
				if (amounts[i]> 0 && buy){
					System.out.println("");
					System.out.print(amounts[i] + " count of " + name[i]+ " @ " + prices[i] + " = " + amounts[i] * prices [i]);
					System.out.println("");
				}
		}
	}
		public static double subTotal (double [] prices, int [] amounts, int items){
			double total = 0.0;
				for (int i=0; i< items; i++){
					total += amounts [i] * prices [i];		
				}
		return total;
	
		}
		public static double discount (double subTotal, double drate, double damount){
			
			double discount = 0.0;
				
				if (damount <= subTotal){
					discount = subTotal * drate;
				}
			return discount;
		
		
		}
		
		public static void checkout (double subTotal, double discount, boolean item) {
			if (item == true){
				System.out.println("");
			System.out.println("Thanks for coming!");
			System.out.println("Sub Total: " + subTotal);
			System.out.println("-Discount: " + discount);
			System.out.println("Total: " + (subTotal - discount));
				
			}
		}
		
		
	public static void main(String[] args) {
	
		int items = 1000;
		String[] names = new String [items];
		double[] prices = new double [items];
		int [] amount = new int [items];
		
		Scanner input = new Scanner (System.in);
		
		Shop (names, prices, amount, items ,input);
		
		boolean shop = false;
		getamount(input, names, amount, items, shop);
		
		boolean buy = false;
		
		itemlist (names, prices, amount, items, buy);
		
		subTotal  (prices, amount, items);
		
		double damount = 0.0;
		double drate = 0.0;
		
		discount (subTotal(prices, amount, items), drate, damount);
		boolean item = false;
		
		checkout(subTotal(prices, amount, items),discount(subTotal(prices, amount, items), drate, damount), item);
	}

	}



	