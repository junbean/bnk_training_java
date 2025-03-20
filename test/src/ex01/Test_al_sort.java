package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test_al_sort {

	public static void main(String[] args) {

		// 선택 정렬
		/*
		int[] arr = {5,6,2,1,4,3};
		int[] arr_sort = sortSelect(arr);
		System.out.println("선택 정렬 결과");
		show(arr_sort);
		*/
		
		// ==============================================================================
		
		
		// 문자 찾기
		//int[] arr = { 1,2,3,4,5,6,76,234,555,1111,2342 };
		//===================
		// n = 4
		// length = 8
		// mid = 4
		// arr[mid] = 5
		// n < arr[mid]
		// mid = mid/2
		// mid = 2
		// arr[mid] = 3
		// n > arr[mid] 
		// mid = mid + mid/2
		// mid = 3
		//=====================================================
		

		/*
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 6; // 배열에서 찾고자 하는 값
		// int mid = arr.length / 2;
		int mid = arr.length / 2;
		int count = mid;
		
		while (true) {
			if (n > arr[mid]) {
				mid = mid + mid/2;
			} else if (n < arr[mid]) {
				mid = mid / 2;
			} else if (n == arr[mid]) {
				System.out.println("arr 배열에서 " + n + "의 위치는 " + mid + "입니다.");
				break;
			}

			if(mid == arr.length || count == 0) {
				System.out.println("arr 배열에서 " + n + "은 존재하지 않습니다.");
				break;
			}		

			count--;	
		}
		*/
		
		// ======================================================================

		/*
		// 10진수 -> 2진수 변환
		
		// 문제 : 10진수를 2진수로 변환하는 방법
		// 255 -> 1111,1111
		// 과정
		// 255 % 2 = 몫: 127 나머지: 1
		// 127 % 2 = 목 : 63 나머지: 1
		// 63 % 2 = 몫 : 31 나머지: 1
		// 31 % 2 = 몫 : 15 나머지: 1
		// 15 % 2 = 몫 : 7 나머지: 1
		// 7 % 2 = 몫 : 3 나머지: 1
		// 3 % 2 = 몫 : 1 나머지: 1
		// 1 % 2 = 몫 : 1 나머지 1
		// 목표 몫이 0이 될때까지 나머지의 값을 추하함
		// ==================================
		// 과정 2
		// 100 % 2 = 몫: 50 나머지: 0
		// 50 % 2 = 몫: 25 나머지: 0
		// 25 % 2 = 몫: 12 나머지: 1
		// 12 % 2 = 몫: 6 나머지: 0
		// 6 % 2 = 몫: 3 나머지: 0
		// 3 % 2 = 몫: 1 나머지 0
		// 1 % 2 = 몫:0 나머지 1
		// 정답 : 1100100
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10진수 값 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("몇진수 변환? : ");
		int type = sc.nextInt();
		
		int[] arr = null;
		String[] brr = null;
		
		if(type == 16) {
			brr = formation_10to16(a);
		} else {
			arr = formation_10to2_8(a, type);		
		}
		
		switch(type) {
		case 2:
			System.out.println("2진수 변환입니다");
			System.out.println(Arrays.toString(arr));
			break;
		case 8:
			System.out.println("8진수 변환입니다");
			System.out.println(Arrays.toString(arr));
			break;
		case 16:
			System.out.println("16진수 변환입니다");
			System.out.println(Arrays.toString(brr));
			break;
		}
		*/
		
		// ======================================================================

		// 배열이 무한히 입력될수 있는 기능을 구현한다
		// 입력하는 횟수에 따라 배열의 길이를 동적으로 늘리도록 만들어야 한다
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마만큼? : ");
		int input = sc.nextInt();
		int arr[] = new int[5]; 
		
		if(input < 1) {
			System.out.println("이건 안됨");
		} else {
			for(int i=0; i<input; i++) {
				if(i >= arr.length) {
					System.out.println("! - " + i);
					int[] brr = new int[i+1];
					for(int j=0; j<arr.length; j++) {
						brr[j] = arr[j];
					}
					arr = brr;
				}
				arr[i] = i + 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		*/
		
		// ======================================================================

		//
		int result = calc(1,3);
		
		if(result % 2 == 0) {
			System.out.println(result);
			System.out.println("짝수임");	
		} else {
			System.out.println(result);
			System.out.println("홀수임");
		}
		// 4
		// -2
		// 3
		// 0.3
	}
	
	static int[] sortSelect(int[] arr) {
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print((i+1) + "회차 : ");
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			show(arr);
		}
		return arr;
	}
	
	static void show(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static int[] formation_10to2_8(int num, int type) {
		int length = 0;
		int temp = num;
		int[] arr;
		int count = 0;
		
		// 이진수의 길이 구함
		while(true) {
			if(temp <= 0) {
				arr = new int[length];
				break;
			} else {
				temp = temp / type;
				length++;
			}
		}

		//System.out.println(length);
		//System.out.println("==============");	
		
		// 배열에 이진수 값을 넣기
		
		while(num > 0) {	
			arr[(length-1) - count] = num % type;
			num = num / type;
			count++;	
		}
				
		// 배열 출력
		/*
		if(type == 2) {
			System.out.print("2진법 결과 : ");
		} else if(type == 8) {
			System.out.print("8진법 결과 : ");
		}
		System.out.print("결과 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		*/
		return arr;
	}
	
	static String[] formation_10to16(int num) {
		int arr[] = formation_10to2_8(num, 16);
		String[] brr = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 10) {
				switch(arr[i]) {
				case 10 -> brr[i] = "A";
				case 11 -> brr[i] = "B";
				case 12 -> brr[i] = "C";
				case 13 -> brr[i] = "D";
				case 14 -> brr[i] = "E";
				case 15 -> brr[i] = "F";
				}
			} else {
				brr[i] = Integer.toString(arr[i]);
			}
		}
		return brr;
	}

	static int calc(int num1, int num2) {
		double result_sum = sum(num1, num2);
		double result_sub = sub(num1, num2);
		double result_mul = mul(num1, num2);
		double result_div = div(num1, num2);
		
		return (int)(result_sum + result_sub + result_mul + result_div);
	}
	
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
	static int sub(int num1, int num2) {
		return num1 - num2;	
	}
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
	static double div(int num1, int num2) {
		return (double)num1 / num2;
	}


}


/*
알고리즘 정리

선택 정렬
	562143을		고정된 자리와 그 외의 자리를 두고 낮은 자리 숫자인지를 비교하여 정렬함  
	1회전 1 6 5 2 4 3 
	2회전 1 2 6 5 4 3 
	3회전 1 2 3 6 5 4 
	4회전 1 2 3 4 6 5 
	5회전 1 2 3 4 5 6 
	
	
문자 찾기
	배열에서 글자 찾기(배열은 이미 정렬됨)
	길이를 찾고 중간값을 찾음
		만약 3.5같은게 나오면 반올림 해서 4로 만든
	중간값을 찾아서 비교함
		만약 n의 값이 크다면 오른쪽 해서 반복
		n이 작다면 왼쪽에서 반복

변형
	10진수를 넣으면 2진수로 바꾸는 코드 작성




g 함수
	main함수는 f함수한데 값을 넣고 sum값을 가짐
	main은 sum값을 g함수에 넣고 sum/3 연산의 몫과 나머지를 출력하여 main함수가 받음
	매개변수를 넣고 
	
	
calc 함수
	calc에서는 sum, sub, mul, div 함수를 실행시킨다
	div는 실수를 반환한다
	각각의 함수의 반환값의 총합을 가져와서 main에 반환한다
	main은 그걸 호출한다
*/
