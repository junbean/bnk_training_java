package test;

import java.util.Random;
import java.util.Scanner;

public class Test_while_2 {

	public static void main(String[] args) {
		// 배열에서 짝수의 값만 합계를 구한다
		/*
		 * int[] A = {1,2,3,4,5,6,7,8,9,10}; int sum = 0;
		 * 
		 * // 요소의 값이 짝수인 경우 for(int i =0; i<10; i++) { if(A[i] % 2 != 0) { continue; }
		 * 
		 * sum = sum + A[i]; } System.out.println("배열 요소값이 짝수의 합계 : " + sum);
		 * 
		 * 
		 * // 인덱스의 값이 짝수인 경우 sum = 0; for(int i =0; i<10; i++) { if(i % 2 != 0) { // 0,
		 * 2, 4, 6, 8 continue; } sum = sum + A[i]; }
		 * System.out.println("배열 인덱스값이 짝수의 합계 : " + sum);
		 */

		// switch case 문제
		// 점수에 따른 학점 구하기 문제
		// 점수 100 ~ 90 : A
		// 점수 89 ~ 80 : B
		// 점수 79 ~ 70 : C
		// 점수 69 ~ 60 : D
		// 점수 59 ~ 50 : F
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();

		int ss = score / 10;

		switch (ss) {
		// A학점
		case 10: System.out.println("A학점 입니다");
		case 9: System.out.println("A학점 입니다"); break;
		// B학점
		case 8: System.out.println("B학점 입니다"); break;
		// C학점
		case 7: System.out.println("C학점 입니다"); break;
		// D학점
		case 6: System.out.println("D학점 입니다"); break;
		// F학점
		case 5: System.out.println("F학점 입니다"); break;
			
		//==
		case 4: System.out.println("재수강입니다"); break;
		case 3: System.out.println("재수강입니다"); break;
		case 2: System.out.println("재수강입니다"); break;
		case 1: System.out.println("재수강입니다"); break;
		case 0: System.out.println("재수강입니다"); break;
		//==
			
		default: System.out.println("올바르지 못한 입력값입니다."); break;
		}
		*/
		
		
		// 로또 문제
		// 6개를 입력
		// 6개 맞으면 당첨
		// 로또 번호에서 중복된 숫자는 배제
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rdNum;

		int[] arr_input = new int[6];	// 사용자 로또 번호 입력
		int[] arr_lotto = new int[6];	// 로또 정답 번호
		int count = 0;					// 성공적으로 랜덤값을 넣은 횟수
		boolean isDuplicate = false;	// 중복인지 야부
		
		int input;	// 숫자 입력 변수
		
		// 로또 입력
		while(count <= 5) {
			System.out.print((count + 1) + "번 로또 번호 입력 : ");
			input = sc.nextInt();
			
			// 입력값은 1 ~ 10 사이의 값만 가능
			if(input < 1 || input > 10 ) {
				System.out.println("올바른 입력값이 아닙니다!");
				continue;
			}
			
			if(count != 0) {
				// 중복된 숫자가 있는지 판별
				for(int i=0; i<count; i++) {
					if(arr_input[i] == input) {
						isDuplicate = true;
						System.out.println("중복된 숫자입니다");
						break;
					}
				}

				if(isDuplicate == true) {
					isDuplicate = false;
					continue;
				}
 			}
			
			arr_input[count] = input;			
			count = count + 1;
		}
		
		
		// 로또 정답
		isDuplicate = false;
		count = 0;	// 랜덤 성
		while(count<=5) {
			rdNum = rd.nextInt(10) + 1;	// 랜덤 생성
			
			if(count != 0) {
				// 중복된 숫자가 있는지 판별
				// count = 2
				// arr_lotto = [1, 2]
				// 등러온 랜덤값 = 1
				for(int i=0; i<count; i++) {
					if(arr_lotto[i] == rdNum) {
						isDuplicate = true;
						break;
					}
				}

				// 만약 중복이 발생할때
				if(isDuplicate == true) {
					isDuplicate = false;
					continue;
				}
 			}
			
			arr_lotto[count] = rdNum;			
			count = count + 1;
		}
		System.out.println();	// 빈칸

		
		// 입력 번호 출력
		System.out.print("입력 번호 출력 : \t");
		for(int i=0; i<arr_input.length; i++) {
			System.out.print(arr_input[i] + "\t");
		}
		System.out.println();	// 빈칸
		
		// 로또 번호 출력
		System.out.print("로또 번호 출력 : \t");
		for(int i=0; i<arr_lotto.length; i++) {
			System.out.print(arr_lotto[i] + "\t");
		}
		System.out.println();	// 빈칸
		System.out.println();	// 빈칸

		
		// 복권 당첨 판별
		System.out.println("정답 확인!");	
		for(int i=0; i<arr_input.length; i++) {
			System.out.print((i+1) + "\t");	
		}
		System.out.println();	
		
		int correct_count = 0;
		for(int i=0; i<arr_input.length; i++) {
			//rdNum = rd.nextInt(10) + 1;
			
			// 랜덤 숫자 -> 로또 당첨 번호
			if(arr_input[i] == arr_lotto[i]) {
				System.out.print("O\t");	
				correct_count = correct_count + 1;
			} else {
				System.out.print("X\t");	
			}
		}
		System.out.println();	// 빈칸		
		
		switch(correct_count) {
		case 6:
			System.out.println("축하드립니다! 당첨입니다!");
			break;
		case 5:
			System.out.println("5개의 숫자를 맞추셨습니다!");
			break;
		case 4:
			System.out.println("4개의 숫자를 맞추셨습니다!");
			break;
		case 3:
			System.out.println("3개의 숫자를 맞추셨습니다");
			break;
		case 2:
			System.out.println("2개의 숫자를 맞추셨습니다...");
			break;
		case 1:
			System.out.println("1개의 숫자를 맞추셨습니다...");
			break;
		case 0:
			System.out.println("맞춘 번호가 없습니다...");
			break;
		default:
			System.out.println("에러입니다.");
			break;
		}
	}
}

/*
System.out.println("중복발생!");
System.out.println("rdNum : " + rdNum);
System.out.println("arr_input[" + i + "] : " + arr_input[i]);
System.out.println("count : " + count);
System.out.println();
*/
