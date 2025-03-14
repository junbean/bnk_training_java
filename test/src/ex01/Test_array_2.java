package test;

import java.util.Random;
import java.util.Scanner;

public class Test_array_2 {

	public static void main(String[] args) {
		/*
		int[][] arr = new int[3][5];
		int a = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = a;
				a++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("arr[" + i + "]의 값 : " + arr[0]);
		}
		*/
		
		//========================================================================================================
		
		// 5행 5열
		// 배열 = board
		// 프로그램 시작시 자동으로 배열에 5군데에 1이라는 값을 넣도록 한다 - 컴퓨터가 넣음
		// 그리고 배열에 1을 찾도록 한다
		// 사용자는 행, 열 값을 따로 입력한다
		// 입력한 행,열 번호에 1이 있는지 확인한다
		
		// 만일 사용자가 답을 원한다면 1이 어디에 있는지 답을 알려준다
		// 최종적으로 게임이 끝나면 어디 배열에 1이 있는지 알려준다
		/*
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[][] board = new int[5][5];
		int rdNum1;
		int rdNum2;
		int[] arr_rdNum1 = new int[5];
		int[] arr_rdNum2 = new int[5];
		int answer_count = 0;
		int input_row;
		int input_col;
		
		int[] user_answer_row = new int[5];
		int[] user_answer_col = new int[5];
		
		int x=0;
		int y=0;
		int count = 0;
		
		// 배열 랜덤 위치 1 입력
		while(true) {
			// 만약 모든 걸 찾으며 반복 탈출
			if(count==5) {
				break;
			}
			
			rdNum1 = rd.nextInt(5);
			rdNum2 = rd.nextInt(5);
			
			if(board[rdNum1][rdNum2] == 1) {		// 중복 확인
				continue;
			} else {								
				board[rdNum1][rdNum2] = 1;		// 랜덤 위치에 1 저장
				arr_rdNum1[count] = rdNum1;		// 행 위치를 arr_rdNum1 배열에 저장
				arr_rdNum2[count] = rdNum2;		// 열 위치를 arr_rdNum2 배열에 저장
				count = count + 1;

			}
		}
		
		// 배열 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("board["+i+"]["+j+"] : " + board[i][j]);
			}
		}
		
		System.out.println("==============================================");
		System.out.println();

		
		// 게임 시작
		System.out.println("5X5배열에서 1찾기 게임 시작!!");
		while(true) {
			if(answer_count == 5) {
				System.out.println("축하합니다!! 모든 1의 위치를 찾았습니다");
				System.out.println("모든 1의 위치는 다음과 같습니다");
				for(int i=0; i<5; i++) {
					System.out.println("board[" + arr_rdNum1[i] + "][" + arr_rdNum2[i] + "] = 1");	
				}
				break;
			}

			// 사용자가 맞춘 횟수, 위치 출력
			System.out.println("========  사용자가 맞춘 횟수 : " + answer_count + "  ========"); 	
			if(answer_count != 0 ) {
				System.out.println("========  사용자가 맞춘 위치  ========"); 	
				for(int i=0; i<answer_count; i++) {
					System.out.println("board[" + user_answer_row[i] + "][" + user_answer_col[i] + "] = 1");	
				}	
			} 
			System.out.println(); 	// 빈칸
			
			// 행번호 입력, 올바른 값인지 판별
			while(true) {
				System.out.print("행번호를 입력하십시오(0~4) : ");
				input_row = sc.nextInt();
				if((input_row < 0) || (input_row > 4)) {
					System.out.println("올바르지 못한 행번호 입니다...");
				} else {
					break;
				}
			}
			
			// 열번호 입력, 올바른 값인지 판별
			while(true) {
				System.out.print("열번호를 입력하십시오(0~4) : ");
				input_col = sc.nextInt();
				if((input_col < 0) || (input_col > 4)) {
					System.out.println("올바르지 못한 열번호 입니다...");
				} else {
					break;
				}
			}
			System.out.println(); 	// 빈칸
			
			// 입력한 행, 열 위치에 값 판별
			if(board[input_row][input_col] == 1) {
				System.out.println("정답입니다!!");
				System.out.println(); 	// 빈칸
				user_answer_row[answer_count] = input_row;	// 답으로 인정된 행 위치 저장
				user_answer_col[answer_count] = input_col;	// 답으로 인정된 열 위치 저장
				board[input_row][input_col] = 2;	// 이미 맞췄다면 2로 바꾼다	
				answer_count = answer_count + 1;	// answer_count의 값을 올림
			} else if(board[input_row][input_col] == 0) {
				System.out.println("틀렸습니다..."); 	
				System.out.println(); 	// 빈칸
			} else {
				System.out.println("이미 맞춘 위치입니다."); 	
				System.out.println(); 	// 빈칸
			}
		}
		
		*/
		
		//==========================================================================
		
		/*	대충 이렇게 출력하기 
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		*/
		
		/*
		int[][] arr = new int[5][5];
		boolean direction = true;
		int a = 1;
		
		// 배열에 값 넣기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(direction == true) {
					// 정방향으로 넣기
					arr[i][j] = a;
				} else {
					// 반대로 넣기
					arr[i][4-j] = a;
				}
				a++;
			}
			
			direction = !direction;		// 방향 전환
		}
		
		// 배열 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();	// 빈칸
		}
		
		*/
		
		//==========================================================
		
		// 학생 성정 관리
		// 국	영	수	총점
		// 90	70	90	''
		// 90	90	100	''
		// 90	90	100	''
		// 270	250	290	''
		
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[4][4];
		int input;
		int sum_row = 0;
		int sum_col = 0;
		
		// 점수 입력 && 국영수 총합
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(j == 0) {
					System.out.print((i+1) + "번의 국어 점수 입력 : ");
					input = sc.nextInt();	
					score[i][j] = input;
					sum_row = sum_row + input;	// 국,영,수 합계 구하기
				} else if(j == 1) {
					System.out.print((i+1) + "번의 영어 점수 입력 : ");
					input = sc.nextInt();	
					score[i][j] = input;
					sum_row = sum_row + input;	// 국,영,수 합계 구하기
				} else if(j == 2) {
					System.out.print((i+1) + "번의 수학 점수 입력 : ");
					input = sc.nextInt();		
					score[i][j] = input;	
					sum_row = sum_row + input;	// 국,영,수 합계 구하기
				} else {
					score[i][j] = sum_row;
					sum_row = 0;
				}
			}
			System.out.println("==============================");
		}
		
		// 같은 과목 총합
		for(int j=0; j<3; j++) {
			for(int i=0; i<4; i++) {
				if(i == 3) {
					score[i][j] = sum_col;
					sum_col = 0;
				} else {
					sum_col = sum_col + score[i][j];	
				}
			}
		}
		
		
		System.out.println();
		
		// score 배열 출력
		System.out.println("총 점수 출력");
		System.out.println("번호\t국어\t영어\t수학\t총합");
		for(int i=0; i<4; i++) {
			if(i != 3) {
				System.out.print((i+1) + "번\t");
			} else {
				System.out.print("합계\t");
			}
			for(int j=0; j<4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
