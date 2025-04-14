package ex07;

public class PointTest {

	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;
		try {
			// 이러면 에러발생
			// clone 메서드를 그냥 지원하지 않음
			// 멤버클래스에 Cloneable 인터페이스를 implements 해야한다
			// 이런 Cloneable 인터페이스를 마커 인터페이스라고 부른다
			// 
			cpy = (Point) org.clone();
			org.showPosition();
			cpy.showPosition();
			
			System.out.println("=====================================================");
			
			cpy.setXPos(10);
			cpy.setYPos(30);
			
			org.showPosition();
			cpy.showPosition();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
