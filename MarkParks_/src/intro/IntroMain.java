package intro;//package declaration: matches folder where this file is located

//class header
public class IntroMain {

	public static final String[] DESCRIPTIONS = {" is a student at BTHS", " is a teacher at BTHS"};
	public static final String[] NAMES = {"Alpha Alex","Beta Barry","Charlie Charlie","Detla Donnie","Echo Edgar","Foxtrot Felix","Golf George","Hotel Hector","Igloo Igor","Juliet Juliet"};
	//this is the first method that is executed. It is static because it is independent of instances

	public static void main(String[] args) {
		//this is the declaration of an instance of CodingConventions
		//in the same line of code, it is also being instantiated
		//note the use of the word "new" this word is always used when calling constructors
		
		int numberOfPeople = 10;
		for(int i = 0; i < numberOfPeople; i++) {
			CodingConventions conventionsInstance = new CodingConventions(i, i % 2);

			//a note on local variables: they are NOT FEILDS (HAS-A relationships)
			//they are variables that are only used in the scope of a method
			//after the method, they are destroyed
			
			//instance method call (the method belongs to the instance, not the class)
			
			conventionsInstance.doStuff();
		}
	}
}
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
