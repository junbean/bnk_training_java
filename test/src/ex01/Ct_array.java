package test;

import java.util.Scanner;

public class Ct_array {

	public static void main(String[] args) {
		/*
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
		int input = 888888;
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
		
		for(int i=0; i<arr_num.length; i++) {
			
		}
		
		for(int i=0; i<arr_num.length; i++) {			
			System.out.println(i + "의 횟수 : " + arr_num[i]);
			if(arr_num[i] > output) {
				output = arr_num[i];
			}
		}
		
		System.out.println("필요한 최소한의 세트 : " + output);
		
		
		//===================================================================
		
		// 4. 두 수의 합
		
		// 5. 개수 세기
		
		// 6. 방 배정
		
		// 7. Strfry
		
		// 8. 애너그램 만들기
		
		
	}

}
