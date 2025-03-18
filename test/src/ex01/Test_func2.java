package test;

public class Test_func2 {

	public static void main(String[] args) {
		// f1(1);
		// f2();
		
		/*
		int n1 = 10;
		int n2 = 20;

		int[] result_f = f(n1, n2);

		System.out.println(n1 + " + " + n2 + " = " + result_f[0]);
		System.out.println(n1 + " - " + n2 + " = " + result_f[1]);
		*/
		
		/*
		int n = 20;
		char x = 'A';
		func1(n, x);
		System.out.println("---End---");
		*/
		
		int[] arr = new int[2];
		int n1 = 5;
		int n2 = 3;
		
		arr[0] = n1;
		arr[1] = n2;
		System.out.printf("f함수 실행 전 : %d, %d\n", arr[0], arr[1]);
		
		func2(arr);
		System.out.printf("f함수 실행 후 : %d, %d\n", arr[0], arr[1]);
	}

	static void f1(int n) {
		System.out.println("-------------------");
	}

	static void f2() {
		f1(10);
	}

	static int f3() {
		return 3;
	}

	static int[] f(int num1, int num2) {
		int sum = num1 + num2;
		int sub = num1 - num2;
		int[] result = { sum, sub };

		return result;
	}
	
	// 출력 결과 = AAAAAAAAAAAAAAAAAAAA
	// 변형. 5번째 마다 문자는 B로 변형한다 
	static void func1(int count, char letter) {
		for(int i=1; i<=count; i++) {
			if(i % 5 == 0) {
				System.out.print('B');	
			} else {
				System.out.print(letter);	
			}
		}
		System.out.println();
	}
	
	static int[] func2(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		return new int[]{num1, num2};
	}
	
	static int[] func2(int[] x) {
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
		
		return x;
	}
}
