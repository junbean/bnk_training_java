package ex13;

// enum도 toString 사용 가능
enum Human3 {
	MAN, WOMAN;
	
	@Override
	public String toString() {
		return super.toString();
	}
}

public class InClassInst {

	public static void main(String[] args) {
		System.out.println(Human3.MAN);
		System.out.println(Human3.WOMAN);
	}

}
