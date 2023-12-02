package methodchaining;

public class Student {
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String address;
	
	public int getStudentId() {
		return studentId;
	}
	public Student setStudentId(int studentId) {
		this.studentId = studentId;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Student setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public Student setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Student setAddress(String address) {
		this.address = address;
		return this;
	}
	
	
	private Student() {
		super();
	}
	
	public static Student builder() {
		return new Student();
	}
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
	
	
	public static void main(String[] args) {
		//method chaining
		Student student = Student.builder().setStudentId(1).setFirstName("Akshay").setLastName("singh").setAddress("Noida");
		System.out.println(student);
	}
	
	
	
	

}
