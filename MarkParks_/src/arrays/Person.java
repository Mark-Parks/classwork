package arrays;

public class Person {

	public static final String[] FIRST_START = {"Chr", "Am","L","D","Th","Br","B"};
	public static final String[] FIRST_MIDDLE = {"ala","ima","e","o","anna","ola","a"};
	public static final String[] FIRST_END = {"na","ck","n","tt","rian","lius","lion","les"};
	
	public static final String[] LAST_START = {"Bl", "Gr","Ph","M","Thr","Sh","Br"};
	public static final String[] LAST_MIDDLE = {"an","in","ast","own","il"};
	public static final String[] LAST_END = {"strom","son","rack","les","vin","ston"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	private String nickname;
	
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
		nickname = createNickname(firstName);
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * PASS BY VALUE
	 * the parameters contain values not references
	 * therefore, the original does not change
	 * 
	 * @param name
	 * @return
	 */
	public static String createNickname(String name) {
		return name.substring(0,secondVowelIndex(name));
	}
	
	private static int secondVowelIndex(String name) {
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			if(isVowel(name.substring(i, i+1))) {
				count++;
			}
			if(count == 2) return i;
		}
		return name.length();
	}

	private static boolean isVowel(String letter) {
		if(letter.equals("a")|| letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")) return true;
		return false;
	}

	public void statYourFriends() {
		String friendsList = "My friends are ";
		for(int i = 0; i < friends.length - 1; i++) {
			friendsList += friends[i].firstName;
			friendsList += ",";
		}
		friendsList += " and "+friends[friends.length-1].firstName;
		System.out.println(friendsList);
	}
	
	public void mingle(Person[] peers) {
		for(Person p: peers) {
			if(p != this) {
				setInFirstPlace(p);
			}
		}
	}
	
	public void setInFirstPlace(Person f) {
		for(int i = friends.length - 1; i > 0; i--) {
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public String toString() {
		return "My Name is "+firstName+" "+lastName+". Call me "+nickname+". I am from "+home+".";
	}

}
