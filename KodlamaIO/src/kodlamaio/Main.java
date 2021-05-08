package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		// ��renci Tan�mlama
		Students student1 = new Students(10, "Mehmet �a�atay", "ALSANCAK", 
											"cagatay.alsancak71@gmail.com", 
											"by Cati", "1*2345mCa", "ac90X09d0f90aU0");
		
		Students student2 = new Students();
		student2.id = 1;
		student2.firstName = "Timu�in";
		student2.lastName = "ALSANCAK";
		student2.nickName = "by Teamo";
		student2.emailAddress = "timucin.alsancak@gmail.com";
		student2.password = "963*258teAmo";
		student2.passwordHash = "na9834SfkspIW9w0439"; // Rastgele yazd�m :)
		
		Students[] students = {student1, student2};
		
		for(Students student : students) {
			System.out.println(student.id + " numara ��rencinizin ;\nAd�	: " + student.firstName +
								"\nSoyad�	: " + student.lastName + "\n");
		}
		System.out.println(students.length + " adet ��renciniz bulunmaktad�r.");
		
		// E�itmen Tan�mlama
		Instructors instructor1 = new Instructors(10, "Engin", "DEM�RO�", "engindemirog@gmail.com", "54989,ed", "eec908KHsd89LJ" );
		
		Instructors[] instructors = {instructor1};
		for(Instructors instructor : instructors) {
			System.out.println("\n" + instructor.id + " numara E�itmenimizin ;\n Ad�	: " + instructor.firstName + 
					"\nSoyad� : " + instructor.lastName);
		}
		System.out.println(instructors.length + " adet E�itmeniniz bulunmaktad�r.\n");
		
		// E�itim Tan�mlama
		Courses course1 = new Courses(1, "Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)",
				"Java ile Web Geli�tirme", instructor1.firstName + " " + instructor1.lastName);
		
		Courses course2 = new Courses(2, "Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", 
				"C# ile Web Geli�tirme",  instructor1.firstName + " " + instructor1.lastName);
		
		Courses course3 = new Courses(3, "Programlamaya Giri� i�in Temel Kurs", 
				"Programlamaya Giri�",  instructor1.firstName + " " + instructor1.lastName);
		
		// E�itim Ekleme
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		Courses[] courses = {course1, course2, course3};
		
		for(Courses course : courses) {
			System.out.println("\n" + course.id + " numaral� E�itiminizin ; \nAd�		: " + course.name + 
					"\nA��klamas�	: " + course.desc +
					 "\nKurs E�itmeni	: " + course.instructor
					);
			
				}
		courseManager.addToHomework(course1, "�dev 1: \n"
				+ "Kodlama.io sitesine gidiniz.\r\n"
				+ "�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.\r\n"
				+ "Bunlara ait class, contructor yap�lar�n� olu�turup diziye ekleyip listeleyiniz.\r\n"
				+ "�� s�n�f� olarak tan�mlad���m�z� d���nd���n�z bir class olu�turunuz. En az iki metot yaz�n�z.");
		
		courseManager.addToHomework(course1, "�dev 2: \n" 
				+ "https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25\r\n"
				+ "Bu oynatma listesini 24-35 aral���nda izleyiniz. (24-35 dahil)\r\n"
				+ "Bu dersler sizi sonraki derse haz�r getirecek.\r\n"
				+ "Bu videolar� siz de uygulay�n�z.");


		
		System.out.println(courses.length + " adet kay�tl� kurs bulunmaktad�r.\n");

		
		
		
		
		
		System.out.println("Developer " + student1.nickName);
	}

}
