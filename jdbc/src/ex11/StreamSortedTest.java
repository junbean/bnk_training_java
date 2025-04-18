package ex11;

import java.util.Arrays;
import java.util.List;

public class StreamSortedTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");

		list.stream()	// list 스트림 생성
			.sorted()	// 정렬(중간연산)
			.forEach(n -> System.out.print(n + "\t"));	// 요소를 하나씩 꺼내서 소비함(최종 연산)

		System.out.println();
		
		list.stream()
			.sorted((s1, s2) -> s1.length() - s2.length())	// 문자열의 길이를 비교하여 정렬 -> 내림차순
			.forEach(n -> System.out.print(n + "\t"));
	
		
	}

}
