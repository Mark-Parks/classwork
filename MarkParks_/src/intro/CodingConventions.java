package intro;

public class CodingConventions {

	//FIELDS ARE AT THE TOP!!!
	private String name;//NOTE: DECALRE FIELDS ONLY, INSTANTIATE IN THE CONSTRUCTOR
	private String description;
	
	//this is a constructor, it is like a method except the "return type" is an instance of the class, for this reason a constructor must ALWAYS be named after the class
	public CodingConventions(int nameIndex, int descriptionIndex){
		//there are two variables called "name" the local and the field, distinguish by using the reserved word "this"(feild)
		name = IntroMain.NAMES[nameIndex];
		//this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	
	//normal method "void"
	public void doStuff() {
		String output = name + description;//use spaces in between operations
		System.out.println(output);
	}
}
