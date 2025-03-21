package test;

public class Test_func4 {

	public static void main(String[] args) {
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		

		// 초기 배열 출력
		System.out.println("대문자 배열");	
		show_arr(arr);

		// 대문자 소문자로 변환		
		arr = transition_low(arr);
		System.out.println();	
		
		// 소문자로 변환 후 배열 출력
		System.out.println("소문자로 변형 후");	
		show_arr(arr);
		System.out.println();
		
		// 다시 대문자로 변환 후 배열 출력
		System.out.println("다시 대문자로 변형 후 출력");
		transition_up(arr);
		show_arr(arr);
				
				
		
	}
	
	// 대문자를 소문자로 변환하는 함수
	static char[] transition_low(char[] arr) {
		int num;
		for(int i=0; i<arr.length; i++) {
			num = arr[i];
			if(num >= 65 && num <= 90)
				num = arr[i] + 32;
			arr[i] = (char)num;	
		}
		return arr;
	}
	
	// 소문자를 대문자로 변환
	static char[] transition_up(char[] arr) {
		int num;
		for(int i=0; i<arr.length; i++) {
			num = arr[i];
			if(num >= 90 && num <= 122)
				num = arr[i] - 32;
			arr[i] = (char)num;	
		}
		return arr;
	}
	
	static void show_arr(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");		
		}
	}
}
