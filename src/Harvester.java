
public class Harvester extends Ant {

	public Harvester(int a, int xVal, int yVal, int d, int h) {
		super(a, xVal, yVal, d, h, "Harvester");
	}
	
	public String toString(){
		return("Harvester, Armor: " + armor + " x: " + x + " y: " + y);
	}

}
