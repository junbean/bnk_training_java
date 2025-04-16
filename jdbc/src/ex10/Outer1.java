package ex10;

public class Outer1 {
	private int speed = 10;
	
	// 내부 클래스
	// 이렇게 내부에 클래스를 정의한 경우는 -> 해당 내부 클래스가 정말 필요할때 사용됨
	// 그리고 내부 클래스를 정의할 경우는, 해당 내부 클래스는 Outer클래스에서만 필요할때 정의한다
	// 내부 클래스는 외부 클래스의 자원을 제약 없이 사용이 가능하다
	// 어찌보면 클래스를 멤버변수화 한것
	class MemberInner1 {
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
		}
	}
	
	public void getUnit() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}
