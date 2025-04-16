package ex10;

public class LambdaTest1 {

	public static void main(String[] args) {
		/*
		Unit unit = new Human(); 
		unit.move();
		*/

		/*
		Unit unit = new Unit() {

			@Override
			public void move() {
				System.out.println("인간의 움직임 발견..");
			}

		};
		unit.move();
		*/

		// 람다 표현식
		// 이것은 인터페이스의 추상 메서드가 하나일 경우에만 가능하다
		// 만약 추상메서드가 두개 이상이라면 사용이 불가능하다
		
		// 람다 표현식 - 매개변수와 반환이 없는 경우
		Unit unit1 = () -> {
			System.out.println("인간의 움직임 발견했습니다.");
		};
		unit1.move();
		
		Unit unit1_2 = () -> System.out.println("인간 발견");
		unit1_2.move();
		
		System.out.println("//=================================================//");
		
		// 람다 표현식 - 추상 메서드에 매개변수가 있는 경우
		Unit2 unit2 = (String s) -> {
			System.out.println(s);
		};
		unit2.move("move move...");
		
		// 람다 표현식 - 간소화
		/*
		방법 #1
		Unit2 unit2_2 = (s) -> System.out.println(s);
		unit2_2.move("go and go"); 
		*/
		
		// 방법 #2
		Unit2 unit2_2 = s -> System.out.println(s);
		unit2_2.move("go and go");
		
		System.out.println("//=================================================//");
		
		// 람다 표현식 - 매개변수가 2개 
		Unit3 unit3 = (String s1, String s2) -> {
			System.out.println(s1 + " " + s2);
		};
		unit3.move("가위", "바위");
	
		Unit3 unit3_2 = (s1, s2) -> System.out.println(s1 + " " + s2);
		unit3_2.move("묵", "찌");
		
		System.out.println("//=================================================//");
		
		// 람다 표현식 - 추상메서드의 반환값을 받을 떄
		Unit4 unit4 = (s) -> { return s.length(); };
		int result1 = unit4.move("가나다라");
		System.out.println(result1);
		
		/*
		// 방법 #1
		Unit4 unit4_2 = (s) -> s.length();
		int result2 = unit4_2.move("일이삼");
		*/
		
		// 방법 #2
		Unit4 unit4_2 = s -> s.length();
		int result2 = unit4_2.move("일이삼");
		System.out.println(result2);
		
		System.out.println("//=================================================//");
		
		// 주의!!
		// 람다표현식은 인터페이스의 추상메서드가 1개일 때만 가능하다
		// 추상메서드가 2개 이상일때는 람다표현식이 안된다
		// 아래는 에러가 발생한다
		/*
		Unit5 unit5 = s -> {
			System.out.println(s1 + " " + s2);	
			return s.length();
		};
		*/
	}

}
