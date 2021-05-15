package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		// Öðrenci Tanýmlama
		Students student1 = new Students(10, "Mehmet Çaðatay", "ALSANCAK", 
											"cagatay.alsancak71@gmail.com", 
											"by Cati", "1*2345mCa", "ac90X09d0f90aU0");
		
		Students student2 = new Students();
		student2.id = 1;
		student2.firstName = "Timuçin";
		student2.lastName = "ALSANCAK";
		student2.nickName = "by Teamo";
		student2.emailAddress = "timucin.alsancak@gmail.com";
		student2.password = "963*258teAmo";
		student2.passwordHash = "na9834SfkspIW9w0439"; // Rastgele yazdým :)
		
		Students[] students = {student1, student2};
		
		for(Students student : students) {
			System.out.println(student.id + " numara Öðrencinizin ;\nAdý	: " + student.firstName +
								"\nSoyadý	: " + student.lastName + "\n");
		}
		System.out.println(students.length + " adet öðrenciniz bulunmaktadýr.");
		
		// Eðitmen Tanýmlama
		Instructors instructor1 = new Instructors(10, "Engin", "DEMÝROÐ", "engindemirog@gmail.com", "54989,ed", "eec908KHsd89LJ" );
		
		Instructors[] instructors = {instructor1};
		for(Instructors instructor : instructors) {
			System.out.println("\n" + instructor.id + " numara Eðitmenimizin ;\n Adý	: " + instructor.firstName + 
					"\nSoyadý : " + instructor.lastName);
		}
		System.out.println(instructors.length + " adet Eðitmeniniz bulunmaktadýr.\n");
		
		// Eðitim Tanýmlama
		Courses course1 = new Courses(1, "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)",
				"Java ile Web Geliþtirme", instructor1.firstName + " " + instructor1.lastName);
		
		Courses course2 = new Courses(2, "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", 
				"C# ile Web Geliþtirme",  instructor1.firstName + " " + instructor1.lastName);
		
		Courses course3 = new Courses(3, "Programlamaya Giriþ için Temel Kurs", 
				"Programlamaya Giriþ",  instructor1.firstName + " " + instructor1.lastName);
		
		// Eðitim Ekleme
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		Courses[] courses = {course1, course2, course3};
		
		for(Courses course : courses) {
			System.out.println("\n" + course.id + " numaralý Eðitiminizin ; \nAdý		: " + course.name + 
					"\nAçýklamasý	: " + course.desc +
					 "\nKurs Eðitmeni	: " + course.instructor
					);
			
				}
		courseManager.addToHomework(course1, "Ödev 1: \n"
				+ "Kodlama.io sitesine gidiniz.\r\n"
				+ "Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz.\r\n"
				+ "Bunlara ait class, contructor yapýlarýný oluþturup diziye ekleyip listeleyiniz.\r\n"
				+ "Ýþ sýnýfý olarak tanýmladýðýmýzý düþündüðünüz bir class oluþturunuz. En az iki metot yazýnýz.");
		
		courseManager.addToHomework(course1, "Ödev 2: \n" 
				+ "https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25\r\n"
				+ "Bu oynatma listesini 24-35 aralýðýnda izleyiniz. (24-35 dahil)\r\n"
				+ "Bu dersler sizi sonraki derse hazýr getirecek.\r\n"
				+ "Bu videolarý siz de uygulayýnýz.");


		
		System.out.println(courses.length + " adet kayýtlý kurs bulunmaktadýr.\n");

		
		
		
		
		
		System.out.println("Developer " + student1.nickName);
	}

}
