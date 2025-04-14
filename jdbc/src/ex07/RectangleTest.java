package ex07;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,1,9,9);
		Rectangle r2;
		Set<Rectangle> set_rec = new HashSet<>(); 
		
		try {
			r2 = (Rectangle) r1.clone();

			r1.showPosition();
			System.out.println();
			r2.showPosition();
			
			System.out.println("=========================================");
			System.out.println(r1);
			System.out.println(r2);
			
			set_rec.add(r1);
			set_rec.add(r2);
			System.out.println("해시 셋의 크기 : " + set_rec.size());
			
			System.out.println("=========================================");
			
			r2.changePos(3, 3, 5, 5);
			
			r1.showPosition();
			System.out.println();
			r2.showPosition();
			System.out.println("=========================================");
			
			System.out.println("해시 셋의 크기 : " + set_rec.size());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
