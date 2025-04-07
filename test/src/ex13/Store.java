package ex13;

public class Store {
	
	void sell(Customer customer) {
		customer.buy(1000001);
		
		if(customer.gettotalSpent() > 1000000) {
			VipCustomer temp = (VipCustomer) customer;
			customer = temp;
		
			System.out.println("vip 고객으로 전환되었습니다.");
		}
	}
}

//VipCustomer temp = new VipCustomer(c.getName(), c.getPhone(), c.getSpent_amount());
//c = temp;