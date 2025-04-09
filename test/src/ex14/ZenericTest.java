package ex14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZenericTest {

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<>();
		sList.add("aaa");
		sList.add("bbb");
		sList.add("ccc");
		
		String s = sList.get(0);
		System.out.println(s);
		
		
		// Map은 두개의 타입이 붙어있다, 앞쪽은 key, 뒤쪽은 value
		Map<Integer, String> map = new HashMap<>();	
		map.put(1, "철수");
		map.put(2, "유리");
		map.put(3, "짱구");
		
		String value1 = map.get(1);
		System.out.println(value1);
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
	}

}
