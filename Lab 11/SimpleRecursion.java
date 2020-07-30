package recursion;

/*  This recursive method is a slightly augmented 
	version of the program in the last step: it only makes a recursive
	call under certain conditions.   There are three calls that print to the 
	console.  See if you can predict what will get printed and in what order.
 */
public class SimpleRecursion {

	
	// version 1
	public static void recur1(int k) { //recur calls itself by itself (call by itself)
		System.out.println("Entering recur with k = " + k);
		if (k <= 3) { //check k if is less than or equal to 3
			System.out.println("Recursing with k = " + k);
			recur1(k + 1); //returns back to (int k) which replaces it to 1
			//keeps repeating till k == 4
		        //recur stays
		} // continues on to s.o.p statements and it reverses the output
		System.out.println("Leaving recur with k = " + k); 
	}


 
	//version 2
	public static void recur2 (int k) {
		System.out.println ("count = " + k);
		if (k != 5) {
			recur2 (k+1);
		}
	}
	
	// version 3
	public static void recur3 (int k) {
		if (k == 5) {
			System.out.println ("count = " + k);
			recur3 (k+1);
		}
	}

	// version 4
	public static void recur4 (int k) {
		if (k < 5) {
			System.out.println ("count = " + k);
			recur4 (k+1);
		}
	}

	// version 5
	public static void recur5 (int k) {
		System.out.println ("count = " + k);
		if (k == 5) {
			recur5 (k+1);
		}
	}
	
	// version 6
	public static void recur6 (int k) {
		if (k != 5) {
			System.out.println ("count = " + k);
			recur6 (k+1);
		}
	}
	

	public static void main(String[] args) {
		recur1(0);
		recur2(0);
		recur3(0);
		recur4(0);
		recur5(0);
		recur6(0);
		
	}
}
