package KodlamaIO;

public class Courses {
	
	int id;
	String name;
	String desc;
	String instructor;
	
	public Courses() {
		
	}
	public Courses(int id,
					String name,
					String desc,
					String instructor) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.instructor = instructor;
		
	}
}
