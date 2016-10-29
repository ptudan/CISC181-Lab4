
public class ThrowerAnt extends Ant {

	public ThrowerAnt(int a, int xVal, int yVal, int h) {
		super(a, xVal, yVal, 1, h, "Thrower");
	}
	
	public void throwsAt(Bee b){
		b.reduceArmor(damage);
	}
	
	public String toString(){
		return("Thrower, Armor: " + armor);
	}

}
