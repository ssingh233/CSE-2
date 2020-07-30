package recursion;

public class NaiveReverse {

	
	public String reverse1 (String s) {
		return s;
	}
	
	
	public String reverse2 (String s) {
		return (s.substring(1,2) + s.substring(0,1));
	}
	
	
	public String reverse3 (String s) {
		return (s.substring(2,3) + s.substring(1,2) + s.substring(0,1));
	}
	
	public String reverse6 (String s) {
		//return "abcdefg ";
		//how to do reverse 6 length string
	return 	s.substring(5,6) +
		    s.substring(4,5) +
		    s.substring(3,4) +
		    s.substring(2,3) +
			s.substring(1,2) +
			s.substring(0,1);
	} 
	
	public String reverse8 (String s) {
		   String partial = reverse8(s.substring(1,8));
		   String firstLetter = s.substring(0,1);
		   return (firstLetter + partial);
	
		
	}
	
	public String reverse9 (String s) {
		   String partial = reverse8(s.substring(1,9));
		   String firstLetter = s.substring(0,1);
		   return (firstLetter + partial);
			  
			}

}

