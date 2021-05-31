package kodlamaio;

public class CourseManager {
	public void addToCourse(Courses course) {
		System.out.println(course.name + " adlý kursunuz eklenmiþtir.");
	}
	public void addToHomework(Courses course, String homeWork) {
		System.out.println("\n" + course.name + " kursunuza " + homeWork + "\n\nödevi eklendi.\n");
	}
}
