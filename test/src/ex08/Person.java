package ex08;

public class Person {
	// 이름, 나이가 존재
	// 음식중에 떡국이 있음 -> 떡국 클래스를 만듦
	// 사람이 떡국이 먹음 -> eat메서드 -> 매개변수로 떡국을 가져옴
	// 떡국을 먹으면 나이가 한살 증가 -> 추가로 떡국을 먹었다고 표시해줌 -> show(떡국) -> "떡국을" 먹었음

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(Tteokguk tg) {
		age++;
		tg.eatingFood();
	}
	public void eat(Ramen ramen) {
		int plus = ramen.calories / 1000;
		age += plus;
		ramen.eatingFood();
	}
	
	
	public void eat(Food food) {
		if(food instanceof Tteokguk) {
			eat((Tteokguk)food);	
		} else if(food instanceof Ramen) {
			eat((Ramen)food);
		} else {
			food.eatingFood();	
		}
	}
	
}
