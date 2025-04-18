package ex13;

public class MemberTest {

	public static void main(String[] args) {
		Member man = new Member("신형만", Gender.MAN);
		Member woman = new Member();
		woman.setName("봉미선");
		woman.setGender(Gender.WOMAN);
		
		System.out.println(man);
		System.out.println(woman);
		
		System.out.println("=================================");
		
		System.out.println(man.getGender());
		System.out.println(woman.getGender());
	}

}
