package java_test_1;

public class Customer {

	private static int cnt = 1;
	protected String cno;
	protected String name;
	protected String phone;
	protected int payment;
	
	
	public Customer(String name, String phone) {
		cno = "c" + cnt++;
		this.name = name;
		this.phone = phone;
	}
	
	public Customer(String cno, String name, String phone, int payment) {
		this.cno = cno;
		this.name = name;
		this.phone = phone;
		this.payment = payment;
	}

	public String getCno() {
		return cno;
	}

//	public void setCno(String cno) {
//		this.cno = cno;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPayment() {
		return payment;
	}

	
	// createVipCustmer는 Customer 를 전달해줘야 하는데 현재 매개변수로 들어간게 없다
	// 수정본
	public Customer buy(int cost, Customer customer) {
		payment = payment + cost;
		if(payment > 1_000_000) {
			return CustomerManager.createVipCustomer(customer);			
		}
		return this;
	}
	
	// 원본
	/* 
	public Customer buy(int cost) {
		payment = payment + cost;
		if(payment > 1_000_000) {
			return CustomerManager.createVipCustomer();			
		}
		return this;
	}
	*/
	
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", name=" + name + ", phone=" + phone + ", payment=" + payment + "]";
	}
	
}
