package test;

public class Test_func5 {

	// 1111이란 값이 나와야 함
	public static void main(String[] args) {
		int n = 1;
		int result = f(n);
		System.out.println(result);
	}

	static int f(int a) {
		int n = 10;
		return f2(a, n);
	}
	
	static int f2(int a, int b) {
		int n = 100;
		return f3(a, b, n);
	}
	
	static int f3(int a, int b, int c) {
		int n = 1000;
		return f4(a, b, c, n);
	}
	
	static int f4(int param1, int param2, int param3, int param4) {
		return param1 + param2 + param3 + param4;
	}
	
}
