package recursion;

public class DigitCount {

	public static void main(String[] args) {
	
		System.out.println(digitCount(0));
		System.out.println(digitCount(10));
		System.out.println(digitCount(314159));	
	}
	
	public static int digitCount (int value) {
		if (value == 0) {
			return 1;
		} else {
			return 1 + digitCount(value/10);
		} 
	}
}
