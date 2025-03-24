package test;

public class Calculator_test {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//cal.a = 10;
		//cal.b = 2;
		
		int result1 = cal.add(10, 2);
		System.out.println("add연산 : " + result1);

		int result2 = cal.sub(10, 2);		
		System.out.println("sub연산 : " + result2);
		
		int result3 = cal.mul(10, 2);
		System.out.println("mul연산 : " + result3);
		
		double result4 = cal.div(10, 2);
		System.out.println("div연산 : " + result4);
		
	}

}
