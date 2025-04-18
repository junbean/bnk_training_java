package ex11;

import java.util.List;

public class StreamFinalTest {

	public static void main(String[] args) {
		List<String> words = List.of("hello", "hi", "world");
		
		boolean result = words.stream()
			//.anyMatch(s -> s.length() < 3);	// 길이가 3미만인 단어를 판별, 한번이라도 조건에 부합될 경우에 true, 아니면 false
			.allMatch(s -> s.length() < 3);		// 모두 조건에 부합될 경우 true, 아니면 false
		
		if(result) {
			System.out.println("있어요");
		} else {
			System.out.println("없어요");
		}
		
		
		
	}
}
