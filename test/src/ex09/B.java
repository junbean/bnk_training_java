package ex09;

public class B implements IB{
	// 클래스 B는 인터페이스 IB의 구현클래스이다
	
	@Override
	public void f1() {
		System.out.println("B클래스의 f1함수 실행...");
	}

	@Override
	public int f2() {
		System.out.println("B클래스의 f2함수 실행...");
		return 1;
	}
}
