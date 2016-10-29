
public class Pants extends Clothing { //good extension as pants are more specific
	private int bFac; //int that holds the hotness of the butt factor (1-10)
	private Boolean pockets; //true if pants have pockets
	
	public Pants(){
		super();
		bFac = 7;
		pockets = true;
	}
	
	public Pants(char l, String c, Boolean h, int b, Boolean p){
		super(l, c, h, false);
		bFac = b;
		pockets = p;
	}
	
	public void bleach(){
		color = "Bright-" + color;
		pockets = false; //bleaching your pants makes your pants tighter and impossible to use the pockets
		if(bFac< 10){	//bleached pants +1 hotness factor
			bFac += 1;
		}
	}
	
	public String toString(){
		String loc = " ";
		String poc = " ";
		if(highest){
			loc = " Pants";
		}
		else{
			loc = " Underpants";
		}
		if(pockets){
			poc = " with Pockets, ";
		}
		else{
			poc = " without Pockets, ";
		}
		return(Character.toString(length)+" " + color +" "+ "Bottom" + loc +
				poc + "with a butt factor of: " + bFac);
	}
}
