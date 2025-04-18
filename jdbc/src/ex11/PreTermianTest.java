package ex11;

import java.util.stream.IntStream;

public class PreTermianTest {

	public static void main(String[] args) {
		// sum : 정수 스트림의 합계
		int sum = IntStream.of(1, 3, 5, 7, 9).sum();
		System.out.println("sum : " + sum);

		// count : 정수 스트림의 갯수
		long count = IntStream.of(1, 3, 5, 7, 9).count();
		System.out.println("count : " + count);
		
		
	}

}
