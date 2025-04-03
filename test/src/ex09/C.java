package ex09;

public class C implements IB{

	@Override
	public void f1() {
		System.out.println("C클래스의 f1함수 실행...");
	}

	@Override
	public int f2() {
		System.out.println("C클래스의 f2함수 실행...");
		return 0;
	}

}
