package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		testModNCounter();
		
		testModNCounter2();
		
		testSeason();
	}


	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		System.out.println(c.value());

		System.out.println("-- test for counter of value 3");
		Counter three = new Counter();
		for (int i = 1; i< 4; i++){
			three.increment();
		}
		System.out.println(three.value());
	}



	// Use this method to complete exercise 1c
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		c.increment();
		c.increment();
		c.increment();
		c.reset();
		c.increment();
		c.increment();
		c.increment();
		System.out.println("current value: " + c.value());
	}
	
	public static void testModNCounter(){
		System.out.println();
		System.out.println("Test for testModNCounter");
		
		ModNCounter c = new ModNCounter (2);
		System.out.println (c.value ( )); 
		c.increment ( );
		System.out.println (c.value ( ));
		c.increment ( );
		System.out.println (c.value ( ));
		c.increment ( );

}
	public static void testModNCounter2(){
		System.out.println();
		System.out.println("Test for testModNCounter2");
		
		ModNCounter2 d = new ModNCounter2(2);
		System.out.println(d.value());
		d.increment();
		System.out.println(d.value());
		d.increment();
		System.out.println(d.value());
		d.increment();
}
	public static void testSeason(){
		System.out.println();
		System.out.println("Test for Season");
		
		SeasonCounter d = new SeasonCounter();
		System.out.println(d.toString());
		d.increment();
		System.out.println(d.toString());
		d.increment();
		System.out.println(d.toString());
		d.increment();
		System.out.println(d.toString());
		d.increment();
		System.out.println(d.toString());
		
	}
}