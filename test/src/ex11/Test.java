package ex11;

public class Test {

	public static void main(String[] args) {
		Warrior w = new Warrior();
		w.move(10, 20);
		w.attack();
		
		System.out.println();	// 빈칸
		
		Archer a = new Archer();
		a.move(5, 15);
		a.attack();
	}

}
