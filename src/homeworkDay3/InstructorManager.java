package homeworkDay3;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Certificate added. Instructor: " + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("Certificate deleted. Instructor: " + user.getFirstName());
	}
}
