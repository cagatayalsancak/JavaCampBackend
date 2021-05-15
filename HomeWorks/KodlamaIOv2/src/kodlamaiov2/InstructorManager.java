package kodlamaiov2;

public class InstructorManager  extends UserManager {
	public void addToCourse(Courses course) {
		System.out.println("Kursunuz ba�ar�yla eklenmi�tir.\nKursunuzun Ad� : " + course.name + "\nKursunuzun A��klamas� : " + course.desc);
	}
	public void addToHomework(Courses course, String lecture, String homeWork) {
		System.out.println(course.name + " kursunuzun " + lecture + ". dersine ait, " + homeWork + ". �devi ba�ar�yla eklenmi�tir.");
	}
	public void createToCertificate(Users user, Courses course) {
		System.out.println(course.name + " adl� kursunuza kat�lan "+ user.getFullName() + " sertifika almaya hak kazanm��t�r. Sertifika ba�ar�yla olu�turulmu�tur.");
	}
}
