package ex01;

import java.util.Random;
import java.util.Scanner;

public class Test_rsp {

	public static void main(String[] args) {
		// 가위-바위-보 게임 만들기
		// 사용자의 전적, 사용자가 끝내고 싶을때 게임을 끝내도록

		Random rd = new Random();
		int computer = 0;

		Scanner sc = new Scanner(System.in);
		int ans;
		int user;

		int win = 0;
		int draw = 0;
		int lose = 0;
		int lose_on = 0;

		int[] computer_arr = new int[3];

		String computer_mean;
		String user_mean;

		while (true) {
			// 힌트 기능
			if (lose_on >= 3) {
				System.out.println("힌트! 이때까지 컴퓨터의 통계");
				for (int i = 0; i < 3; i++) {
					if (i == 0) {
						System.out.println("컴퓨터의 가위 횟수 : " + computer_arr[i]);
					} else if (i == 1) {
						System.out.println("컴퓨터의 바위 횟수 : " + computer_arr[i]);
					} else {
						System.out.println("컴퓨터의 보 횟수 : " + computer_arr[i]);
					}
				}
				System.out.println(); // 빈칸
			}
			
			// 게임 실행
			System.out.println("가위바위보를 시작합니다! (가위[1] 바위[2] 보[3] 그만두기[4])");
			computer = rd.nextInt(3) + 1; // 컴퓨터 랜덤값 1-가위 2-바위 3-보
			user = sc.nextInt(); // 사용자 입력

			System.out.println(); // 빈칸

			// 컴퓨터가 낸거 숫자를 문자로 변환
			if (computer == 1) {
				computer_mean = "가위";
			} else if (computer == 2) {
				computer_mean = "바위";
			} else {
				computer_mean = "보";
			}

			// 사용자가 낸거
			if (user == 1) {
				user_mean = "가위";
			} else if (user == 2) {
				user_mean = "바위";
			} else {
				user_mean = "보";
			}
			
			
			// 승부 판별
			if (user == computer) {
				System.out.println("사용자 : " + user_mean);
				System.out.println("컴퓨터 : " + computer_mean);
				System.out.println("무승부!");
				draw = draw + 1;
			} else if(user == 4) {
				System.out.println("게임을 종료합니다");
				System.out.println("승리 : " + win + " / 패배 : " + lose + " / 무승부 : " + draw);
				System.out.println("승률 : " + (double)win/(win+lose+draw) * 100 + "%");
				break;
			} else {
				// 승패 판별
				if (computer == 1 && user == 3) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("패배하였습니다...");
					lose = lose + 1;
					lose_on = lose_on + 1;
				} else if (computer == 3 && user == 1) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("승리했습니다!");
					win = win + 1;
					lose_on = 0;
				} else if(user <= 3 && user >= 1) {
					if (computer > user) {
						System.out.println("사용자 : " + user_mean);
						System.out.println("컴퓨터 : " + computer_mean);
						System.out.println("패배하였습니다...");
						lose = lose + 1;
						lose_on = lose_on + 1;
					} else if (computer < user) {
						System.out.println("사용자 : " + user_mean);
						System.out.println("컴퓨터 : " + computer_mean);
						System.out.println("승리했습니다!");
						win = win + 1;
						lose_on = 0;
					}
				} else {
					// 올바르지 않은 입력
					System.out.println("입력이 올바르게 이뤄지지 않아 무효 처리되었습니다.");
				}
			}

			// 컴퓨터 정보 통계
			if(computer == 1) {
				computer_arr[0] += 1;
			} else if(computer == 2) {
				computer_arr[1] += 1;
			} else {
				computer_arr[2] += 1;
			}

			System.out.println();	// 빈칸 
		}
	}
}


/*

public static void main(String[] args) {
	// 가위-바위-보 게임 만들기
	// 사용자의 전적, 사용자가 끝내고 싶을때 게임을 끝내도록

	Random rd = new Random();
	int computer = 0;

	Scanner sc = new Scanner(System.in);
	int ans;
	int user;

	int win = 0;
	int draw = 0;
	int lose = 0;
	int lose_on = 0;

	int[] computer_arr = new int[3];

	String computer_mean;
	String user_mean;

	while (true) {
		System.out.println("게임을 계속할래? 예[1] 아니오[2]");
		ans = sc.nextInt();

		System.out.println(); // 빈칸

		if (ans == 1) {
			// 연패시 힌트 기능
			if (lose_on >= 3) {
				System.out.println("힌트! 이때까지 컴퓨터의 통계");
				for (int i = 0; i < 3; i++) {
					if (i == 0) {
						System.out.println("컴퓨터의 가위 횟수 : " + computer_arr[i]);
					} else if (i == 1) {
						System.out.println("컴퓨터의 바위 횟수 : " + computer_arr[i]);
					} else {
						System.out.println("컴퓨터의 보 횟수 : " + computer_arr[i]);
					}
				}
				System.out.println(); // 빈칸
			}

			
			// 게임 실행
			System.out.println("가위바위보를 시작합니다! (가위[1] 바위[2] 보[3])");
			computer = rd.nextInt(3) + 1; // 컴퓨터 랜덤값 1-가위 2-바위 3-보
			user = sc.nextInt(); // 사용자 입력

			System.out.println(); // 빈칸

			// 컴퓨터가 낸거
			if (computer == 1) {
				computer_mean = "가위";
			} else if (computer == 2) {
				computer_mean = "바위";
			} else {
				computer_mean = "보";
			}

			// 사용자가 낸거
			if (user == 1) {
				user_mean = "가위";
			} else if (user == 2) {
				user_mean = "바위";
			} else {
				user_mean = "보";
			}
			if (user == computer) {
				System.out.println("사용자 : " + user_mean);
				System.out.println("컴퓨터 : " + computer_mean);
				System.out.println("무승부!");
				draw = draw + 1;
			} else {
				if (computer == 1 && user == 3) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("패배하였습니다...");
					lose = lose + 1;
					lose_on = lose_on + 1;
				} else if (computer == 3 && user == 1) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("승리했습니다!");
					win = win + 1;
					lose_on = 0;
				} else if (computer > user && user <= 3 && user >= 1) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("패배하였습니다...");
					lose = lose + 1;
					lose_on = lose_on + 1;
				} else if (computer < user && user <= 3 && user >= 1) {
					System.out.println("사용자 : " + user_mean);
					System.out.println("컴퓨터 : " + computer_mean);
					System.out.println("승리했습니다!");
					win = win + 1;
					lose_on = 0;
				} else {
					System.out.println("입력이 올바르게 이뤄지지 않아 무효 처리되었습니다.");
				}
			}

			// 컴퓨터 정보 통계
			if(computer == 1) {
				computer_arr[0] += 1;
			} else if(computer == 2) {
				computer_arr[1] += 1;
			} else {
				computer_arr[2] += 1;
			}

			System.out.println();

		} else if (ans == 2) {
			// 게임 종료
			System.out.println("게임을 종료합니다");
			System.out.println("승리 : " + win + " / 패배 : " + lose + " / 무승부 : " + draw);
			break;
		} else {
			System.out.print("올바른 선택지를 고르시기 바랍니다 - ");
		}
	}
}

*/