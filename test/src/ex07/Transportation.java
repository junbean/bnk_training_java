package ex07;

public class Transportation {
	/*
	
	final 붙게 되면 수정할수 없는 상수가 되기 때문에
	오버라이딩이 안된다
	public final void go() {
		System.out.println("알아서 갑니다.");
	}
	
	
	마찬가지로 클래스에 final을 붙이면 클래스 상속을 못하게 한다
	public final class Transportation
	
	추상클래스로 만들면 객체 생성을 못하게 한다
	public abstract class Transportation

	*/

	
	public void go() {
		System.out.println("알아서 갑니다.");
	}
	public void goBusan(Transportation t) {
		t.go();
	}
	
	
	/*
	public void goBusan(Transportation t) {
		t.go();
	}
	*/
}
