package ex10;

public class HumanCamp2 {
	private int speed = 10;
	
	/*
	public Unit getMarine() {
		class Marine2 implements Unit {
			@Override
			public void move() {
				System.out.println("인간형 유닛이 " + speed + " 속도로 이동합니다.");
			}	
		}
		return new Marine2();
	}
	*/
		
	
	// 익명 클래스
	public Unit getMarine() {
		// Unit 인터페이스를 반환
		// 인터페이스의 추상메서드를 오버라이드한다
		return new Unit() {
			@Override
			public void move() {
				System.out.println("인간형 유닛이 " + speed + " 속도로 이동합니다.");
			}
		};
	}
}

