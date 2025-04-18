package ex13;

public class Day2Test {

	public static void main(String[] args) {

		for(Day2 day : Day2.values()) {
			System.out.println(day + " : " + day.getKorName() + ", " + day.getEngName());
		}
		
		System.out.println();	// 빈칸
		
		Day2 today = Day2.FRIDAY;
		System.out.println("오늘은 " + today.getKorName());
		System.out.println("Today is " + today.getEngName());

	}

}
/*
 
회원 클래스 만드시오 : user

 회원의 멤버변수는 
 	회원번호
 	이름
 	성별
 	회원등급
  
성별은 
	남자(MALE)
	여자(FEMALE)
 
 회원등급
 	골드(GOLD)
 	실버(SILVER)
 	브론즈(BRONZE)
 	
 회원 등급이 골드인 회원은 할인율이 10% 적용
 회원 등급이 실버인 회원은 할인율이 5% 적용
 회원 등급이 브론즈인 회원은 할인율이 2% 적용
 
 user 클래스에 pay()메소드를 만드시오
 void pay(int price)
 회원등급과 실제 지불한 급액을 콘솔에 출력하는 기능
 
 
*/