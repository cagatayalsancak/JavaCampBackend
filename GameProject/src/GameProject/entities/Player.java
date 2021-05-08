package GameProject.entities;


public class Player {
	private int id;
	private String identityNumber;
	private String firstName;
	private String surName;
	private int birthYear;
	private String emailAddress;
	
	
	public Player() {
		
	}

	public Player(int id, String firstName, String surName, int birthYear, String identityNumber, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName.toUpperCase();
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthDate(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
}
