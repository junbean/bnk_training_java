package ex09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("전우치");
		list.add("손오공");
		
		
		Collections.sort(list);
		System.out.println(list);
		
		StringDesc cmp = new StringDesc();
		
		Collections.sort(list, cmp);	// 원본 데이터를 수정한다
		System.out.println(list);
		
		
	}

}
