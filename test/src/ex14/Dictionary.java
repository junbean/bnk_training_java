package ex14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// 한영 사전 만들기
		// 조회해주는 프로그램 만들기
		Map<String, String> directory = new HashMap<>();
		makeDirectory(directory);
		
		Scanner sc = new Scanner(System.in);
		String select;
		// String word;
		
		while(true) {
			System.out.print("한/영 사전 단어 조회하기(종료:[0] 단어등록:[1] 단어찾기:[한글입력]) : ");
			select = sc.next();

			// 프로그램 종료
			if(select.equals("0")) {
				System.out.println("프로그램을 종료합니다..");
				break;
			} else if(select.equals("1")) {
				System.out.print("한글 단어 입력 : ");	
				String kor = sc.next();
				System.out.print("영어 단어 입력 : ");
				String eng = sc.next();
				
				directory.put(kor, eng);
				System.out.println("사전에 새로운 단어를 등록했습니다!");
			} else {
				// 메인 로직
				findWord(directory, select);
			}
			
			
			System.out.println();	// 빈칸
		}
	}
	
	// 사전 만드는 함수
	public static void makeDirectory(Map<String, String> directory) {
		directory.put("가다", "go");
		directory.put("오다", "come");
		directory.put("먹다", "eat");
		directory.put("열다", "open");
		directory.put("요리하다", "cook");
		directory.put("만들다", "make");
		directory.put("사다", "buy");
		directory.put("팔다", "sell");
		directory.put("부르다", "call");
		directory.put("말하다", "tell");
		directory.put("가져오다", "bring");
		directory.put("먹이다", "feed");
		directory.put("생각하다", "think");
		directory.put("노래하다", "sing");
		directory.put("놀다", "play");
	}

	public static void findWord(Map<String, String> directory, String select) {
		if(directory.get(select) == null) {
			System.out.println("사전에 존재하지 않는 단어입니다...");
		} else {
			String word = directory.get(select);
			System.out.println(select + " - " + word);
		}
	}
}

/*

public static void main(String[] args) {
	// 한영 사전 만들기
	// 조회해주는 프로그램 만들기
	Map<String, String> directory = new HashMap<>();
	makeDirectory(directory);
	
	Scanner sc = new Scanner(System.in);
	String select;
	String word;
	
	while(true) {
		System.out.print("한/영 사전 단어 조회하기(종료:[0]) : ");
		select = sc.next();

		// 프로그램 종료
		if(select.equals("0")) {
			System.out.println("프로그램을 종료합니다..");
			break;
		}
		
		// 메인 로직
		if(directory.get(select) == null) {
			System.out.println("사전에 존재하지 않는 단어입니다...");
		} else {
			word = directory.get(select);
			System.out.println(select + " - " + word);
		}
		
		System.out.println();	// 빈칸
	}
}

*/
