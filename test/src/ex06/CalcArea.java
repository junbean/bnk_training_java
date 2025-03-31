package ex06;


public class CalcArea {
	void calcArea(Shape shape) {
		// 4개의 타입이 들어갈수 있다
		if(shape instanceof Triangle) {
			Triangle triangle = (Triangle)shape;
			System.out.println(shape.name + "의 넓이는 : " +  (triangle.w * triangle.h) / 2);
		} else if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)shape;
			System.out.println(shape.name + "의 넓이는 : " +  (rectangle.w * rectangle.h));
		} else if(shape instanceof Circle) {
			Circle circle = (Circle)shape;
			System.out.println(shape.name + "의 넓이는 : " + circle.pie * (circle.r * circle.r) );
		}
	}
	
	/*
	void calcArea(Triangle triangle) {
		System.out.println(triangle.name + "의 넓이는 : " +  (triangle.w * triangle.h)/2);
	}

	void calcArea(Rectangle rectangle) {
		System.out.println(rectangle.name + "의 넓이는 : " +  (rectangle.w * rectangle.h));
	}

	void calcArea(Circle circle) {
		System.out.println(circle.name + "의 넓이는 : " +  circle.pie*(circle.r * circle.r));
	}
	*/
}
