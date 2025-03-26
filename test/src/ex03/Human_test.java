package ex03;

public class Human_test {

	public static void main(String[] args) {
		Human human = new Human();
		
		human.setName("준빈");
		System.out.println(human.getName());
		System.out.println();	// 빈칸

		// 예외 확인
		human.setAge(0);
		System.out.println("나이 출력 : " + human.getAge());
		human.setAge(201);
		System.out.println("나이 출력 : " + human.getAge());
		System.out.println();	// 빈칸

		// 문자열 확인
		System.out.println(human.toString());

		// 정상 출력
		human.setAge(25);
		System.out.println("나이 출력 : " + human.getAge());
		System.out.println(human.toString());
		System.out.println();	// 빈칸

		
		// 매개변수가 있는 형변환
		Human human2 = new Human("james", 11);
		System.out.println("이름 출력 : " + human2.getName());
		System.out.println("나이 출력 : " + human2.getAge());

	}

}
