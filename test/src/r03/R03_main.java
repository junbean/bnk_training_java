package r03;

import v0.A;

public class R03_main {

	public static void main(String[] args) {
		A a = new A();
		
		//a.n = 1;	// private로 지정해서 외부에서 값을 지정할수 없다
		
		a.setN(1);
		a.setS("ee");
		
		System.out.println(a.getN());
		System.out.println(a.getS());
		System.out.println(a.showInfo());
		System.out.println(a.toString());
		System.out.println(a);	// 이것도 toString()을 반환한다. 모든 클래스는 toString()이란 메서드를 가진다
		
	}
}

// ctrl + shift + O
