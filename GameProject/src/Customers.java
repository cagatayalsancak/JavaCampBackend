
public class Customers extends Users {
	private int id;
	private String firstName;
	private String surName;
	private String nationalIdentity;
	private int birthYear;
	private String fatherName;
	
	public Customers() {
		
	}

	public Customers(int id, String firstName, String surName, String nationalIdentity, int birthYear,
			String fatherName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.fatherName = fatherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
}
