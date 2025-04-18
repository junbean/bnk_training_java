package ex13;

enum Animal1 {
	DOG, CAT
}

enum Person1 {
	MAN, WOMAN
}

public class SafeEnumTest {

	public static void main(String[] args) {
		// who(Animal1.CAT);
		who(Person1.MAN);
	}
	
	public static void who(Person1 man) {
		switch(man) {
			case MAN:
				System.out.println("남성 손님입니다.");
				break;
			case WOMAN:
				System.out.println("여성 손님입니다.");
				break;
		}
	}
}
