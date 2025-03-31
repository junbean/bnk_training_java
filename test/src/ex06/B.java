package ex06;

public class B extends A {
	int m;
	/*
	B() {
		System.out.println("B생성자 실행");
	}
	*/
	
	B() {
		super(10);
		System.out.println("B생성자 실행");
	}
	B(int n) {
		super(n);
	}
	B(int n, int m) {
		super(n);
		this.n = n;
		this.m = m;
	}
	
	
	void fa() {
		System.out.println("B의 fa() 실행");		
	}
	
	void fb() {
		System.out.println("B의 fb() 실행");
	}

}
