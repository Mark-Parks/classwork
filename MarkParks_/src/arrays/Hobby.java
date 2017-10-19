package arrays;

public class Hobby extends Thing {

	public Hobby(String desc) {
		super(desc);
	}

	public static Hobby randomHobby() {
	Hobby[] h = {new Hobby("Playing CS:GO"),new Hobby("Playing PUBG"), new Hobby("Playing DoTa 2")};
	
	return  h[(int)(Math.random() * h.length)];
	
	}
}
