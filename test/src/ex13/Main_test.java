package ex13;

public class Main_test {

	public static void main(String[] args) {
		Customer c1 = new Customer("james", 0);

		c1.buy(1000001);
		
		if(c1.gettotalSpent() > 1000000) {
			VipCustomer vip = (VipCustomer) c1; 
			System.out.println(vip.toString()); 
		} else {
			
		}
		
		


	}

}
/*

https://chatgpt.com/c/67f383a2-d3cc-800a-b605-e92a1e33bdea
제너릭 관련

https://chatgpt.com/c/67e651c6-0414-800a-8612-565a86d97ca4
지금 하고 있는 문제

일빈고객
고객번호 c + 순번
이름
연락처
구매금액 : 입력값

vip 고객
고객번호 c + 순번
이름
연락처
구매금액 : 입력값
포인트

1,000,000원 초과 시 vip고객으로 전환
vip고객으로 전환되었다는 메시지 콘솔 출력

vip고객 포인트 : 구매 금액의 5%

*/
