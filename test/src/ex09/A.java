package ex09;

public class A extends AbstractParent implements IB {
	
	A() {
		super(10);
		System.out.println("A 생성자 호출");
	}
	A(int n) {
		super(n);
		System.out.println("A 생성자 호출");
	}
	
	// AbstratParent의 메서드
	@Override
	public void af() {
		System.out.println("오버라이드된 af()함수입니다");
	}
	
	// IA의 메서드
	@Override
	public void f1() {
		System.out.println("A클래스의 f1함수 실행");
	}
	@Override
	public int f2() {
		System.out.println("A클래스의 f2함수 실행");
		return 0;
	}
	
}
