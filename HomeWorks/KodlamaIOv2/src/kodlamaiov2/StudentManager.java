package kodlamaiov2;

public class StudentManager extends UserManager {
	public void finishToLecture(Courses course, String lecture) {
		System.out.println(course.name +" kursuna ait " + lecture + " dersi tamamlad�n�z. S�radaki derse ge�ebilirsiniz.");
	}
	public void finishToHomework(Courses course, String homeWork) {
		System.out.println(course.name +" kursuna ait " + homeWork + " �devini tamamlad�n�z. �al��maya devam :)");

	}
}
