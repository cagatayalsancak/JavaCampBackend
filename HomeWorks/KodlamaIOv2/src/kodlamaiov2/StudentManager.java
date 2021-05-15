package kodlamaiov2;

public class StudentManager extends UserManager {
	public void finishToLecture(Courses course, String lecture) {
		System.out.println(course.name +" kursuna ait " + lecture + " dersi tamamladýnýz. Sýradaki derse geçebilirsiniz.");
	}
	public void finishToHomework(Courses course, String homeWork) {
		System.out.println(course.name +" kursuna ait " + homeWork + " ödevini tamamladýnýz. Çalýþmaya devam :)");

	}
}
