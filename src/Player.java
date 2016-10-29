
public class Player {
	private String name;
	private char piece;
	private boolean isPerson;
	
	public Player(){
		name = "Computer";
		isPerson = false;
	}
	
	public Player(String n, Boolean is){
		name = n;
		isPerson = is;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean getisPerson(){
		return isPerson;
	}
	
	public char getPiece(){
		return piece;
	}
	
	public void setPiece(char p){
		piece = p;
	}
	
	public String toString(){
		return(name + " using: " + Character.toString(piece)+(isPerson?" is a Human.":" is a Computer."));
	}
}
