package java_test_3;

import java.util.ArrayList;

public class Main_test {

	public static void main(String[] args) {
		// 문자열
		ZenericRepository<String> strRepo = new ZenericRepository<>();
		strRepo.list = new ArrayList<>();;
		strRepo.list.add("하나");
		strRepo.list.add("둘");
		strRepo.list.add("셋");
		System.out.println(strRepo.list.get(0));
		System.out.println(strRepo.list.get(1));
		System.out.println(strRepo.list.get(2));
		System.out.println();	// 빈칸
		
		
		// 정수
		ZenericRepository<Integer> intRepo = new ZenericRepository<>();
		intRepo.list = new ArrayList<>();;
		intRepo.list.add(1);
		intRepo.list.add(2);
		intRepo.list.add(3);
		System.out.println(intRepo.list.get(0));
		System.out.println(intRepo.list.get(1));
		System.out.println(intRepo.list.get(2));
		
	}

}
