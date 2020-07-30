
public class Student {

	Date date = new Date();
	Preference preference = new Preference();
		private String Name;
		private char Gender;
		private Date Birthday;
		private Preference prefer;
		private Boolean Matched;
		
	public Student() {
		this.Name="";
		this.Gender=0;	 
		this.Birthday=new Date();
		this.prefer=new Preference();
		this.Matched=false;
		
	}
	
	public Student(String name, char gender, Date Birthday, Preference prefer, Boolean Matched) {
		this.Name= Name;
		this.Gender= Gender;
		this.Birthday= Birthday;
		this.prefer= prefer;
		this.Matched= Matched;
		
	}
	
	public void setName(String Name) {
		this.Name = Name;
		
	}
	
	public String getName(){
		return Name;
	}
	
	public void setGender(char Gender) {
		this.Gender = Gender;
		
	}
	
	public char getGender(){
		return Gender;
	}
	
	public void setBirthday(Date date) {
		
	}
	
	public Date getBirthday(){
		return Birthday;
	}
	
	public void setprefer(Preference preference) {
		this.prefer = preference;
	}
	
	public Preference getprefer(){
		return preference;
		
	}
	
	public void setMatched(boolean Matched) {
		this.Matched = Matched;
	}
	
	public boolean getMatched() {
	    return Matched;
	    
	}
	
	public int compare(Student student){
		if(this.getGender() != student.getGender())
			return 0;
		
	

	int Preferences = this.getprefer().compare(student.getprefer());
	
	int ageDifference = this.getBirthday().compare(student.getBirthday());
	
	return (40-Preferences)+(60-ageDifference);
	
	
	}
	
	
}

	
	
	