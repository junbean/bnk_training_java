package java_test_2;

import java.util.List;

public interface IMapper_crud {

	public void create(Member member);
	
	public List<Member> readAll();
	
	public Member read(Member member);
}
