package test;
/*
 * 클래스의 구성요소
 * 1. 멤버변수(필드) - 클래스 안에 선언된 변수이므로 멤버변수라고 부른다
 * 2. 멤버변수(메소드) - 클래스 안에 선언된 함수이므로 멤버변수라고 하고, 메소드라고 부른다.
 */
public class Student {
	int grade;
	String name;
	int class_num;
	char gender;
	
	int kor_score;
	int eng_score;
	int math_score;
	
	Student() {
		System.out.println("기본 생성장 입니다");
	}
	
	// 생성자는 클래스의 인스턴스를 초기하하는데 쓰인다
	// 기본 생성자를 쓸건지 아닐지는 정책으로 결정된다
	Student(int class_num, String name, char gender) {
		this.name = name;
		this.class_num = class_num;
		this.gender = gender;
	}
	
	Student(int grade, String name, int class_num, int kor_score, int eng_score, int math_score) {
		this.grade = grade;
		this.name = name;
		this.class_num = class_num;
		this.kor_score = kor_score;
		this.eng_score = eng_score;
		this.math_score = math_score;
	}
	
	// 학생의 점수를 알려주는 함수
	void show_score() {
		System.out.println(class_num + "번 학생의 점수");
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor_score);
		System.out.println("영어 점수 : " + eng_score);
		System.out.println("수학 점수 : " + math_score);
	}
	
	// 함수 구별 규칙 : 반환형, 함수명, 매개변수
	// 메소드 오버로딩 : 함수의 이름이 같지만 시크니처가 다른경우
	void f(int x) {
	}
	void f(float y) {
	}
	
	
	//학생의 번호를 바꿀수 있는 멤버함수
	void change_num(int class_num) {
		this.class_num = class_num;
	}

	
	// setter
	void setter_class_num(int class_num) {
		this.class_num = class_num;
	}
	void setter_name(String name) {
		this.name = name;
	}
	void setter_grade(int grade) {
		this.grade = grade;
	}
	// getter
	int getter_class_num() {
		return class_num;
	}
	String getter_name() {
		return name;
	}
	int getter_grade() {
		return grade;
	}

	void Student(int[] arr) {
		
	}
	
//	void Student(int... arr) {
//		
//	}
	
	
}
// 상속
// 자바에서 자식 클래스는 암묵적으로 super()클래스를 호출한다
// super()클래스는 부모 클래스의 생성자를 호출