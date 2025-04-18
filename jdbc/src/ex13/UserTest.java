package ex13;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User(1, "짱구", Gender.MAN, Tier.BRONZE);
		User user2 = new User(2, "철수", Gender.MAN, Tier.SILVER);
		User user3 = new User();
		user3.setUserId(3);
		user3.setName("유리");
		user3.setGender(Gender.WOMAN);
		user3.setTier(Tier.GOLD);

		
		showTierInfo(user1);
		showTierInfo(user2);
		showTierInfo(user3);
		
		System.out.println(); // 빈칸
		
		user1.price(100);	// 브론즈
		user2.price(100);	// 실버
		user3.price(100);	// 골드
	}
	
	
	public static void showTierInfo(User user) {
		System.out.println(user.getName() + "의 회원 정보 : "
				+ user.getTier() + "[" 
				+ user.getTier().getKorName() + ", "
				+ user.getTier().getDiscountRate() 
				+ "]");
	}
}
