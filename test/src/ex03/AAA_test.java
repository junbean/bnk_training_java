package ex03;

public class AAA_test {

	public static void main(String[] args) {
		/*
		AAA.x = 30;
		System.out.println(AAA.x);
		
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		
		System.out.println(a1.x);
		System.out.println(a2.x);
		*/
		
		AAA.staticf();
		AAA.x = 70;
		AAA.staticf();
		
		AAA a = new AAA();
		a.nonStaticf();
		AAA.x = 50;
		a.nonStaticf();
	}
}
