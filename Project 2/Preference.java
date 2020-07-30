
public class Preference {

	private int QuietTime;
	private int Music;
	private int Reading;
	private int Chatting;
	private int Prefersum;
	
	
	public Preference() {
		this.QuietTime = 0;
		this.Music = 0;
		this.Reading = 0;
		this.Chatting = 0;
		this.Prefersum = 0;
		}
	
	public Preference(int QuietTime,int Music,int Reading,int Chatting,int Prefersum){
		this.QuietTime = QuietTime;
		this.Music = Music;
		this.Reading = Reading;
		this.Chatting = Chatting;
		this.Prefersum = Prefersum;
	}
	
	public void setQuietTime(int QuietTime){
		this.QuietTime = QuietTime;
	}
	
	public int getQuietTime(){
		return QuietTime;
		
	}
	public void setMusic(int Musical){
		this.Music = Musical;
	}
	
	public int getMusic(){
		return Music;
	}
	
	public void setReading(int Reading){
		this.Reading = Reading;
	}
	
	public int getReading(){
		return Reading;
	}
	
	public void setChatting(int Chatting){
		this.Chatting = Chatting;
	}
	
	public int getChatting(){
		return Chatting;
	}
	
	public void setPreferSum(int QuietTime, int Reading, int Music,  int Chatting){
		this.Prefersum = QuietTime + Music + Reading + Chatting;
	}
	
	public int getPreferSum(){
		return Prefersum;
	
	}
	
	public int compare(Preference preference){
	int diffQuietTime = Math.abs(this.getQuietTime() - preference.getQuietTime());
	int diffMusic = Math.abs(this.getMusic() - preference.getMusic());
	int diffReading = Math.abs(this.getReading() - preference.getReading());
	int diffChatting = Math.abs(this.getChatting() - preference.getChatting());
	
	return diffQuietTime + diffMusic + diffReading + diffChatting;
	}

}
	

