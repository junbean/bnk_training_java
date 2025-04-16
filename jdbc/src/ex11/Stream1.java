package ex11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream1 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// 1. 스트림 생성
		IntStream stm1 = Arrays.stream(arr);

		//  2. 중간 연산
		IntStream stm2 = stm1.filter(n -> n%2 == 1);	// 1, 3, 5
		
		// 3. 최종 연산
		int sum = stm2.sum();
		System.out.println(sum);
		
		// 연산을 연결하여 사용 가능 -> method chaining
		int sum2 = Arrays.stream(arr)
				.filter(n -> n%2 == 0)
				.sum();
		System.out.println(sum2);
	}

}

/*

stream 연산은 기존자료를 바꾸지 않는다
stream 연산은 중간연산과 최종연산으로 구성
stream 한번 생성된 연산은 재사용할 수 없다

*/