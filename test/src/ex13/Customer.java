package ex13;

public class Customer {
	static int count = 1;
	String customer_id;
	String name;
	int phone;
	int totalSpent;

	
	public Customer() {
		this.customer_id = "c" + count;
		count++;
	}
	public Customer(String name, int phone) {
		this();
		this.name = name;
		this.phone = phone;
		this.totalSpent = 0;
	}
	public Customer(String name, int phone, int totalSpent) {
		this();
		this.name = name;
		this.phone = phone;
		this.totalSpent = totalSpent;
	}

	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customer.count = count;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int gettotalSpent() {
		return totalSpent;
	}
	public void settotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}

	
	public void buy(int spend_money) {
		totalSpent = totalSpent + spend_money;
		System.out.println(spend_money + "원을 소비했습니다");
	}
	


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", phone=" + phone + ", amount=" + totalSpent
				+ "]";
	}
}
