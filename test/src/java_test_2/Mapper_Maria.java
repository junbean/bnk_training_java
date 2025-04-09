package java_test_2;

import java.util.ArrayList;
import java.util.List;

//수정 - IMapper_crud 인터페이스 구현
public class Mapper_Maria implements IMapper_crud {
	private ArrayList<Member> list;
	
	// 생성 - 생성자
	public Mapper_Maria() {
		list = new ArrayList<>();
	}

	@Override
	public void create(Member member) {
		System.out.println("마리아 DB에 멤버 객체 저장");
		list.add(member);
	}

	@Override
	public List<Member> readAll() {
		return list;
	}

	@Override
	public Member read(Member member) {
		return member;
	}
	
}
