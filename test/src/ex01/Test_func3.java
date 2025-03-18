package test;

import java.util.Random;
import java.util.Scanner;

public class Test_func3 {

	// 메인함수 역할
	// 랜덤수, 사용자 입력 함수 받기
	// 판별 함수로 돌리기
	public static void main(String[] args) {
		int user;
		int computer;
		int[] record = new int[3]; // 승리, 패배, 무승부

		while (true) {
			computer = computerInput();
			user = userInput();
			System.out.println(); // 빈칸

			// 사용자가 게임 종료
			if (user == 0) {
				System.out.println("게임을 종료합니다");
				System.out.println(); // 빈칸
				currentRecord(record);
				break;
			}

			// 가위바위보 로직
			mainLogic(user, computer, record);
			System.out.println(); // 빈칸
		}
	}

	static int computerInput() {
		Random rd = new Random();
		int rdNum = rd.nextInt(3) + 1;
		return rdNum;
	}

	static int userInput() {
		Scanner sc = new Scanner(System.in);
		int user;

		while (true) {
			// 사용자 입력
			System.out.print("가위~바위~보!(가위:1 바위:2 보:3 끝내기:0) : ");
			user = sc.nextInt();
			
			// 입력값이 올바른지 판별
			if (checkCorrectInput(user)) {
				break;
			} else {
				System.out.println("올바르지 않은 입력값입니다. 입력값은 1~3사이의 정수입니다.");
				System.out.println(); // 빈칸
			}
		}

		return user;
	}

	// false 출력 -> 다시
	// true 출력 -> 나감
	static boolean checkCorrectInput(int user) {
		boolean isCorrect = false; // 입력값이 맞는지 판별

		if (user > 3 || user < 0) {
			isCorrect = false;
		} else {
			isCorrect = true;
		}

		return isCorrect;
	}

	static void mainLogic(int user, int computer, int[] record) {
		// 사용자
		switch (user) {
		case 1 -> System.out.print("사용자 : 가위\t<->\t");
		case 2 -> System.out.print("사용자 : 바위\t<->\t");
		case 3 -> System.out.print("사용자 : 보\t<->\t");
		}

		// 컴퓨터
		switch (computer) {
		case 1 -> System.out.println("컴퓨터 : 가위");
		case 2 -> System.out.println("컴퓨터 : 바위");
		case 3 -> System.out.println("컴퓨터 : 보");
		}

		if (user == computer) {
			System.out.println("무승부!");
			record[2] = record[2] + 1;
		} else if (user > computer) {
			if (user == 3 && computer == 1) {
				System.out.println("사용자의 패배입니다...");
				record[1] = record[1] + 1;
			} else {
				System.out.println("사용자의 승리입니다!!");
				record[0] = record[0] + 1;
			}
		} else if (user < computer) {
			if (user == 1 && computer == 3) {
				System.out.println("사용자의 승리입니다!!");
				record[0] = record[0] + 1;
			} else {
				System.out.println("사용자의 패배입니다...");
				record[1] = record[1] + 1;
			}
		}
		System.out.println(); // 빈칸

		currentRecord(record);
	}

	static void currentRecord(int[] record) {
		int count = 0;
		System.out.println("현재 사용자 전적 통계");

		for (int i = 0; i < record.length; i++) {
			switch (i) {
			case 0 -> System.out.print("승리:" + record[i] + "\t");
			case 1 -> System.out.print("패배:" + record[i] + "\t");
			case 2 -> System.out.print("무승부:" + record[i] + "\t");
			}
			count = count + record[i];
		}
		System.out.println(); // 빈칸
		System.out.println("승률 : " + (double)record[0]/count * 100);
	}

}

// user : 1 	computer : 2 	-> 	computer win
// user : 1 	computer : 3 	-> 	user win
// user : 2 	computer : 1 	-> 	user win
// user : 2 	computer : 3 	-> 	computer win
// user : 3 	computer : 1 	-> 	computer win
// user : 3 	computer : 2 	-> 	user win

/*
 * if(user==computer) { System.out.println("무승부!"); continue; }
 * 
 * if(user > computer) { if(user == 3 && computer == 1) {
 * System.out.println("컴퓨터의 승리입니다..."); } else {
 * System.out.println("사용자의 승리입니다!!"); } } else if(user < computer) { if(user ==
 * 1 && computer == 3) { System.out.println("사용자의 승리입니다!!"); } else {
 * System.out.println("컴퓨터의 승리입니다..."); } } else {
 * System.out.println("게임을 종료합니다"); break; }
 */