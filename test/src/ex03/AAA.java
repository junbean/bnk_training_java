package ex03;

public class AAA {
	int n;
	static int x;
	static int y;
	
	void test() {
		System.out.println("test 입니다");
	}
	void nonStaticf() {
		// 일반 메서드에서는 static 변수 접근이 가능하다
		System.out.println("나는 그냥 " + x);
	}
	static void staticf() {
		// 일반 메서드도 static 메서드에서 호출할수 없다
		// test();
		// static 메서드안에서는 static 변수만 쓸수있다
		System.out.println("나는 static " + x);
	}
	
	
	
}
