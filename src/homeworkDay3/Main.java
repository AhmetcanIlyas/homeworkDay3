package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "@gmail.com", "Ahmetcan", "Ilyas", "123", "Trabzon");
		Instructor instructor = new Instructor(1, "engindemirog@gmail.com", "Engin", "Demirog", "0123",
				"MCT,PMP,ITIL");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.add(instructor);
	}

}
