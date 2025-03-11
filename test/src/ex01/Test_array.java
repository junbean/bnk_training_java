package ex01;

import java.util.Scanner;

public class Test_array {

	public static void main(String[] args) {
		// ======================================================
		// 배열 선언 방법
		/*
		 * int[] arr = new int[10]; for(int i=0; i<10; i++) { arr[i] = i + 1; }
		 * 
		 * // 이건 딤 int[] aa = {1,2,3,4};
		 * 
		 * // 이것도 됨 int[] bb = new int[5]; bb = new int[]{1,2,3,4,5};
		 * 
		 * // 이건 안됨 int[] cc = new int[5]; cc = {1,2,3,4,5};
		 * 
		 * for(int i=0; i<10; i++) { System.out.println("arr[" + i + "] : " + arr[i]); }
		 */

		// ======================================================
		// 배열 특정 인덱스 값 수정
		// 1. arr 배열 선언
		/*
		 * int[] arr = new int[10];
		 * 
		 * // 2. arr 배열 초기화 for (int i = 0; i < 10; i++) { arr[i] = i + 1; }
		 * 
		 * // 3. arr 배열 5번 인덱스 100으로 수정 arr[4] = 100;
		 * 
		 * // 4. brr 배열 선언 int[] brr = new int[10];
		 * 
		 * // 5. brr 배열 초기화 for (int i = 0; i < 10; i++) { brr[i] = 0; }
		 * 
		 * // 6. arr 배열의 인덱스 반대로 brr 배열 인덱스에 넣기 for (int i = 0; i < 10; i++) { // 단순하게
		 * brr[9-i] = arr[i];
		 * 
		 * // 중첩 반복문으로 for (int j = 9; j >= 0; j--) { // 9 8 7 6 5 4 3 2 1 0 if (i + j
		 * == 9) { brr[j] = arr[i]; break; } } }
		 */

		// 결론. 배열 확인
		/*
		 * System.out.print("arr = "); for (int i = 0; i < 10; i++) {
		 * System.out.print(arr[i] + " "); } System.out.println();
		 * System.out.print("brr = "); for (int i = 0; i < 10; i++) {
		 * System.out.print(brr[i] + " "); } //
		 * System.out.println(Arrays.toString(arr)); //
		 * System.out.println(Arrays.toString(brr));
		 * 
		 */

		// 문제 3번
		// 1번
		/*
		 * int[] arr = new int[10];
		 * 
		 * for (int i = 0; i < 10; i++) { arr[i] = i+1; }
		 * 
		 * // 2,3 번 int[] a = new int[5]; // 1 3 5 7 9 int[] b = new int[5]; // 2 4 6 8
		 * 10
		 * 
		 * // 4,5 번 // a 배열 - 짝수 int i,j; i = 0; j = 0; while(j<5) { if (arr[i] % 2 ==
		 * 0) { // 작수 a[j] = arr[i]; j = j+1; } i++; }
		 * 
		 * 
		 * // b 배열 - 짝수 i = 0; j = 0; while(j<5) { if (arr[i] % 2 == 1) { // 홀수 b[j] =
		 * arr[i]; j = j+1; } i++; }
		 * 
		 * 
		 * // 결론. for (int m = 0; m < 5; m++) { System.out.print(a[m] + " "); }
		 * System.out.println(); for (int m = 0; m < 5; m++) { System.out.print(b[m] +
		 * " "); }
		 */

		// ======================================================================================================

		// 문제 4번
		/*
		 * Random rd = new Random();
		 * 
		 * // 랜덤 배열 생성 int[] arr = new int[10]; for(int i=0; i<10; i++) { arr[i] =
		 * rd.nextInt(10) + 1; }
		 * 
		 * for(int i=0; i<10; i++) { System.out.print(arr[i] + " "); }
		 * System.out.println();
		 * 
		 * 
		 * // 랜덤 배열 홀(odd),짝(even) 갯수 int odd = 0; int even = 0;
		 * 
		 * for(int i=0; i<10; i++) { if(arr[i]%2 == 0) { even = even + 1; } else { odd =
		 * odd + 1; } }
		 * 
		 * System.out.println("홀수 갯수 : " + odd); System.out.println("짝수 갯수 : " + even);
		 * 
		 * 
		 * // 홀수, 짝수 배열 생성 int[] arr_odd = new int[odd]; int[] arr_even = new int[even];
		 * 
		 * // 짝수 배열에 값 넣기 int i; int even_i = 0;
		 * 
		 * i = 0; while(even_i < even ) { if(arr[i]%2 == 0) { arr_even[even_i] = arr[i];
		 * even_i = even_i + 1; } i = i + 1; }
		 * 
		 * // 홀수 배열에 값 넣기 int odd_i = 0;
		 * 
		 * i = 0; while(odd_i < odd) { if(arr[i]%2 == 1) { arr_odd[odd_i] = arr[i];
		 * odd_i = odd_i + 1; } i = i + 1; }
		 * 
		 * 
		 * // 결론. System.out.print("홀수의 배열 : "); for (int m = 0; m < odd; m++) {
		 * System.out.print(arr_odd[m] + " "); } System.out.println();
		 * System.out.print("짝수의 배열 : "); for (int m = 0; m < even; m++) {
		 * System.out.print(arr_even[m] + " "); }
		 */

		// ======================================================================================================

		// 문제 5번
		// 배열의 요소 값 중에서 7과 가까운 수를 찾으시오

		// 랜덤 값 배열 생성
		// int[] arr = {6,4,6,0,1,3,7,11,13,9};

		/*
		 * Random rd = new Random();
		 * 
		 * // 랜덤 배열 생성 int[] arr = new int[10]; for(int i=0; i<10; i++) { arr[i] =
		 * rd.nextInt(20) + 1; }
		 * 
		 * for(int i=0; i<10; i++) { System.out.print(arr[i] + " "); }
		 * System.out.println();
		 * 
		 * 
		 * // 7과 가까운 수 찾기
		 * 
		 * int x = arr[0]-7; // 요소 값 판별 if(x < 0) { x = -(arr[0]-7); } int y = 0; // 요소
		 * 인덱스 저장
		 * 
		 * for(int i=0; i<10; i++) { // 현재 요소값 저장 int z = arr[i] - 7;
		 * 
		 * // 음수라면 양수로 변환 if(z < 0) { z = -z; }
		 * 
		 * // 판별 if(x >= z) { // (요소값 - 7)의 0에 가까우면 정답에 가까움 x = z; y = i;
		 * 
		 * } System.out.println("현재 " + (i+1) + "번째"); System.out.println("현재 기준값 : " +
		 * x); System.out.println("현재 7과 가까운 값 : " + arr[y]);
		 * System.out.println("현재 7과 가까운 값의 위치 : " + y);
		 * System.out.println("------------------------"); }
		 * 
		 * System.out.println("7과 가장 비슷한 요소 값 : " + arr[y]);
		 * System.out.println("7과 가장 비슷한 요소 위치 : arr[" + y + "]");
		 * 
		 */

		
		/*
		int[] arr = new int[3];
		int[] brr = new int[4];

		Scanner sc = new Scanner(System.in);
		int input;
		
		// arr 배열에 값 입력
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + "번째 값 입력 : ");
			input = sc.nextInt();
			arr[i] = input;
		}
		System.out.println();	// 빈칸

		System.out.println("arr의 요소 출력");	
		for(int i=0; i<3; i++) {
			System.out.println("arr["+ i + "] : " + arr[i]);
		}
		System.out.println();	// 빈칸
		
		// 현재 arr에는 3번재 인덱스에 값을 넣을수 없다
		// arr의 값 brr에 이식
		for(int i=0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		
		// brr을 다시 arr에 넣는다
		arr = brr;
		
		// 주소값 출력
		System.out.println("arr, brr 주소 출력");	
		System.out.println("arr : " + arr);
		System.out.println("brr : " + brr);
		System.out.println();	// 빈칸

		System.out.print("arr의 요소 출력");	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
		System.out.println();	// 빈칸
		
		// arr에 마지막 인덱스에 값 삽입
		System.out.print("arr의 3번째 인덱스에 값 삽입 : ");	
		input = sc.nextInt();
		arr[3] = input;
		
		System.out.println();	// 빈칸
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
		*/

		
		/* 배열 길이 늘이기
		int[] arr = new int[3];
		int[] brr;
		
		for(int i=0; i<10; i++) {
			
			// arr 배열의 길이가 짧은 경우 판별			if(arr.length < (i+1)) {
			if(arr.length == i) {
				// brr 배열 길이 지정					brr = new int[i+1];
				brr = new int[arr.length+1];
					
				// arr 요소의 값 brr에 이식
				for(int j=0; j<arr.length; j++) {
					brr[j] = arr[j];
				}
				
				// brr 복사
				arr = brr;
			}
			arr[i] = 10;
		}
		
		System.out.println("arr 배열의 값");	
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 값 : " + arr[i]);	
		}
		*/
		
		
		// 각 자릿수의 값을 더한 값을 구하기
		// 문제 각 자릿수의 숫자를 읽는 방법이 필요
		// 각 자릿수를 가지고 배열을 생성하기	<-- 핵심 목표
		// n을 가지고 10자리씩 올려가며 나누기
		
		int input = 1234;
		int[] input_arr;
		int sum = 0;

		int n = 1;
		int length = 1;
		int dummy= 0;
		
		while(true) {
			if(n == 0) {
				break;
			} else if(input/n < 10) {
				System.out.println("첫번째 반복 - 1");	
				System.out.println();	
				// 정수의 최대 자릿수를 구함
				// 예시 input=219, n=100, length=3
				
				input_arr = new int[length];	// 길이 3
				
				if(length > 1) {
					for(int i=1; i<=9; i++) {	// 1자리부터 9자리까지 판별
						System.out.println("두번재 반복");
						System.out.println("i : " + i);
						System.out.println("input : " + input);
						System.out.println("n : " + n);
						System.out.println("length : " + length);
						System.out.println("sum : " + sum);
						System.out.println();
						
						
						// 1보다 작아지면 break
						if(n < 1) {
							break;
						}			
						
						input_arr[]
						
						if(input - (i*n) < (n/10)) {		// 219 - 100 < 100		 219 - 200 < 100	21 - 10 < 10 
							System.out.println("조건 발동!");
							System.out.println();
							input_arr[dummy] = i;
							input = input / 10;
							n = n / 10;
							sum = sum + i;
							break;
						}
					}
				} else {
					break;
				}
				
			} else {
				n = n*10;
				length = length + 1;	
				System.out.println("첫번째 반복 - 2");	
				System.out.println("n : " + n);		
				System.out.println("length : " + length);
				System.out.println();
			} 
		}
		

		System.out.println();
		System.out.println();
		System.out.println("결과 : " + sum);
		
		
	}
}

/*
 * if (arr == arr_1) { System.out.println("배열 arr과 arr_1은 같다"); } else {
 * System.out.println("배열 arr과 arr_1은 다르다"); }
 * 
 * if (arr == brr) { System.out.println("배열 arr과 brr은 같다"); } else {
 * System.out.println("배열 arr과 brr은 다르다"); } System.out.println(); // 빈칸
 * 
 * System.out.println(arr); System.out.println(brr); System.out.println(); // 빈칸
 * 
 * // ==== System.out.println("brr, arr 복사"); // 빈칸 arr = brr;
 * 
 * System.out.println(arr); System.out.println(brr); System.out.println(); // 빈칸
 * 
 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
 * System.out.println(); // 빈칸
 * 
 * if (arr == brr) { System.out.println("배열 arr과 brr은 같다"); } else {
 * System.out.println("배열 arr과 brr은 다르다"); }
 */
