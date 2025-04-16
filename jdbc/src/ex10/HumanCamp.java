package ex10;

public class HumanCamp {
	private int speed = 10;
	
	public void getMarine() {
		class Marine {
			public void move() {
				System.out.println("인간형 유닛이 " + speed + "속도로 이동합니다.");
			}
		}
		
		Marine inner = new Marine();
		inner.move();
	}
}
