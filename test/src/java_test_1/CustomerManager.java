package java_test_1;

public class CustomerManager {

	// static 키워드를 사용하며 전역메서드로 사용됨
	// 현재 VIPCustomer클래스에서는 기본 생성자가 없으므로 객체를 생성하기 위해서는 매개변수를 넣어야 한다
	// 수정본
	public static VIPCustomer createVipCustomer(Customer customer) {
		VIPCustomer vc = new VIPCustomer(customer);
		return vc;
	}
	
	// 원본
	/*
	public static VIPCustomer createVipCustomer(Customer customer) {
		VIPCustomer vc = new VIPCustomer();

		return vc;
	}
	*/
}
