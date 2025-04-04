package ex10;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// s1에 Hello 만들어두면 s2에 Hello를 지정하면 s2는 새롭게 생겨난게 아니라 메모리상에 있는 s1의 Hello를 가져다가 쓴거라서 같은것이라고 나온다
		// String 자료형은 불변 타입이다. 
		// 문자열을 저장하는 타입, 
		// 문자열은 한번 고정 불변이다, 
		// 만약 s1 = Hello2 이렇게 하면 이건 새롭게 생기는 거라고 봐야함
		String s1 = "abcdefg";		// s1에 Hello 지정 새롭게 생김
		String s2 = "Hello";		// s1에 있는 Hello 가져와서 지정함
		System.out.println(s1 == s2);
		
		String s3 = new String("Hello");		// 메모
		System.out.println(s1 == s3);			// 이것은 사실은 주소값이 같냐고 물어본거라고 봐야한다

		System.out.println();	// 빈칸
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();	// 빈칸
	
		System.out.println(s1.equals(s3));		// 이것은 s3의 주소의 값이 s1과 같은지 물어본거임
		System.out.println();	// 빈칸

		char c = s1.charAt(0);	// 문자열을 배열처럼 인식해서 인덱스로 처리
		System.out.println(c);
		System.out.println();	// 빈칸
		
		// 문자열을 char 형태로 출력 
		char[] arr_c = new char[s1.length()];
		for(int i=0; i<s1.length(); i++) {
			arr_c[i] = s1.charAt(i);
		}
		for(int i=0; i<arr_c.length; i++) {
			System.out.print(arr_c[i] + " ");
		}
		System.out.println();	// 빈칸
		System.out.println(s1.length());
		System.out.println();	// 빈칸
		
		//------------------------------------------------------------------------------
		// subString
		String result_subString1 = s1.substring(0);	// 시작 인덱스부터 끝까지 String으로 반환한다
		System.out.println(result_subString1);
		
		String result_subString2 = s1.substring(3,5);	// 시작 인덱스부터 끝 인덱스까지를 String으로 반환한다, endIndex의 경우에는 해당 인덱스 바로 앞에까지만 자른다
		System.out.println(result_subString2);
		System.out.println();	// 빈칸	
		
		//-------------------------------------------------------------------------------
		// contains
		boolean result_contains1 = s1.contains("def");	// 특정 문자열이 s1에 포함되는지를 판별
		System.out.println(result_contains1);
		
		boolean result_contains2 = s1.contains("acd");
		System.out.println(result_contains2);
		System.out.println();	// 빈칸	

		// indexOf
		int result_indexOf1 = s1.indexOf("bc");	// 문자열이 시작되는 인덱스를 출력함		
		System.out.println(result_indexOf1);
		
		int result_indexOf2 = s1.indexOf("de");	// 문자열이 시작되는 인덱스를 출력함, 만약 없다면 -1을 반환한다		
		System.out.println(result_indexOf2);
		System.out.println();	// 빈칸	
		
		
		// equals, equalsIgnoreCase
		String str1 = "Java";
		String str2 = "java";
		System.out.println(str1.equals(str2)); 			// equals : 대문자와 소문자를 구분함, 그리고 띄어쓰기와 들여쓰기도 구분한다
		System.out.println(str1.equalsIgnoreCase(str2)); 	// equalsIgnoreCase : 대문자와 소문자 구분을 무시한다
		System.out.println();	// 빈칸	
		
		// toUpperCase, toLowerCase
		System.out.println(str1.toUpperCase()); 	// str1 문자열을 대문자로 변환, 하지만 함수를 쓰더라도 str1이 영구적으로 변환되지 않음
		System.out.println(str1.toLowerCase()); 	// str1 문자열을 대문자로 변환
		System.out.println();	// 빈칸	
		
		// trim
		str1 = "	Java	";
		System.out.println(str1);	
		String newStr = str1.trim();	// 문자열의 공백을 제거
		System.out.println(newStr);
		System.out.println();	// 빈칸	
		
		// replace
		String x = str2.replace("a", "o");	// str2문자열에 있는 "a"를 "o"로 변환한 문자열을 반환
		System.out.println(x);
		x = str2.replace("ja", "go");
		System.out.println(x);
		System.out.println();	// 빈칸	
		
		// split
		String k = "aaa.bbb.ccc.ddd";	
		String[] arr_k = k.split("\\.");	// 특정 문자를 기준으로 분리해서 String 배열로 반환한다, 만약 .을 기준으로 분리할때 .은 정규표현식과 연관되어서 그냥 사용하면 안되고 \\.를 사용해야한다
		for(int i=0; i<arr_k.length; i++) {
			System.out.println(arr_k[i]);
		}
		System.out.println();	// 빈칸	
		
		
	}

}

// String, charSequence 차이
// https://chatgpt.com/c/67e651c6-0414-800a-8612-565a86d97ca4