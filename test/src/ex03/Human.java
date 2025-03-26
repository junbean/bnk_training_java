package ex03;

public class Human {
	private String name;
	private int age;

	// 생성자
	Human() {
		System.out.println("사람입니다");
	}
	Human(String name, int age) {
		System.out.println("사람입니다 + 매개변수");
		this.name = name;
		this.age = age;
	}

	//	getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(check_correct_age(age)) {
			this.age = age;	
		} else {
			System.out.println("값의 하용범위를 벗어났어요.");
			this.age = 0;
		}
	}

	// toString	
	@Override
	public String toString() {
		if(age == 0) {
			return "Human [name=" + name + ", age=미정]";
		} else {
			return "Human [name=" + name + ", age=" + age + "]";
		}
	}
	
	// 나이 검증
	// 틀림 -> true
	private boolean check_correct_age(int age) {
		if(age >= 1 && age <= 200) {
			return true;
		} else {
			return false;	
		}
	}
}

/*
if(age < 1 || age > 200) {
	return true;
} else {
	return false;	
}
*/