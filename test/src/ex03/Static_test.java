package ex03;

public class Static_test {

	public static void main(String[] args) {
		
		// static 블록에 있으면 클래스가 메모리에 올라갈때 한 번 실행
		Static s1 = new Static();
		Static s2 = new Static();
		
		// 객체가 다르더라도 static은 클래스에서 하나만 존재한다
		s1.setA(3);
		System.out.println(s1.a);
		
		s2.setA(4);
		System.out.println(s2.a);
		
		// 객체를 만들지 않아도 호출 가능
		Static.hello();
	}
}
