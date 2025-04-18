package ex11;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMidOpsTest {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);
		
		List<Integer> results = numbers.stream()
			.skip(2)	// 앞에서 두개의 요소를 건너뛴다
			.limit(3)	// 길이를 3개로 제한한다
			// .forEach(System.out::println);
			.collect(Collectors.toList());	// 중간 연산의 결과를 가지고 컬렉션 타입으로 만든다 
			
		System.out.println(results);	// [30, 40, 50]
		
		int sum = results.stream()
				.reduce(0, (a, b) -> a + b);	// reduce를 활용하여 results의 모든 요소의 합계를 구함	
		System.out.println(sum);	
		
				
		
	}
}
