package kodlamaiov2;

public class StudentManager extends UserManager {
	public void finishToLecture(Courses course, String lecture) {
		System.out.println(course.name +" kursuna ait " + lecture + " dersi tamamladınız. Sıradaki derse geçebilirsiniz.");
	}
	public void finishToHomework(Courses course, String homeWork) {
		System.out.println(course.name +" kursuna ait " + homeWork + " ödevini tamamladınız. Çalışmaya devam :)");

	}
}
