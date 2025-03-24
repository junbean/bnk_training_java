package test;

public class A_test {

	public static void main(String[] args) {
		A a = new A(); // 호출과 동시에 생성자 호출
		System.out.println(a.n);
		System.out.println(a.s);

		System.out.println("=========================");
		a.n = 10; // A클래스의 멤버변수 n 지정
		a.s = "Hi";
		int result1 = a.n;
		String result2 = a.s;
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("=========================");
		A a1 = new A(); // 호출과 동시에 생성자 호출
		A a2 = new A(); // 호출과 동시에 생성자 호출
		a1.n = 20;
		a2.n = 4;
		System.out.println(a1.n);
		System.out.println(a2.n);

		
	}
}
//a.main();		// A클래스의 main함수 호출