package recursion;

public class Reverse17 extends Reverse16 {

	
	public String reverse17 (String s) {

		 String partial = reverse16(s.substring(1,17));
		   String firstLetter = s.substring(0,1);
		   return (partial + firstLetter);

	}

	
	public static String allButFirst(String s) {
		return s.substring(1);
	}
	
	
	public static String allButLast(String s) {
		return s.substring(0, s.length());
	}
	
	
	
	
	
	public static void main(String[] args) {
		Reverse17 obj = new Reverse17();
		System.out.println(obj.reverse17("disinterestedness"));
		System.out.println(obj.reverse17("uniformitarianism "));
		System.out.println(obj.reverse17("pseudohydrophobia"));
	}
	
}
