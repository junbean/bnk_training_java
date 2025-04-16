package ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {
		// 자바의 컬렉션에 대한 이해
		// 컬렉션에 sort를 사용하려면 해당 컬렉션의 자료형에 Comparable <-- 이게 상속되어야지 sort() 메서드 사용이 가능하다 
		
		// 
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "멀린");

		list = new ArrayList<>(list);

		list.add("aaa");	// 리스트에 문자열 추가
		for(String s : list) {
			System.out.print(s + "\t");
		}
		
		System.out.println();	// 빈칸
		
		Collections.sort(list);	// 문자열에 대한 정렬을 수행
		for(String s : list) {
			System.out.print(s + "\t");
		}
		
		
	}

}
