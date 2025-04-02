package ex08;

public class Test {
	public static void main(String[] args) {

		ArrayInt ex2 = new ArrayInt();
		ex2.show("추가한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.add(1);
		ex2.add(2);
		ex2.add(3);
		ex2.show("추가한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.add(4);
		ex2.add(5);
		ex2.show("추가한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.add(6);
		ex2.add(7);
		ex2.show("추가한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.add(8);
		ex2.add(9);
		ex2.add(10);
		ex2.show("추가한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		System.out.println("==================================================");
		
		ex2.delete(0);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.delete(2);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.delete(4);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.delete(6);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.delete(0);
		ex2.delete(1);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		ex2.delete(2);
		ex2.delete(3);
		ex2.show("삭제한 배열의 결과");
		System.out.println("현재 배열의 유효한 길이 : " + ex2.getValidLength());
		
	}
}
//https://chatgpt.com/c/67ecc5b3-a8e0-800a-ad11-fd1299e4a0ec
