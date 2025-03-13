package ex01;

public class Test_nested {

	public static void main(String[] args) {
		
		// 세로 구구단
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print("\t" + i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 옆으로 구구단
		for(int j=1; j<=10; j++) {
			for(int i=2; i<10; i++) {
				System.out.print("\t" + i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
			
		

	}
}
