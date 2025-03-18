package test;

import java.util.Scanner;

public class Test_func1 {

	public static void main(String[] args) {
		/*
		int result = add3(5);
		System.out.println(result);
		*/
		
		// f1();
		// f2(11);
		
		/*
		int result_add = func_add(4,2);
		System.out.println("func_add의 결과는 " + result_add);
		int result_minus = func_minus(4,2);
		System.out.println("func_minus의 결과는 " + result_minus);
		int result_mul = func_mul(4,2);
		System.out.println("func_mul의 결과는 " + result_mul);
		int result_div = func_div(4,2);
		System.out.println("func_div의 결과는 " + result_div);
		*/
		
		/*
		calculator(8, 2);
		System.out.println("프로그램을 종료합니다");
		*/
		
		// 메인함수는 f1함수를 출력할수도 f2함수를 출력할수도 있음
		// Scanner 숫자를 입력
		// 음수를 입력하면 프로그램 종료
		// 0포함 양수입력 짝수 -> f1함수 실행
		// 홀수 -> f2함수 실행
		
		/*
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			input = sc.nextInt();
			
			if(input < 0) {
				System.out.println("프로그램 실행을 종료합니다");
				break;
			}
			
			if(input % 2 == 0) {
				f2();
			} else {
				f1();
			}
			
			System.out.println();
		}
		
		
		sc.close();
		*/
		
		/*
		linePrint(1);
		System.out.println();
		linePrint(3);
		System.out.println();
		linePrint(5);
		System.out.println();
		linePrint(7);
		System.out.println();
		linePrint(9);
		System.out.println();
		linePrint(11);
		System.out.println();
		linePrint(13);
		System.out.println();
		linePrint(15);
		System.out.println();
		linePrint(17);
		System.out.println();
		linePrint(19);
		*/
		
		/*
		linePrint2(1, '1');
		System.out.println();
		linePrint2(3, '가');
		System.out.println();
		linePrint2(5, 'a');
		System.out.println();
		linePrint2(7, '*');
		System.out.println();
		linePrint2(9, '@');
		*/
		
		// 정수 홀짝 판별 함수
		int a = 4;
		int b = 5;
		
		if(holZzak(a) == 1) {
			System.out.println("a는 홀수이다");
		} else if (holZzak(a) == 0) {
			System.out.println("a는 짝수이다");
		} else {
			System.out.println("a는 올바르지 못한 값");
		}
		

		if(holZzak(b) == 1) {
			System.out.println("b는 홀수이다");
		} else if (holZzak(b) == 0) {
			System.out.println("b는 짝수이다");
		} else {
			System.out.println("b는 올바르지 못한 값");
		}
	}
	
	public static int add3(int r) {
		int num = r + 3;
		return num;
	}
	
	public static void f1() {
		//f1();
		System.out.println("f1 실행됨");
	}
	
	public static void f2() {
		System.out.println("f2 실행됨");
	}
	
	public static void f2(int num1) {
		System.out.println("입력값은 " + num1);
	}

	// 사칙연산 함수
	public static int func_add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int func_minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int func_mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int func_div(int num1, int num2) {
		return num1 / num2;
	}
	
	public static void calculator(int num1, int num2) {
		int result_add = func_add(num1, num2);
		System.out.println("func_add의 결과는 " + result_add);
		
		int result_minus = func_minus(num1,num2);
		System.out.println("func_minus의 결과는 " + result_minus);
		
		int result_mul = func_mul(num1,num2);
		System.out.println("func_mul의 결과는 " + result_mul);
		
		int result_div = func_div(num1,num2);
		System.out.println("func_div의 결과는 " + result_div);
	}
	
	public static void linePrint(int num) {
		if(num < 2) {
			System.out.print("- ");			
		} else {
			for(int i=0; i<num; i++) {
				System.out.print("- ");			
			}
		}
	}
	
	public static void linePrint2(int num, char s) {
		if(num < 2) {
			System.out.print(s);			
		} else {
			for(int i=0; i<num; i++) {
				System.out.print(s + "\t");			
			}
		}
	}

	public static int holZzak(int num) {
		int result;
		
		if(num%2 == 0) {
			result = 0;
		} else {
			result = 1;
		}
		
		return result;
	}

		
}
