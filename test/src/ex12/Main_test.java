package ex12;

public class Main_test {
	public static void main(String[] args) {
		X a = new X();
		a.x = 10;
		System.out.println(a.x);
		
		
		Y b = new Y();
		b.y = "hello";
		System.out.println(b.y);
		
		// 상속 !!!!!!!
		Object a1 = new Y();
		
		Y b1 = (Y) a1;
		b1.y = "bye";
		System.out.println(b1.y);
		
		
		/*
		X a1 = new Y();
		a1.x = 20;
		System.out.println(a1.x);
		
		Y b1 = (Y) a1;
		b1.y = "bye";
		System.out.println(b1.y);
		*/
		
	}

}
