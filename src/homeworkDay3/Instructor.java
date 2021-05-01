package homeworkDay3;

public class Instructor extends User{
	String certificate;

	public Instructor(int id, String email, String firstName, String lastName, String password, String certificate) {
		super(id, email, firstName, lastName, password);
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
}
