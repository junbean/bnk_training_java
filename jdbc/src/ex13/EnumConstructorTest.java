package ex13;

enum Human4 {
	MAN, WOMAN;
	
	private Human4() {
		System.out.println("Human construtor called...");
	}
}

public class EnumConstructorTest {

	public static void main(String[] args) {
		System.err.println(Human4.MAN);	// 생성자 먼저 호출
		System.err.println(Human4.WOMAN);		
	}

}
