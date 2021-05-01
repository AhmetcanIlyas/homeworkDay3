package homeworkDay3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Address added. Student: " + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("Address deleted. Student: " + user.getFirstName());
	}
}
