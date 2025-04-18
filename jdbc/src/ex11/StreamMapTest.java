package ex11;

import java.util.Arrays;
import java.util.List;

public class StreamMapTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "anana", "orange", "mango", "kiwi", "melon", "abocado");
		
		// 요소의 문자를 대문자로 변환
		list.stream()
			.map(s -> s.toUpperCase())	// 대문자로 변환 - 중간연산
			.forEach(n -> System.out.print(n + "\t"));	// 최종연산
	
		System.out.println();	// 빈칸
		
		// 요소의 문자열 길이가 5보다 크면 출력
		list.stream()
			.filter(s -> s.length() > 5)
			.forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();	// 빈칸
		
		// 요소의 첫 문자가 'a'인 경우만 대문자로 출력
		list.stream()
			.filter(s -> s.charAt(0) == 'a')
			.map(s -> s.toUpperCase())
			.forEach(n -> System.out.print(n + "\t"));

		System.out.println();	// 빈칸
		
		// 요소의 마지막 문자가 'e'인 경우만 출력
		list.stream()
			.filter(s -> s.charAt(s.length() - 1) == 'e')
			.forEach(n -> System.out.print(n + "\t"));

		System.out.println();	// 빈칸
		
		list.stream()
			.filter(s -> s.startsWith("a"))	// 문자열의 첫글자가 'a' 
			.filter(s -> s.endsWith("e"))	// 문자열의 마지막 글자가 'e'
			.map(s -> s.toUpperCase())		// 대문자로 변환
			.forEach(n -> System.out.println(n + "\t"));
	}

}
// 문자열의 (갯수,길이 ?????) 가 5보다 큰것만 출력되도록 하기

// a 로 시작되는 것만 대문자로 출력