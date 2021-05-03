
public class Users {
	private int id;
	private String emailAddress;
	
	public Users() {
		
	}

	public Users(int id, String emailAddress) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
