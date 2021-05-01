package homeworkDay3;

public class Student extends User{
	String address;

	public Student(int id, String email, String firstName, String lastName, String password, String address) {
		super(id, email, firstName, lastName, password);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
