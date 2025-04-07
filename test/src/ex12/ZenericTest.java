package ex12;

import java.util.ArrayList;
import java.util.List;

public class ZenericTest {
	public static void main(String[] args) {
		// Box<String> box = new Box<String>();
		Box<String> box = new Box<>();	// 뒤에는 생략해도 된다
		box.t = "hello";
		System.out.println(box.t);
		
		Box<X> xbox = new Box<>();
		xbox.t = new X();		// 현재 t는 X클래스를 사용하므로 객체를 사용하기에 X클래스의 x를 사용하려면 객체가 필요함
		xbox.t.x = 10;
		System.out.println(xbox.t.x);
		
		
		// arrayList
		ArrayList<String> sList = new ArrayList<>();
		sList.add("asdf");
		sList.add("fff");
		System.out.println(sList);
		
		List<Integer> llist = new ArrayList<>();
		llist.add(3);
		llist.add(4);
		llist.add(5);
		System.out.println(llist);
	}

}

// https://chatgpt.com/c/67ecc5b3-a8e0-800a-ad11-fd1299e4a0ec
// 자바 로드맵

// https://chatgpt.com/c/67e0ed68-ec70-800a-b56e-b9fe98c62b57
// 상속에 대한 이해

// https://chatgpt.com/c/67e651c6-0414-800a-8612-565a86d97ca4
// 추가 궁금증

