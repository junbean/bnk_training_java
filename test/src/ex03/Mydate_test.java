package ex03;

public class Mydate_test {
	public static void main(String[] args) {
		Mydate md = new Mydate();
		
		// 년도
		md.setYear(2025);
		md.setMonth(3);
		md.setDate(26);
		System.out.println(md.toString());
		System.out.println();	// 빈칸
		
		// 예외발생 - month
		System.out.println("month error");	
		md.setMonth(0);
		md.setMonth(13);
		System.out.println();	// 빈칸
		
		// 예외 발생 - date
		// 기본
		System.out.println("date error");	
		md.setDate(0);
		md.setDate(32);
		System.out.println();	// 빈칸
		
		// 28
		System.out.println("date limit - 28");	
		md.setMonth(2);
		md.setDate(29);
		System.out.println();	// 빈칸
		
		// 30
		System.out.println("date limit - 30");
		md.setMonth(4);
		md.setDate(31);
		System.out.println();	// 빈칸
		
		// 31
		System.out.println("date limit - 31");
		md.setMonth(5);
		md.setDate(32);
	}
}

// 28 - 2월
// 30 - 4,6,9,11 월
// 31 - 1,3,5,7,8,10,12 월