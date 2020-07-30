package oop;

public class SeasonCounter extends ModNCounter {

	private static String[] names =  {"spring", "summer", "fall", "winter"};
	
	
	public SeasonCounter() {
        // fill-in by creating an object with 4 divisor
		
ModNCounter d =	new ModNCounter(4);
    }
	

	
	








	@Override
	public String toString() {
        // fill-in so it returns the season name
		return names[value()];
	}
	
	
  	
}
