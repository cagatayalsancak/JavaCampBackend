package kodlamaiov2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1 = new Students();
		student1.setId(1);
		student1.setFirstName("Mehmet Çaðatay");
		student1.setSurName("ALSANCAK");
		student1.setEmailAddress("cagatay.alsancak71@gmail.com");
		student1.setPassword("123456*Mca");
		
		Instructors instructor1 = new Instructors();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setSurName("DEMÝROÐ");
		instructor1.setEmailAddress("engindemirog@gmail.com");
		instructor1.setPassword("987*321Ed");
		instructor1.setCertificates("ITIL, MCT, PMP");
		instructor1.setJob("Software Development Instructor");
		
		UserManager userManager = new UserManager();
		userManager.register(instructor1);
		userManager.register(student1);
		
		Courses course1 = new Courses(1, "C# + Angular", "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý", instructor1.getFullName());
		Courses course2 = new Courses(1, "Java + React", "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý", instructor1.getFullName());

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToCourse(course1);
		instructorManager.addToCourse(course2);
		
		instructorManager.addToHomework(course2, "3", "1");
		instructorManager.addToHomework(course2, "3", "2");
		
		instructorManager.createToCertificate(student1, course2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.finishToHomework(course2, "Ödev 1");
		studentManager.finishToHomework(course2, "Ödev 2");
		studentManager.finishToLecture(course2, "Ders 3");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
