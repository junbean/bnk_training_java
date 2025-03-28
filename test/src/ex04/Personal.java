package ex04;

public class Personal {
	// 개인정보 데이터
	// 이름, 생년월일, 성별, 주소, 힉생-class
	private String name;
	private String birth;
	private char gender;
	private String address;
	private Student student;
	
	
	public Personal() { }
	public Personal(String name, String birth, char gender, String address, Student student) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.address = address;
		this.student = student;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "name = " + name + "\nbirth = " + birth + "\ngender = " + gender + "\naddress = " + address
				+ "\nstudent = " + student + "\n]";
	}
	
}

