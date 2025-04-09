package java_test_1;

public class Customer_test {
	
	public static void main(String[] args) {
		// Customer 객체 생성
		Customer customer = new Customer("준빈", "010-4545-2424");
		System.out.println(customer);
		
		// 객체 buy 메서드
		customer = customer.buy(500000, customer);
		System.out.println(customer);
		
		// 1,000,000원 이상 소비 -> VIP 승격
		customer = customer.buy(700000, customer);
		System.out.println(customer);
		
		// VIPCustomer 객체인지 확인
		//System.out.println(customer.getClass()); 
		
		//==============================================================================
		
		// VIPCustomer로 형변환
		VIPCustomer vCustomer = (VIPCustomer) customer;
		
		// VIPCustomer point 메서드 실행
		vCustomer.savePoint(10000);
		System.out.println(vCustomer.toString()); 
		
		
	}

}
