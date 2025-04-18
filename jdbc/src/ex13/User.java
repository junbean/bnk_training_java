package ex13;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int userId;
	private String name;
	private Gender gender;
	private Tier tier;

	public void price(int inputPay) {
		double discountPay = inputPay - (inputPay * (tier.getDiscountRate()/100));
		System.out.println(tier.getKorName() + " 회원 " + name + "는 " + discountPay + "을 지불했습니다.");
	}
	
	public void pay(int price) {
		int discountCost = tier.calculateDisount(price);
		int payment = price - discountCost;
		
		System.out.println(tier.getKorName() + " 회원 " + name + "는 " + payment + "을 지불했습니다.");
	}
	
}
