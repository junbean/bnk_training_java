package test;

import java.util.Arrays;
import java.util.Scanner;

public class Ct_array {

	public static void main(String[] args) {
		/*
		// 완성
		
		// 1. 알파벳 개수
		String s = "baekjoon";
		int[] arr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			
			switch(s.charAt(i)) {
			
			case 'a' -> arr[0] = arr[0] + 1 ;
			case 'b' -> arr[1] = arr[1] + 1 ;
			case 'c' -> arr[2] = arr[2] + 1 ;
			case 'd' -> arr[3] = arr[3] + 1 ; 
			case 'e' -> arr[4] = arr[4] + 1 ;
			case 'f' -> arr[5] = arr[5] + 1 ;
			case 'g' -> arr[6] = arr[6] + 1 ;
			case 'h' -> arr[7] = arr[7] + 1 ;
			case 'i' -> arr[8] = arr[8] + 1 ;
			case 'j' -> arr[9] = arr[9] + 1 ;
			case 'k' -> arr[10] = arr[10] + 1 ;
			case 'l' -> arr[11] = arr[11] + 1 ;
			case 'm' -> arr[12] = arr[12] + 1 ;
			case 'n' -> arr[13] = arr[13] + 1 ;
			case 'o' -> arr[14] = arr[14] + 1 ;
			case 'p' -> arr[15] = arr[15] + 1 ;
			case 'q' -> arr[16] = arr[16] + 1 ;
			case 'r' -> arr[17] = arr[17] + 1 ;
			case 's' -> arr[18] = arr[18] + 1 ;
			case 't' -> arr[19] = arr[19] + 1 ;
			case 'u' -> arr[20] = arr[20] + 1 ;
			case 'v' -> arr[21] = arr[21] + 1 ;
			case 'w' -> arr[22] = arr[22] + 1 ;
			case 'x' -> arr[23] = arr[23] + 1 ;
			case 'y' -> arr[24] = arr[24] + 1 ;
			case 'z' -> arr[25] = arr[25] + 1 ;
			}
			
			//System.out.println(s.charAt(i));
		}
		
		// 결과 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		//-------------------------------------------------------------------------------------------------
		// 완성
		
		// 2. 숫자의 개수 
		// A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다
		/*
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int mul;
		int count = 1;
		int n = 10;
		int[] arr_mul;	// mull값을 배열로 변환
		int[] arr_num = new int[10];					// mull의 각 자릿수의 숫자 횟수를 구한다
		
		// 첫번째 입력
		System.out.print("첫번째 값 입력 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 값 입력 : ");
		b = sc.nextInt();
		
		System.out.print("세번째 값 입력 : ");
		c = sc.nextInt();
		
		mul = a * b * c;
		
		while(true) {
			if((mul / n) < 1) {
				// 탈출
				break;
			} else {
				count = count + 1;
				n = n * 10;
			}
		}
		
		arr_mul = new int[count];	// 배열의 길이를 지정
		System.out.println();
		
		for(int i=0; i<count; i++) {
			arr_mul[i] = (mul % n) / (n/10);
			n = n/10;
		}
		
		// 배열 출력
		for(int i=0; i<arr_mul.length; i++) {
			System.out.print(arr_mul[i] + " ");
		}
		System.out.println();	
		
		// arr_num 지정
		for(int i=0; i<arr_mul.length; i++) {
			arr_num[(arr_mul[i])] = arr_num[(arr_mul[i])] + 1;
		}
		
		for(int i=0; i<arr_num.length; i++) {
			System.out.println(arr_num[i]);
		}
		*/

		//===================================================================
		// 미완성
		
		// 3. 방 번호
		// 방번호를 문에 붗인다
		// 방번호는 1 ~ 1,000,000
		// 첫째 줄에는 필요한 세트의 개수를 출력
		// 번호판은 0 ~ 9까지
		// 주의!! 6은 9를 돌려서 쓸수 있음
		// 예제1. 9999 -> 2
		// 예제2. 122 -> 2
		
		// 단순히 말하자면 1세트는 0~9 숫자 번호가 각각 들어있음
		// 그러니까 중복되는 값이 없다면 한세트로 1번에 해결이 가능하다(12345 -> 1,   중복값이 없음)
		// 중복이 있다면 한세트에서 한개의 값이 없어져서 다른 세트가 더 필요하다(122 -> 2,    2가 중복됨)
		// 근데 6이랑 9는 서로 돌려서 쓸수 있음(9999 -> 2,    원래라면 4인데 6을 돌려서 쓸수있으니까 2개를 아낄수 있음)
		
		// 중요 
		// 입력값의 각각의 자릿수의 값을 확인 - 입력값을 배열로 변환
		// 각각의 값의 중복을 확인
		// 6, 9의 특수성 고려
		/*
		int input = 129129;
		int[] arr_input;
		int digits = 10;	// 자릿수
		int length = 1;	// 자릿수 길이
		int output = 1;	// 출력 값
		
		// 배열 길이 얻기
		while(true) {
			if((input / digits) < 1) {
				// 탈출
				break;
			} else {
				length = length + 1;
				digits = digits * 10;
			}
		}
		
		arr_input = new int[length];	// 배열의 길이를 지정
		
		// 자릿수의 숫자 출력
		for(int i=0; i<length; i++) {
			arr_input[i] = (input % digits) / (digits/10);
			digits = digits/10;
		}
		
		// 배열 출력
		for(int i=0; i<arr_input.length; i++) {
			System.out.print(arr_input[i] + " ");
		}
		System.out.println();
		
		// 판별 
		// 각 배열의 숫자의 횟수를 세서 배열에 저장
		int[] arr_num = new int[10];	// 0 ~ 9 까지의 나온 숫자의 횟수를 저장하는 배열
	
		for(int i=0; i<arr_input.length; i++) {
			if(arr_input[i] == 0) {
				arr_num[0] = arr_num[0] + 1;
			} else if(arr_input[i] == 1) {
				arr_num[1] = arr_num[1] + 1;
			} else if(arr_input[i] == 2) {
				arr_num[2] = arr_num[2] + 1;
			} else if(arr_input[i] == 3) {
				arr_num[3] = arr_num[3] + 1;
			} else if(arr_input[i] == 4) {
				arr_num[4] = arr_num[4] + 1;
			} else if(arr_input[i] == 5) {
				arr_num[5] = arr_num[5] + 1;
			} else if(arr_input[i] == 6) {
				arr_num[6] = arr_num[6] + 1;
			} else if(arr_input[i] == 7) {
				arr_num[7] = arr_num[7] + 1;
			} else if(arr_input[i] == 8) {
				arr_num[8] = arr_num[8] + 1;
			} else if(arr_input[i] == 9) {
				arr_num[9] = arr_num[9] + 1;
			}
		} 
		
		// 문제. 여기서 6,9는 서로를 대체 가능하게 해야함
		// 어떻게 이걸 구현하냐?
		// 1. 만약 입력 숫자가 66699일 경우 -> 6의 갯수 3, 9의 갯수 2
		// 이것의 출력은 3
		// 2. 만약 입력 숫자가 66666일 경우 -> 6의 갯수 5
		// 이것의 출력은 3
		
		// 해결책 1. 만약 최대 숫자 구하기에서 6과 9를 더하고 2를 나눌까?
		// 66699 -> 6은 3개, 9는 2개 -> (3+2)/2 = 2.5
		// 이러고 결과를 반올림하면 얼추 계산은 맞는다
		
		// 횟수 구한걸 바탕으로 ouput 출력
		int n = 0;
		for(int i=0; i<arr_num.length; i++) {			
			System.out.println(i + "의 횟수 : " + arr_num[i]);
			if(arr_num[i] > output) {
				output = arr_num[i];
				n = i;
			}
		}
		
		// 129129 일때 -> 2
		// 99999 일때 -> 결과는 5이지만 조건 성립으로 -> 3
		System.out.println("필요한 최소한의 세트 : " + output);
		*/
		
		//===================================================================
		
		// 4. 두 수의 합
		// 완료
		
		// 수열의 길이, 수열의 값, 특정값x가 주어진다 
		// 문제는 수열에서 2개의 수를 선택했을때 그 수의 더한 값이 x가 되는 경우의 수를 구하는 것
		/*
		int length = 9;
		int[] arr = {5, 12, 7, 10, 9, 1, 2, 3, 11};
		int x = 13;
		
		int x_cases = 0; // 경우의 수
		int arr_num = 0;
		int[] arr_a = new int[arr.length];
		int[] arr_b = new int[arr.length];
		boolean flag = false;
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++) {
				if(i == j) {
					continue;
				}


				if(arr[i] + arr[j] != x) {
					continue;
				}
				
				// 이전과 같은 숫자를 고르지 않도록 하는것
				// 방법.1 현재 i,j 숫자가 이전 숫자를 저장한 배열과 일치하는지 확인
				if(arr_num > 0) {
					for(int z=0; z<arr_num; z++) {
						if(i == arr_b[z] && j == arr_a[z]) {
							flag = true;
							continue;
						}
					}
				} 
				
				if(flag == true) {
					flag = false;
					continue;
				} else {
					System.out.println(arr[i] + ", " + arr[j]);
					x_cases = x_cases + 1;
					arr_a[arr_num] = i;
					arr_b[arr_num] = j;
					arr_num = arr_num + 1;
				}

				
			}
		}
		
		System.out.println(x_cases);
		*/
		
		//=============================================================
		
		// 5. 개수 세기
		// 완료
		
		/*
		int length = 11;
		String s = "1 4 1 2 4 2 4 2 3 4 4";
		int v = 2;
		
		String[] arr_s;
		int[] arr_num = new int[length];
		int count = 0;
		
		arr_s = s.split(" ");
		
		for(int i=0; i<length; i++) {
			if(arr_s[i].equals("0")) {
				arr_num[i] = 0;
			} else if(arr_s[i].equals("1")) {	
				arr_num[i] = 1;
			} else if(arr_s[i].equals("2")) {
				arr_num[i] = 2;
			} else if(arr_s[i].equals("3")) {
				arr_num[i] = 3;
			} else if(arr_s[i].equals("4")) {
				arr_num[i] = 4;
			} else if(arr_s[i].equals("5")) {
				arr_num[i] = 5;
			} else if(arr_s[i].equals("6")) {
				arr_num[i] = 6;
			} else if(arr_s[i].equals("7")) {
				arr_num[i] = 7;
			} else if(arr_s[i].equals("8")) {
				arr_num[i] = 8;
			} else if(arr_s[i].equals("9")) {
				arr_num[i] = 9;
			}
		}
		
		// 배열 확인
		for(int i=0; i<length; i++) {
			System.out.print(arr_num[i] + " ");	
		}
		System.out.println();	
		
		for(int i=0; i<length; i++) {
			if(arr_num[i] == v) {
				count = count + 1;
			}
		}
		System.out.println("v는 " + v);	
		
		System.out.println(count);	
		*/
		
		
		// 6. 방 배정
		// 완료
		
		// 1 ~ 6학년
		// 남남 / 여여 끼리 배치
		// 한방에는 같은 학년끼리, 근데 한방에 한명 배치도 가능
		// 최대 인원수 k가 주어쟜을때, 모든 학생을 배정하기 위한 방의 최소 개수 구하기
		
		// 예제 입력 
		// 16 2	<- 최대 학생수, 방 최대 인원수
		// 0은 여자, 1은 남자	/ 학년
		// 0 3	<- 여자, 3학년
		// 1 5	<- 남자, 5학년
		// 0 6	<- 여자, 6학년
		/*
		Scanner sc = new Scanner(System.in);
		
		int count_student = 16;
		int max = 2;
		int[][] arr_room = new int[2][6];
		int gender;
		int grade;
		int output = 0;
		
		System.out.print("전체 학생수와 방의 최대 인원수 : ");
		count_student = sc.nextInt();
		max = sc.nextInt();
		
		for(int i=0; i<count_student; i++) {	
			// 0:여자	/ 1:남자
			// 0~5:학년
			System.out.print("학생의 성별과 학년 : ");
			gender = sc.nextInt();
			grade = sc.nextInt();
			
			arr_room[gender][grade-1] = arr_room[gender][grade-1] + 1;
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<6; j++) {
				if(i == 0) {
					System.out.println((j+1) + "학년 여자 수 : " +  + arr_room[i][j]);
						
				} else {
					System.out.println((j+1) + "학년 남자 수 : " +  + arr_room[i][j]);
					
				}
				
				if(arr_room[i][j] == 0) {
					continue;
				}
				
				if(arr_room[i][j] > max) {
					output = output + (int)Math.round((double)arr_room[i][j]/max);
				} else {
					output = output + 1;
				}
			}
			System.out.println("output : " + output);
			System.out.println("//===============================");
		}
		System.out.println(output);
		*/
		
		// 7. Strfry
		// strfry는 문자열을 무작위로 재배열하여 새로운 문자열을 만들어냄
		// 문제는 입력한 한쌍의 문자열이 strfry로 얻어질수 있는것인지 물어보는것
		// 핵심은 서로 문자열마다 같은 문자를 가지는지 물어보는 문제
		Scanner sc = new Scanner(System.in);
		int count = 4;
		
		String input_a;
		String input_b;
		String[] arr_a = new String[count];
		String[] arr_b = new String[count];
		
		for(int i=0; i<count; i++) {
			System.out.print("문자열 입력 : ");
			input_a = sc.next();
			input_b = sc.next();
			arr_a[i] = input_a;
			arr_b[i] = input_b;
		}
		
		// 판별
		for(int i=0; i<count; i++) {
			if(arr_a[i].length() != arr_b[i].length()) {
				System.out.println("Impossible");
				continue;
			}
			
			if(arr_a[i].length() == 1) {
				if(arr_a[i].equals(arr_b[i])) {
					System.out.println("Possible");	
					continue;
				} else {
					System.out.println("Impossible");
					continue;		
				} 
			}

			String[] sarr_a = arr_a[i].split("");	// r i n g
			String[] sarr_b = arr_b[i].split("");	// g n i r
					
			int c = arr_a[i].length();
			int num_c = c;

			System.out.println(Arrays.toString(sarr_a));
			System.out.println(Arrays.toString(sarr_b));
			// r i n g	// g n i r
			for(int j=0; j<c; j++) {
				System.out.println(j + " ================== ");
				for(int z=0; z<c; z++) {
					System.out.println(z + " ................ ");
					System.out.println(sarr_a[j] + ", " + sarr_b[z]);		
					
					if(sarr_a[j].equals(sarr_b[z])) {
						sarr_a[j] = "";
						sarr_b[z] = "";
						num_c = num_c - 1;
					} else {
						
					}
				}
			}

			System.out.println(num_c + " ***** ");
			if(num_c == 0) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");	
			}
		}
		
		
		// 8. 애너그램 만들기
		
		
	}

}
