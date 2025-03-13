package test;

public class Ct_array {

	public static void main(String[] args) {
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
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		
		// 2. 숫자의 개수
		
		// 3. 방 번호
		
		// 4. 두 수의 합
		
		// 5. 개수 세기
		
		// 6. 방 배정
		
		// 7. Strfry
		
		// 8. 애너그램 만들기
		
		
	}

}
