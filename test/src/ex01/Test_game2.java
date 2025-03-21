package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test_game2 {

	public static void main(String[] args) {
		//game1();
		game2();
	}

	static int input_int(int[] arr_input) {
		Scanner sc = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print("문자의 정수형을 입력하십시오(대문자[65~90] 소문자[97~122]) : ");
			input = sc.nextInt();

			if(!check_duplicate_element(arr_input, input)) {
				if (input >= 65 && input <= 90) {
					System.out.println("ㅇㅋ 입력됨");
					break;
				} else if (input >= 97 && input <= 122) {
					System.out.println("ㅇㅋ 입력됨");
					break;
				} else if (input == 32) {
					System.out.println("ㅇㅋ 입력됨");
					break;
				} else {
					System.out.println("이건 안됨 다시 입혁하셈");
					continue;
				}
			} else {
				System.out.println("이건 중복임 안됨");
				continue;
			}
			
		}
		return input;
	}

	// 배열을 보고 판별함
	// 반환값으로는 맞힌갯수를 반환함
	static int check_arr(char[] arr_str, int[] arr_input) {
		int count = 0;
		boolean isSearch = false;
		
		for (int i = 0; i < arr_str.length; i++) {
			int num = arr_str[i];
			for(int j=0; j<arr_input[j]; j++) {
				if (num == arr_input[j]) {
					isSearch = true;
					break;
				} 
			}
			if(isSearch) {
				System.out.print(arr_str[i]);
				count = count + 1;
				isSearch = false;
			} else {
				System.out.print("*");
			}
		}
		
		return count;
	}
	
	static boolean check_duplicate_element(int[] arr_input, int input) {
		boolean isDuplicate = false;
		for(int i=0; i<arr_input.length; i++) {
			if(input == arr_input[i]) {
				isDuplicate = true;
				break;
			}
		}
		return isDuplicate;
	}
	
	static void show_arr(char[] arr) {
	}
	
	
	//==================================================================================
	static void game1() {
		char[] arr_str = { 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y' };
		char[] arr_temp = new char[arr_str.length];
		int[] arr_input = new int[15];

		int input;
		int count = 0;

		// *배열 초기화
		for(int i=0; i<arr_temp.length; i++) {
			arr_temp[i] = '*';
		}
		
		// 메인 로직
		while(true) {
			// 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("문자의 정수형 입력하셈 : ");
			input = sc.nextInt();
			
			// 판별
			for(int i=0; i<arr_str.length; i++) {
				if((arr_str[i] == input) && (arr_temp[i] != input)) {
					arr_temp[i] = arr_str[i];
					count++;
				} 
				System.out.print(arr_temp[i]);
			}
			System.out.println();	// 빈칸
				
			// 다 맞춤
			if(count == arr_str.length) {
				System.out.println("====================");
				System.out.println("다 맞춤 ㅊㅊ");
				break;
			}
		}
		
		System.out.println("끝~");
	}
	
	static void game2() {
		String str = "java_is_easy";
		char[] arr_temp = new char[str.length()];
		
		int count = 0;

		// *배열 초기화
		for(int i=0; i<str.length(); i++) {
			arr_temp[i] = '*';
		}
		
		// 메인 로직
		while(true) {
			// 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("문자의 정수형 입력하셈 : ");
			String s = sc.next();
			char input = s.charAt(0);
			
			// 판별
			for(int i=0; i<arr_temp.length; i++) {
				if((str.charAt(i) == input) && (arr_temp[i] != input)) {
					arr_temp[i] = input;
					count++;
				} 
				System.out.print(arr_temp[i]);
			}
			System.out.println();	// 빈칸
				
			// 다 맞춤
			if(count == str.length()) {
				System.out.println("====================");
				System.out.println("다 맞춤 ㅊㅊ");
				break;
			}
			System.out.println("count : " + count);	// 빈칸
		}
		
		System.out.println("끝~");
	}
}


/*


char[] arr_str = { 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y' };
char[] arr_temp = new char[arr_str.length];
int[] arr_input = new int[15];

int input;
int count = 0;
int count_correct = 0;

while(true) {
	// 입력
	input = input_int(arr_input);
	
	// 입력값 배열에 넣기
	arr_input[count] = input;
	
	// 판별
	count_correct = check_arr(arr_str, arr_input);
	System.out.println();	// 빈칸
	
	// 다 맞췄는지 판별
	if(count_correct == arr_str.length) {
		break;
	}
	
	// 카운터 증가
	count++;	






static void check_arr(char[] arr_str, int input) {
		for (int i = 0; i < arr_str.length; i++) {
			int num = arr_str[i];
			if (num == input) {
				System.out.print(arr_str[i] + " ");
			} else {
				System.out.print("* ");
			}
		}
	}


for (int i = 0; i < arr_str.length; i++) {
			int num = arr_str[i];
			if (num == input) {
				System.out.print(arr_str[i] + " ");
			} else {
				System.out.print("* ");
			}

			 * for(int j=0; j<arr_input.length; j++) { int num = arr_str[i]; if(num ==
			 * arr_input[j]) { System.out.print(arr_str[i] + " "); } else {
			 * System.out.print("* "); } }
		
		
		
문자의 정수형 입력하셈 : 32
**** ** ****
문자의 정수형 입력하셈 : 97
*a*a ** *a**
문자의 정수형 입력하셈 : 105
*a*a i* *a**
문자의 정수형 입력하셈 : 118
*ava i* *a**
문자의 정수형 입력하셈 : 106
java i* *a**
문자의 정수형 입력하셈 : 101
java i* ea**
문자의 정수형 입력하셈 : 115
java is eas*
문자의 정수형 입력하셈 : 121
*/