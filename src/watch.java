
public class watch {
	private int hour;
	private int minute;
	private int seconds;
	
	public watch(){
		this(12, 0, 0);
	}
	
	public watch(int newHour){
		this(newHour, 0, 0);
	}
	
	public watch(int newHour, int newMinute){
		this(newHour, newMinute, 0);
	}
	
	public watch(int newHour, int newMinute, int newSeconds){
		hour = newHour;
		minute = newMinute;
		seconds = newSeconds;
	}
	
	public void setHour(int newHour){
		hour = newHour;
	}
	
	public void setMinute(int newMinute){
		minute = newMinute;
	}
	
	public void setSeconds(int newSeconds){
		seconds = newSeconds;
	}
	
	public void setValues(int newHour, int newMinute, int newSeconds){
		hour = newHour;
		minute = newMinute;
		seconds = newSeconds;
	}
	
	public String toString(){
		String m = "";
		String s = "";
		if(minute == 0){
			m = "00";
		}
		else{
			m = "" + minute;
		}
		
		if(seconds == 0){
			s = "00";
		}
		else{
			s = "" + seconds;
		}
		
		return(hour + ":" + m + ":" + s);
	}
	
}
