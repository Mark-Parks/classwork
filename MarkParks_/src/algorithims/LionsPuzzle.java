package algorithims;

public class LionsPuzzle {

	public static void main(String[] args) {
		int numberofLions = 101;
		if(willEat(numberofLions)) {
			System.out.println("Eat the sheep!");
		}else {
			System.out.println("Do not eat the sheep!");
		}
	}

	private static boolean willEat(int numberOfLions) {
		if(numberOfLions == 1) return true;
		else {
			return !willEat(numberOfLions-1);
		}
	}
}
