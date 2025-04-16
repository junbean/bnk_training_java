package ex09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	
	@Override
	public int compareTo(Person o) {
		// name 기준 비교
		/*
		int result = this.name.compareTo(o.name);
		System.out.println(result);
		return result;
		*/
		
		int result_asc = this.age - o.age;	// 오름차순
		int result_desc = o.age - this.age;	// 내림차순
		
		// System.out.println(result_asc);
		// System.out.println(result_desc);
		
		return result_desc;
	}
}

// Immortal object = 