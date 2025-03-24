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
	
	int kor_score;
	int eng_score;
	int math_score;
	
	
	// 학생의 점수를 알려주는 함수
	void show_score() {
		System.out.println(class_num + "번 학생의 점수");
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor_score);
		System.out.println("영어 점수 : " + eng_score);
		System.out.println("수학 점수 : " + math_score);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// 상속
// 자바에서 자식 클래스는 암묵적으로 super()클래스를 호출한다
// super()클래스는 부모 클래스의 생성자를 호출