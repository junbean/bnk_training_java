package ex01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 최초 실행
		/*
		 * System.out.println("Hello JAVA!"); System.out.print("Hello JAVA! - ");
		 * System.out.println("Hello JAVA!");
		 */

		// ============================================================

		// 자료와 변수명
		/*
		 * int a, b, c; a = 1; b = 200000000; c = a + b; System.out.println("c의 값은 " + c
		 * + "입니다."); // 출력
		 */

		// ============================================================

		// 짝수 판별
		// int a = 2;
		/*
		 * System.out.print("a : "); Scanner in = new Scanner(System.in); int a =
		 * in.nextInt();
		 * 
		 * 
		 * if(a % 2 == 0) { System.out.println("a는 짝수입니다."); } else {
		 * System.out.println("a는 홀수입니다."); }
		 */

		// ============================================================

		// 두개의 숫자 입력 후 대소 비교

		/*
		System.out.print("a : ");
		Scanner in_a = new Scanner(System.in);
		int a = in_a.nextInt();

		System.out.print("b : ");
		Scanner in_b = new Scanner(System.in);
		int b = in_b.nextInt();

		if (a == b) {
			System.out.print("a와 b의 값은 같다");
		} else if (a > b) {
			System.out.print("a가 b보다 값이 크다");
		} else {
			System.out.print("b가 a보다 값이 크다");
		}
		*/

		// ============================================================

		// 세개의 값 크기 비교 (서로의 값은 중복되지 않음)
		/*
		 * int a, b, c; a = 9; b = 6; c = 4;
		 * 
		 * if (a > b) { if (a > c) { System.out.print("a가 최대값"); } else {
		 * System.out.print("c가 최대값"); } } else if (b > c) { System.out.print("b가 최대값");
		 * } else { System.out.print("c가 최대값"); }
		 */

		// ========================================================

		// 반복문
		int n = 1;
		while (n <= 5) {
			System.out.println(n + ". hi");
			n = n + 1;
		}
		
		
	}
}
/*
 * 
 * 자료현 정리
 * 
 * char(character) 문자를 나타냄 홀따옴표로 나타냄 String 문자열을 나타냄 쌍따옴표로 나타냄 클래스로 만들어져서 대문자로
 * 나타냄
 * 
 * INT(integer) 정수를 나타냄 double 실수를 나타냄 float 실수를 나타냄(10.0f)
 * 
 * 
 * 
 * 램 주기억장치
 * 
 */
