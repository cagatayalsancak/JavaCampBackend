package kodlamaiov2;

public class UserManager {
	
	public void register(Users user) {
		System.out.println("Sayın " + user.getFirstName() + " " + user.getSurName() + ",\nKaydınız başarıyla gerçekleştirilmiştir.");
	}
}
