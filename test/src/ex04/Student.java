package ex04;

public class Student {
	// 학생 데이터
	// 학년, 반, 번호, 동아리
	private int grade;
	private int class_no;
	private int stud_no;
	private String club;
	
	public Student() { }
	public Student(int grade, int class_no, int stud_no, String club) {
		this.grade = grade;
		this.class_no = class_no;
		this.stud_no = stud_no;
		this.club = club;
	}
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClass_no() {
		return class_no;
	}
	public void setClass_no(int class_no) {
		this.class_no = class_no;
	}
	public int getStud_no() {
		return stud_no;
	}
	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	
	@Override
	public String toString() {
		return "[ grade=" + grade + ", class_no = " + class_no + ", stud_no = " + stud_no + ", club = " + club + " ]";
	}
	
}
