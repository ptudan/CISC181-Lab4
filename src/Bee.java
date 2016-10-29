import java.util.Random;
public class Bee extends Insect {
	public String name;

	public Bee(int a, int xVal, int yVal) {
		super(a, xVal, yVal);
		name = "Bee";
		
	}
	
	public void sting(Ant a){
		a.reduceArmor(1);
	}
	
	public void move(){
		System.out.println("x: " + x + " y: " + y);
		Random rGen = new Random();
		int moveVal = rGen.nextInt(8);
		if(moveVal == 0){
			x +=1;
		}
		else if(moveVal == 1){
			x+=1;
			y-=1;
		}
		else if(moveVal == 2){
			y-=1;
		}
		else if(moveVal == 3){
			x-=1;
			y-=1;
		}
		else if(moveVal == 4){
			x-=1;
		}
		else if(moveVal == 5){
			x-=1;
			y+=1;
		}
		else if(moveVal == 6){
			y+=1;
		}
		else{
			x+=1;
			y+=1;
		}
		System.out.println("x: " + x + " y: " + y);
	}
	
	public String toString(){
		return("Bee, Armor: " + armor);
	}

}
