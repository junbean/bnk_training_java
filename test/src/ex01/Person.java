package test;

public class Person {
	int age;
	String name;
	char gender;
	
	Person() {
		System.out.println("기본 생성됨");
	}
	Person(int age) {
		System.out.println(age+ "생성자1");
	}
	Person(String name) {
		System.out.println(name + "생성자2");
	}
	Person(char gender) {
		System.out.println(gender+ "생성자3");
	}
	Person(int age, String name) {
		System.out.println(age + " " + name + "생성자4");
	}
	Person(int age, char gender) {
		System.out.println(age + " " + gender + "생성자5");
	}
	Person(String name, char gender) {
		System.out.println(name + " " + gender + "생성자6");
	}
	Person(int age, String name, char gender) {
		System.out.println(age + " " + name + " " + gender + "생성자7");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
