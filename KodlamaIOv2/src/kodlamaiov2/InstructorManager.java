package kodlamaiov2;

public class InstructorManager  extends UserManager {
	public void addToCourse(Courses course) {
		System.out.println("Kursunuz baþarýyla eklenmiþtir.\nKursunuzun Adý : " + course.name + "\nKursunuzun Açýklamasý : " + course.desc);
	}
	public void addToHomework(Courses course, String lecture, String homeWork) {
		System.out.println(course.name + " kursunuzun " + lecture + ". dersine ait, " + homeWork + ". ödevi baþarýyla eklenmiþtir.");
	}
	public void createToCertificate(Users user, Courses course) {
		System.out.println(course.name + " adlý kursunuza katýlan "+ user.getFullName() + " sertifika almaya hak kazanmýþtýr. Sertifika baþarýyla oluþturulmuþtur.");
	}
}
