package kodlamaio;

public class Instructors {
	
	int id;
	String firstName;
	String lastName;
	String instructorEmailAddress;
	String password;
	String passwordHash;
	
	public Instructors() {
		
	}

	public Instructors(int id, String firstName, String lastName, String instructorEmailAddress, String password,
			String passwordHash) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorEmailAddress = instructorEmailAddress;
		this.password = password;
		this.passwordHash = passwordHash;
	}


	
}
