package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("User added: " + user.getFirstName());
	}
	public void delete(User user) {
		System.out.println("User deleted: " + user.getFirstName());
	}
	public void update(User user) {
		System.out.println("User updated: " + user.getFirstName());
	}
	public void login(User user) {
		System.out.println("User logged in: " + user.getFirstName());
	}
	public void logout(User user) {
		System.out.println("User logged out: " + user.getFirstName());
	}
}
