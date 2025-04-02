package ex08;

public class Ramen extends Food {
	int calories = 1500;
	
	public Ramen() {
		this.name = "라면";
	}
	public Ramen(int calories) {
		this();
		this.calories = calories;
	}
	
}
