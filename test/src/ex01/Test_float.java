package ex01;

public class Test_float {

	public static void main(String[] args) {
		/*
		float f = 13.625f;
		int n = Float.floatToIntBits(f);

		System.out.println(n);
		System.out.println(Integer.toBinaryString(n));
			
		*/
		
		//=======================================================================================
		
		/*
		byte bNum = -128;		
		// bNum = bNum + 1;	// 에러 발생
		bNum = (byte)(bNum - 1);	// byte타입으로 형변환
		System.out.println(bNum);
		
		
		int x = 20;
		x = x + 10;
		*/
		
		//=======================================================================================
		
		/*
		// 정수의 진법 접두어
		int n = 10;
		
		String binaryString = Integer.toBinaryString(n);
		System.out.println(binaryString);
		
		int n2 = 0b1010;		// 2진수 접두어 : 0b
		System.out.println(n2);
		
		int n3 = 0017;	// 8진수 접두어 : 0      
		System.out.println(n3);
		
		int n4 = 0x45;	// 16진수 접두어: 0x
		System.out.println(n4);
	
		*/
		//===========================================================================================
	
		// 비트 이동
		int n = -1;		// 0001
		System.out.println(n << 1);
		System.out.println(n << 2);
		System.out.println(n << 3);
		System.out.println(n >> 1);
		System.out.println(n >> 2);

	}
}
