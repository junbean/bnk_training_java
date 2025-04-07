package ex12;

public class InfinityTest {

	public static void main(String[] args) {
		// Object의 성격 알기 - Object 클래스는 몯느 클래스읭 부모이다
		// 상속관계에서 자식들의 타입을 다를 수 있다
		// 타입이 다르다는건 배열을 만들 수 없다는 의미다
		// 부모 타입으로 선언한 배열에 자식 타입들이 들어갈 수 있다
		// 결과적으로 상속관계는 부모타입으로 서로다른 자식 타입을 하나로 묶을 수 있다는 뜻이다
		Object[] objs = new Object[3];
		objs[0] = "Hello";

		A a = new A(1, "James");
		objs[1] = a;

		objs[2] = new B(2.3f, 'B');

		// String s = (String) objs[0];
		// System.out.println(s);

		/*
		int n = a.getA();
		String name = a.getS();
		*/
		// A ra = (A) objs[1];
		// int ra_a = ra.getA();
		// String ra_s = ra.getS();
		
		
		// 배열이 꽉 찼으니 새로운 데이터를 넣기 위해 더 큰 배열을 만들어야겠다
		Object[] temp = new Object[objs.length + 3];
		temp[0] = objs[0];
		temp[1] = objs[1];
		temp[2] = objs[2];
		
		objs = temp;
		
		objs[3] = "Good";
		objs[4] = new A(2, "Ann");
		temp[4] = new B(3.3f, 'C');	
		
		
		
	}
}



class A {
	private int a;
	private String s;

	public A(int a, String s) {
		this.a = a;
		this.s = s;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", s=" + s + "]";
	}
}

class B {
	private float f;
	private char c;

	public B(float f, char c) {
		super();
		this.f = f;
		this.c = c;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "B [f=" + f + ", c=" + c + "]";
	}
}