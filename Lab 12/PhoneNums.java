package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {

		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();

		try {
			Scanner input = new Scanner ( new FileReader(filename) );
			input.useDelimiter("[\\n|-]");
			while (input.hasNextLine()) {
				int i=0;
				/*	
				 *	Fill-in 
				 */
				
				System.out.println("Country Code: " + input.next());
				System.out.println("Area Code: " + input.next());
				if (i < 3)
					System.out.println("Phone Number " + input.next() + input.next());
				else
					System.out.println("Phone Number" + input.next());
				i++;
				
				System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
