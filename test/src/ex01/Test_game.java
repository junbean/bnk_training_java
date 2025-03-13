package test;

import java.util.Random;
import java.util.Scanner;

public class Test_game {

	public static void main(String[] args) {
		// 몇번째에 맞췄는지 확인하는 코드 추가

		/*
		Random rd = new Random(); // 랜덤 변수 선언
		int rdNum = rd.nextInt(10) + 1; // nextInt(10) : 0~9까지의 숫자 랜덤

		Scanner sc = new Scanner(System.in);

		int input;
		int[] arr_n = new int[100]; // 입력값 저장 배열
		int cnt = 0; // 시도 횟수
		int score = 100; // 점수
		int high_score = 0; // 최고 점수
		int[] arr_sort = new int[10];

		while (true) {

			// 값 입력
			System.out.print("숫자를 입력하세요 : ");
			input = sc.nextInt();

			arr_n[cnt] = input; // 입력값 배열에 저장
			cnt++; // 시도 횟수 추가

			// 판별
			if (input == rdNum) {
				// 정답
				System.out.println("정답입니다!!. 랜덤값은 " + rdNum + "입니다.");
				System.out.println("점수는 " + score + "점입니다.");
				System.out.println();

				// 시도 횟수, 숫자 정보
				System.out.println("시도 횟수는 " + cnt + "번째 입니다.");
				System.out.print("시도한 숫자 : ");
				for (int i = 0; i < cnt; i++) {
					System.out.print(arr_n[i] + " ");
				}
				System.out.println();

				// 최고점 갱신
				if (score > high_score) {
					System.out.println();
					System.out.println("현재 최고점수를 갱신하였습니다!!");
					System.out.println("최고점 " + high_score + " -> " + score);
					high_score = score;
				}
				System.out.println();

				// 정답 통계 정보
				System.out.println("정답 통계 정보");
				arr_sort[rdNum - 1] = arr_sort[rdNum - 1] + 1;
				for (int i = 0; i < 10; i++) {
					if (arr_sort[i] != 0)
						System.out.println((i + 1) + "이 정답인 횟수 : " + arr_sort[i]);
				}

				System.out.println();
				System.out.println("게임을 계속하시겠습니까? 계속[1] 그만[2]");
				int ask_num = 2;
				while (true) {
					ask_num = sc.nextInt();
					if (ask_num != 1 && ask_num != 2) {
						System.out.println("올바른 숫자를 입력해주시기 바랍니다");
					} else {
						break;
					}
				}

				System.out.println();
				if (ask_num == 1) {
					// 게임 재시작
					System.out.println("게임을 재시작 합니다");
					score = 100;
					cnt = 0;
					rdNum = rd.nextInt(10) + 1;
					for (int i = 0; i < cnt; i++) {
						arr_n[i] = 0;
					}
					System.out.println();
				} else if (ask_num == 2) {
					// 게임 종료
					System.out.println("게임을 종료합니다");
					break;
				}
			} else if (input < rdNum) {
				System.out.println("틀렸습니다. " + input + "보다 큰수입니다.");
				System.out.println();
				score = score - 10;
			} else if (input > rdNum) {
				System.out.println("틀렸습니다. " + input + "보다 작은수입니다.");
				System.out.println();
				score = score - 10;
			}

			if (score <= 0) {
				System.out.println("게임이 종료되었습니다. 랜덤값은 " + rdNum + "입니다.");
				System.out.println("점수는 " + score + "점입니다.");
				System.out.println();
				break;
			}
		}
		*/
		
		
	
	  int[] ab = new int[4]; 
	  int ac[] = new int[5]; 
	  int[] vv = { 1, 4, 5, 6, 7, 8}; 
	  int ww[] = { 1, 4, 5, 6, 7, 8 };
	 
	  int n1 = 10; int n2 = 20; int n3 = 30;
	  
	  int sum = n1+n2+n3;
	  
	  if(sum >= 60) { 
		  System.out.println("sum은 60이상입니다."); 
	  } else {
		  System.out.println("sum은 60이하입니다."); 
	  }
	  
	  if(sum%2 == 0) { 
		  System.out.println("sum은 짝수입니다."); 
	  } else {
		  System.out.println("sum은 홀수입니다."); 
	  }
	  
	  // 배열 선언 
	  int[] nums = new int[5];
	  nums[0] = 1; 
	  nums[1] = n1; 
	  nums[2] = n2; 
	  nums[3] = n3; 
	  nums[4] = 1;
	  
	  for(int i=0; i<5; i++) { System.out.println("nums[" + i + "] : " + nums[i]);
	  }
	  
	  for(int i=4; i>=0; i--) { System.out.println("nums[" + i + "] : " + nums[i]);
	  }
	 
	
		
	}
}
