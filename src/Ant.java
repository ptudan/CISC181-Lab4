
public class Ant extends Insect {
	public int damage;
	public int hunger;
	public String name;

	public Ant(int a, int xVal, int yVal, int d, int h, String n) {
		super(a, xVal, yVal);
		damage = d;
		hunger = h;
		name = n;
	}
	
	public boolean isAnt(){
		return true;
	}

}
