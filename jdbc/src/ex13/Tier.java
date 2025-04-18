package ex13;

public enum Tier {
	// 긱 회원 등급에 할인율 부여
	BRONZE("브론즈", 2.0), 
	SILVER("실버", 5.0), 
	GOLD("골드", 10.0);
	
	private final String korName;
	private final double discountRate;
	
	private Tier(String korName, double discountRate) {
		this.korName = korName;
		this.discountRate = discountRate;
	}

	public String getKorName() {
		return korName;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	
	public int calculateDisount(int price) {
		return (int)(price * (discountRate / 100.0));
	}
}
