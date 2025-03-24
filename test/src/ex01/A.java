package test;

public class A {
	char c;
	Long l;
	String s;
	float f;
	boolean b;
	int i;
	int[] arr;
	int n;

	A() {
		System.out.println("A의 생성자");
	}

	void main() {
		System.out.println("Hi i'm A Class");
	}

	void f() {
		int x = f2();
		System.out.println(x + ", " + s);
	}

	int f2() {
		return n;
	}

}

//	public static void main(String[] args) {
//		// 상속받은 클래스의 함수 호출
//		Animal a = new Animal();
//		a.sound();
//		System.out.println(a); // 해당 클래스의 주소를 가짐
//	
//		// 내 함수 호출
//		
//		// 빈칸
//		System.out.println("================"); 
//		
//		// C클래스
//		C c = new C();
//		c.n = 11;	// 변수 지정
//		c.f();
//		c.f1();
//	}
//
//	public void sound() {
//		System.out.println("Bark");
//	}
class Animal {
	void sound() {
		System.out.println("Some sound");
	}
}

class C {
	int n;

	void f() {
		System.out.println("hi");
	}

	void f1() {
		System.out.println(n);
	}
}
