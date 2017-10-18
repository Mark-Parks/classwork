package arrays;

public class Athlete extends Person{

	private int money;
	
	public Athlete(String first, String last, Borough home, int money) {
		super(first, last, home);
		
		this.money = money;
	}

	public String toString() {
		return super.toString() + " I also have $"+money+"!";
	}
}
