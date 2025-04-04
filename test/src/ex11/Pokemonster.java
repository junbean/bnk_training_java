package ex11;

public abstract class Pokemonster {
	private int health;
	private String name;
	
	public Pokemonster(int health, String name) {
		this.health = health;
		this.name = name;
	}
	
	abstract void demaged(int demage);
	abstract void attack();
	void lose() {
		System.out.println("포켓몬이 기절했습니다");
	}
}
