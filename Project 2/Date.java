
public class Date {

	private int Year;
	private int Month;
	private int Day;
	
	
	public Date() {
		this.Year = 0;
		this.Month = 0;
		this.Day = 0;
			
	}

	public Date(int Year, int Month, int Day) {
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		
	}
	
	public void setYear(int Year){
		this.Year = Year;
	}
	
	public int getYear(){
	return Year;
		
	}

	public void setMonth(int Month){
		this.Month = Month;
	}
	
	public int getMonth(){
	return Month;
		
	}

	public void setDay(int Day){
		this.Day = Day;
	}
	
	public int getDay(){
	return Day;
		
	}


	public int dayofYear() { 
		int totalDays = 0;   
		switch (Month) {    
		case 12: totalDays += 30;        
		case 11: totalDays += 31;         
		case 10: totalDays += 30;         
		case 9 : totalDays += 31;         
		case 8 : totalDays += 31;        
		case 7 : totalDays += 30;         
		case 6 : totalDays += 31;         
		case 5 : totalDays += 30;         
		case 4 : totalDays += 31;         
		case 3 : totalDays += 28;         
		case 2 : totalDays += 31;     
		} 
    totalDays += Day;     
    return totalDays; 
}

public int compare(Date date){
	int yeardiff = 365*Math.abs(this.getYear() - date.getYear());
	int daydiff = Math.abs(this.dayofYear() - date.dayofYear());
	int totaldiff = Math.abs(yeardiff - daydiff);
	
	int monthsDifferences = totaldiff / 30;

	if (monthsDifferences > 60)
		return 60;
	else 
		return monthsDifferences;
	


}




}








