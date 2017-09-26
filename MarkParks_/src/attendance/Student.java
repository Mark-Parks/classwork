package attendance;

public class Student implements Attendee{

	private String fName;
	private String lName;
	private boolean present;
	
	public Student(String firstName, String lastName) {
		this.fName = firstName;
		this.lName = lastName;
	}
	
	public boolean isPresent() {
		return this.present;
	}
	
	public void setPresent(boolean present) {
		
	}
}
