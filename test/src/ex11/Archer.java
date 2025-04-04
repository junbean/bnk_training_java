package ex11;

public class Archer implements Playable {

	@Override
	public void move(int x, int y) {
		System.out.println("Archer가 ("+ x + ", " + y + ") 위치로 이동합니다.");
	}

	@Override
	public void attack() {
		System.out.println("Archer가 활을 쏩니다.");
	}

}
