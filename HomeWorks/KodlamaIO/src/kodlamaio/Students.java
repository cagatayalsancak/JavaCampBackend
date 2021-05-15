package kodlamaio;

public class Students {
	
	int id;
	String firstName;
	String lastName;
	String emailAddress;
	String nickName;
	String password;
	String passwordHash;
	
	public Students() {
		
	}

	public Students(int id, String firstName, String lastName, String emailAddress, String nickName, String password,
			String passwordHash) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.nickName = nickName;
		this.password = password;
		this.passwordHash = passwordHash;
	}

}
