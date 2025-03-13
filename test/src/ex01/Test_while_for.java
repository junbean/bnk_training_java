package test;

public class Test_while_for {

	public static void main(String[] args) {

		// 반복문
		
		// int n = 1; while (n <= 5) { System.out.println(n + ". hi"); n = n + 1; }
		 

		// 1, 3, 5, 7 .. 99까지의 합계 구하기
		/*
		 * int sum = 0; int n = 1;
		 * 
		 * while(n <= 99) { System.out.println("n : " + n);
		 * 
		 * sum = sum + n; n = n + 2; }
		 * 
		 * System.out.println("sum의 값은 " + sum);
		 */
		 

		// ======================================================

		// 1/2, 2/3, 3/4 ... 49/50
		
		/*
		 * double sum = 0; double n = 2;
		 * 
		 * while(n <= 50) { sum = sum + (n-1)/n; System.out.println("n : " + (n-1)/n);
		 * System.out.println("sum : " + sum);
		 * System.out.println("//==========================="); n = n + 1; }
		 * 
		 * System.out.println("sum의 값은 " + sum);
		 */
		 

		// ======================================================
		// 반복문 for
		
		  for(int idx=0; idx<10; idx++) { System.out.println("hello"); }
		 
	}

}
