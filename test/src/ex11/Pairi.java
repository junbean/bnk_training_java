package ex11;

public class Pairi extends Pokemonster implements Fire {

	public Pairi(int health, String name) {
		super(health, name);
	}

	// 인터페아스 구현
	@Override
	public void strongGrass() {}
	@Override
	public void weakWater() { }

	
	// poke monster 상속
	@Override
	void demaged(int demage) { }
	@Override
	void attack() { }

}
