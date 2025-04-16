package ex10;

public class MemberInnerTest {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		
		out.getUnit();		// out클래스에서 inner클래스 move() 호출
		
		Outer1.MemberInner1 inner = out.new MemberInner1();
		inner.move();	// inner클래스에서 move() 호출
	}

}
