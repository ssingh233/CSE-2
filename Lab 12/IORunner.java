package io;

import java.util.ArrayList;

public class IORunner {

	
	public static void main(String[] args) throws FileNotFoundException {
		// edit as necessary
		//testPeople();

		testPeople();
		testPhoneNums();
	}
	

	
	
	public static void testPeople() {
		
		People ppl = new People();
		ppl.printPeople(ppl.readFile());
		
	}
	public static void testPhoneNums() {
		
		PhoneNums phone = new PhoneNums();
		phone.readPhoneNumbers();
	}
	

	
	
}
