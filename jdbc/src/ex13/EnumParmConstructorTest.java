package ex13;

enum Person3 {
	// enum에 파라미터를 전달할 수 있다
	
	MAN(29), WOMAN(32);

	int age;
	
	private Person3(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "I am " + age + " years old" ;
	}
}


public class EnumParmConstructorTest {

	public static void main(String[] args) {
		System.out.println(Person3.MAN);
		System.out.println(Person3.WOMAN);
	}

}
