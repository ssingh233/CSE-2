package recursion;

public class Reverse {

	
	
	public String reverse (String s) {

		if (s.length() == 1 ) {

			return s;
			
		} else {
			String partial = reverse(s.substring(1,s.length()));
			   String firstLetter = s.substring(0,1);
			   return (partial + firstLetter);
		
			
		}
	}
	
	public static String allButFirst(String s) {
		return s.substring(1);
	}
	
	
	public static String allButLast(String s) {
		return s.substring(0, s.length());
	}	
}
