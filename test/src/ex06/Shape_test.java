package ex06;

public class Shape_test {

	public static void main(String[] args) {

		Triangle t = new Triangle("삼격형");
		t.w = 10;
		t.h = 20;
		
		Rectangle r = new Rectangle("사각형");
		r.w = 10;
		r.h = 20;

		Circle c = new Circle("원");
		c.r = 10;

		Shape[] shape = new Shape[3];
		shape[0] = t;
		shape[1] = r;
		shape[2] = c;
		
		CalcArea calc = new CalcArea();

		for (int i = 0; i < 3; i++) {
			calc.calcArea(shape[i]);
			System.out.println("==============================================");
		}

	}

}
