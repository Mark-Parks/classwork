package attendance;

public class Student implements Attendee{

	private String fName;
	private String lName;
	private boolean present;
	
	public Student(String firstName, String lastName) {
		this.fName = firstName;
		this.lName = lastName;
		present = false;
	}
	
	public boolean isPresent() {
		return this.present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	
	public String getFirstName() {
		return this.fName;
	}
	
	public String getLastName() {
		return this.lName;
	}
	
	public boolean mathces(String first, String last) {
		return first.toLowerCase().equals(fName.toLowerCase()) && last.toLowerCase().equals(lName.toLowerCase());
	}
	
	public boolean matches(String last) {
		return last.toLowerCase().equals(lName.toLowerCase());
	}
	
	public String getReportString() {
		String report = lName;
		report += "                    ";
		report = report.substring(0, 20);
		report += fName;
		report += "                    ";
		report = report.substring(0,40);
		if( this.isPresent()) {
			return report += "PRESENT";
		}
		return report += "ABSENT";
	}
}
