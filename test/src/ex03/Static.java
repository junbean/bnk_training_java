package ex03;

public class Static {
	// static이 붙으면 클래스 변수로 불린다
	// 클래스 변수는 클래스에서 하나만 존재한다. <- 그래서 따로 객체를 만들더라도 클래스 변수는 하나만 존재함
	// 추가로 static은 접근제한자가 아니라 제어자 또는 키워드라고 불린다
	
	// 핵심
	// static은 클래스 레벨에서 작동하돌고 만드는 키워드
	static int a;
	
	public void setA(int b) {
		a = a + b;
	}
	
	static void hello() {
		System.out.println("heeloo");
	}
	
	static {
		System.out.println("클래스가 메모리에 올라갈 때 한 번 실행!");	
	}
}
