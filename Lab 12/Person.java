package io;

// CONTAINS SOLUTIONS -- JAR THIS

public class Person {
	private String name;
	private int age;
	private String location;

	public Person() {
		this.name = "";
		this.age = 0;
		this.location = "";
		
	}
	public Person(String name, int age, String location) {
		// Fill-in
		this.name = name; 
		this.age = age;
		this.location = location;
		System.out.println(name + "\t"+ age + "\t" + location);
    }

	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		// Fix
		return this.name;

	}

	public void setAge(int age) {
		// Fill-in
		this.age = age;
		
	}

	public int getAge() {
		//		Fix	
		return this.age;

	}
	public void setLocation(String location) {
		// Fill-in
		this.location = location;
	}

	public String getLocation() {
		//	Fix
		return this.location;

	}
	
	
	// every object in java has a toString method.  The @Override line
	// is an annotation telling Java that the definition below should 
	// replace the default method.
	// Fill in the definition below such that it returns a String that
	// describes a particular Person.
	@Override
	public String toString() {
		
		// fix
		String info = name + " " + age + " " + location;
		
		// return "a person";
		return info;
	}

}
