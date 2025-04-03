package ex09;

public class Test {
	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없다
		// AbstratParent ab = new AbstratParent(); <- 이거 안됨
		
		// A a = new A();	// AbstratParent 생성자 -> A 생성자
		//a.n = 10;		a.n은 private이라서 이렇게 전달 못함	<- 이거 안됨

		// 이것들은 됨
		// A a = new A();
		// a.setN(20);
		
		//A a = new A(100);
		//System.out.println(a.getN());
		
		
		// 인터페이스는 타입으로 존재한다
		// IB ib = new IB();	// 인터페이스도 객체 생성이 불가하다
		//IB b = new B();			// 대신 이렇게는 가능하다	
		//b.f1();
		//System.out.println(b.f2());
		
		
		IB[] arr_ib = new IB[3];
		A a = new A();
		B b = new B();
		C c = new C();
		
		arr_ib[0] = a;
		arr_ib[1] = b;
		arr_ib[2] = c;
		
		for(int i=0; i<arr_ib.length; i++) {
			arr_ib[i].f1();
			arr_ib[i].f2();
		}
	}
}


//C타입의 클래스를 만든다
