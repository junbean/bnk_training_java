package ex11;

public class Warrior implements Playable {

	@Override
	public void move(int x, int y) {
		System.out.println("Warrior가 ("+ x + ", " + y + ") 위치로 이동합니다.");
	}

	@Override
	public void attack() {
		System.out.println("Warrior가 검으로 공격합니다.");
	}

}
