import javax.swing.JOptionPane;

public class DanceCard {
	private int day; //holds day of the week (availability is different everyday)
	private int hour; //holds timeslot
	private Girl[] card = new Girl[3];
	
	public DanceCard(){
		day = 4;
		hour = 18;
		for(int i = 0; i<3; i++){
			card[i] = new Girl();
		}
	}
	
	public DanceCard(int d, int h){
		day = d;
		hour = h;
		for(int i = 0; i<3; i++){
			card[i] = new Girl(Integer.parseInt(JOptionPane.showInputDialog("Enter a Figure (1-10): ")),
					JOptionPane.showInputDialog("Enter a Name: "),
					JOptionPane.showInputDialog("Input Hair Color: "),
					JOptionPane.showInputDialog("Input Eye Color: "));
		}
	}
	
	public String toString(){
		String ret = "";
		ret = ret + "Day: "+ day + " Hour: " + hour;
		for(int i = 0; i<3; i++){
			ret = ret + "\n";
			ret = ret + card[i].toString();
		}
		return ret;
	}
	
	public double cardAverage(){ //returns average rating of girl on card
		double total = 0.0;
		for(int i = 0; i<3; i++){
			total += card[i].getFig();
		}
		return total/3;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getHour(){
		return hour;
	}
	
	public Girl getGirl(int index){
		return card[index];
	}
	
	public void setDay(int d){
		day = d;
	}
	
	public void setHour(int h){
		hour = h;
	}
	
	public void setGirl(int index, int f, String e, String h, String n){
		card[index] = new Girl(f, n, h, e);
	}
	
}
