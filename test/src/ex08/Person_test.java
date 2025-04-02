package ex08;

public class Person_test {

	public static void main(String[] args) {
		Person p = new Person("윤준빈", 25);
		System.out.println("현재 나이 : " + p.getAge());
		System.out.println();
		
		Tteokguk tg1 = new Tteokguk();
		p.eat(tg1);
		System.out.println("1. 현재 나이 : " + p.getAge());
		System.out.println();
		
		Food tg2 = new Tteokguk();
		p.eat(tg2);
		System.out.println("2. 현재 나이 : " + p.getAge());
		System.out.println();
	
		Ramen ramen1 = new Ramen();
		p.eat(ramen1);
		System.out.println("3. 현재 나이 : " + p.getAge());
		System.out.println();
	
		Ramen ramen1_2 = new Ramen(900);
		p.eat(ramen1_2);
		System.out.println("4. 현재 나이 : " + p.getAge());
		System.out.println();

		Food ramen2 = new Ramen();
		p.eat(ramen2);
		System.out.println("5. 현재 나이 : " + p.getAge());
		System.out.println();
	}

}
