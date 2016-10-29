
public class Girl {
	private int figure; //totally non sexist rating (1-10)
	private String name;
	private String hColor; //hair color to identify who's whom
	private String eColor; //eye color just to make sure
	
	public Girl(){
		figure = 8;
		name = "Doll";
		hColor = "Brunette";
		eColor = "Brown";
	}
	
	public Girl(int f, String n, String h, String e){
		figure = f;
		name = n;
		hColor = h;
		eColor = e;
	}
	
	public String toString(){
		return(eColor +"-eyed "+hColor+" named "+name+", "+figure);
	}
	
	public void setFigure(int f){
		figure = f;
	}
	
	public void setEye(String e){
		eColor = e;
	}
	
	public void setHair(String h){
		hColor = h;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEye(){
		return eColor;
	}
	
	public String getHair(){
		return hColor;
	}
	
	public int getFig(){
		return figure;
	}

}
