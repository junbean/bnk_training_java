package ex09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbb", "ccc");	// 해당 콜렉션은 수정 불가
		
		// 단순 for - 사용자가 배열의 길이를 지정한다
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		
		System.out.println("//========================================//");
		
		// 향상된 for - 배열의 시작부터 끝까지
		for(String s : list) {
			System.out.println(s + "\t");
		}
		
		System.out.println("//========================================//");
		
		Iterator<String> itr = list.iterator();
		// Iterator 사용 - 배열의 시작부터 끝까지
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		
		
	
	}
}
