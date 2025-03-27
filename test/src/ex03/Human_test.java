package ex03;

public class Human_test {

	public static void main(String[] args) {
		/*
		 * Human human = new Human();
		 * 
		 * human.setName("준빈"); System.out.println(human.getName());
		 * System.out.println(); // 빈칸
		 * 
		 * // 예외 확인 human.setAge(0); System.out.println("나이 출력 : " + human.getAge());
		 * human.setAge(201); System.out.println("나이 출력 : " + human.getAge());
		 * System.out.println(); // 빈칸
		 * 
		 * // 문자열 확인 System.out.println(human.toString());
		 * 
		 * // 정상 출력 human.setAge(25); System.out.println("나이 출력 : " + human.getAge());
		 * System.out.println(human.toString()); System.out.println(); // 빈칸
		 * 
		 * 
		 * // 매개변수가 있는 형변환 Human human2 = new Human("james", 11);
		 * System.out.println("이름 출력 : " + human2.getName());
		 * System.out.println("나이 출력 : " + human2.getAge());
		 */

		/*
		 * Human human1 = new Human(); Human human2 = new Human(); Human human3 = new
		 * Human(); Human human4 = new Human(); Human human5 = new Human(); Human human6
		 * = new Human(); Human human7 = new Human(); Human human8 = new Human(); Human
		 * human9 = new Human(); Human human10 = new Human();
		 * 
		 * 
		 * System.out.println("번호 : " + human1.getNumber()); System.out.println("번호 : "
		 * + human5.getNumber()); System.out.println("번호 : " + human10.getNumber());
		 * System.out.println("현재 사람 수 : " + Human.sequence);
		 */

		// =============================================================
		// 10개의 사람 배열 생성
		Human[] arr_human = new Human[10];

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				arr_human[i] = new Human('W');
			else
				arr_human[i] = new Human('M');
		}
		
		
		// =============================================================
		// 성별의 수를 알아내기		
		//calc_gender_amount(arr_human);
		Human_method hm = new Human_method();
		hm.calc_gender_amount(arr_human);
		System.out.println();	// 빈칸

		
		// =============================================================
		// 번호가 4번인 사람의 성별을 알아내기
		for (int i = 0; i < arr_human.length; i++) {
			if (arr_human[i].getNumber() == 4) {
				if (arr_human[i].getGender() == 'W')
					System.out.println("성별은 여자입니다");
				else 
					System.out.println("성별은 남자입니다");
			}
		}
		System.out.println();	// 빈칸
		
		
		for (int i = 0; i < arr_human.length; i++) {
			System.out.println(arr_human[i].getNumber() + "번의 성별은 " + arr_human[i].getGender());
			
		}
	}
	
	// 사람 배열 넣어서 성별 각각 갯수를 구하기
	public static void calc_gender_amount(Human[] arr_human) {
		int male_count = 0;
		int female_count = 0;

		for (int i = 0; i < arr_human.length; i++) {
			if (arr_human[i].getGender() == 'M') {
				male_count++;
			} else {
				female_count++;
			}
		}

		System.out.println("남자의 수: " + male_count);
		System.out.println("여자의 수: " + female_count);		
	}
	
	public void find_gender() {
		
	}
}
