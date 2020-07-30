import java.util.*;
import java.io.*;

public class Match {

	public static void main(String[] args) {
		
		System.out.println("Please Give the File name: ");
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		
		Student[] student = new Student [100];
		
		for (int i = 0; i < 100; i++)
			student [i] = new Student ();
			
	
	try{
		Scanner input1 = new Scanner (new FileReader (filename));
	int count = 0;
	while (input1.hasNextLine() && count < 100) {
		Scanner c = new Scanner (input1.nextLine());
		c.useDelimiter("[\t-]");
		student[count].setName(c.next());
		student[count].setGender(c.next().charAt(0));
		
		student[count].getBirthday().setMonth(c.nextInt());
		student[count].getBirthday().setDay(c.nextInt());
		student[count].getBirthday().setYear(c.nextInt());
		
		student[count].getprefer().setQuietTime(c.nextInt());
		student[count].getprefer().setMusic(c.nextInt());
		student[count].getprefer().setReading(c.nextInt());
		student[count].getprefer().setChatting(c.nextInt());
		
		count++;
		//lab 11
	}
			
		for(int i = 0; i<count; i++){
			Student first = student[i];
			if(first.getMatched())
				continue;
			Student match = null;
			for(int j = i+1; j < count; j++)
			{
				Student second = student[j];
			
			
				if(!second.getMatched() && (first.compare(second) > 0 ) && (match == null || first.compare (second) > first.compare (match)))
				{
					match = second;	
				}
			}
			
			if (match!= null){
				System.out.println(first.getName() + " matches with " + match.getName() + " with the score " + first.compare(match));
				first.setMatched(true);
				match.setMatched(true);
			}
			else{
				System.out.println(first.getName() + " had no matches.");
			}
	}
		

	}
catch (NoSuchElementException e){
	System.out.println(e);
}catch (FileNotFoundException e) {
	System.out.println(e);
}

}
}