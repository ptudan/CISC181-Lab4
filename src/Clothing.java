
public class Clothing {
	public char length; //holds S for short, M for medium, L for long
	public String color; //holds color
	public Boolean highest; //holds true if top layer of clothing
	public Boolean upper; //holds true if on torso
	
	public Clothing(){ //Default is blue jeans
		length = 'L';
		color = "Blue";
		highest = true;
		upper = false;
	}
	
	public Clothing(char l, String c, Boolean h, Boolean u){
		length = l;
		color = c;
		highest = h;
		upper = u;
	}
	
	public void convertToShorts(){ //turns current item of clothing into shorts of same material
		length = 'S';				//eg TShirt to tank top, jeans to jorts, sweats to shorts
		highest = true;
	}
	
	public void bleach(){ //bleaches your clothes
		color = "Whitish-" + color;
	}
	
	public String toString(){
		String loc = " ";
		String vis = " ";
		if(highest){
			vis = "Visible";
		}
		else{
			vis = "underwear";
		}
		if(upper){
			loc = "Top";
		}
		else{
			loc = "Bottoms";
		}
		return(Character.toString(length) +" "+ color +" "+ loc+" " + vis);
	}

}
