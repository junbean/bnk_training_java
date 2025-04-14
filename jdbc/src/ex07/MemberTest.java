package ex07;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMno(1);
		m1.setName("aaa");
		m1.setPhone("010-1111-1111");
		
		System.out.println(m1);

		Member m2 = new Member();
		m2.setMno(1);
		m2.setName("aaa");
		m2.setPhone("010-1111-1111");
		
		System.out.println(m2);
		
		System.out.println("비교연산 : " + (m1 == m2));
		System.out.println("equlas 연산 : " + m1.equals(m2));		// equals는 비교연ㅅ나자와 다르게 object내부의 값을 비교한다 
		
		System.out.println("===================================================");
		
		Member m3 = m1;
		System.out.println("비교연산 : " + (m1 == m3));
		System.out.println("equlas 연산 : " + m1.equals(m3));
	
		System.out.println("===================================================");
		
		Member m4 = new Member();
		m4.setMno(431);
		m4.setName("aaa");
		m4.setPhone("010-1111-1111");
		System.out.println(m1);
		System.out.println(m4);
		System.out.println("equlas 연산 : " + m1.equals(m4));	
		
		System.out.println("===================================================");
		
		Set<Member> set_member = new HashSet<>();
		set_member.add(m1);
		//set_member.add(m2);
		set_member.add(m4);
		System.out.println("HashSet에 m1의 여부 : " + set_member.contains(m1));
		System.out.println("HashSet에 m2의 여부 : " + set_member.contains(m2));
		System.out.println("HashSet에 m4의 여부 : " + set_member.contains(m4));
		
		System.out.println("===================================================");
		
		System.out.println(m1.hashCode());	// 
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		
		
	}

}
