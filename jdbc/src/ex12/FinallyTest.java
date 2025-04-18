package ex12;

public class FinallyTest {

	public static void main(String[] args) {
		System.out.println("----Start----");
		
		try {
			String s = null;		 
			System.out.println(s.charAt(0));	
		} catch(NullPointerException e) {
			// 문제가 발생하면 -> 문제가 생겼다고 알려주고, 프로그램은 지속되어야 한다
			System.out.println("s에 문자열이 담겨있지 않습니다.");
		} finally {
			System.out.println("try-catch가 끝난후에 실행하는 기능");
		}
		
		System.out.println("----End----");
		
		
		//	================================================================================
		
		/*
		// try 문이 없는 경우
		System.out.println("----Start----");
		
		String s1 = null;		// 예외 발생 유발 
		String s2 = "aaa"; 
		
		
		System.out.println(s1.charAt(0));	// 문자열 s가 null이기 때문에 nullPointer예외가 발생한다
		
		// 문제가 발생하면 -> 문제가 생겼다고 알려주고, 프로그램은 지속되어야 한다
		System.out.println("----End----");
		*/
	}

}
