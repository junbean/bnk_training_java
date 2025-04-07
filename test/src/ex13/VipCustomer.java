package ex13;

public class VipCustomer extends Customer {
	private int point;
	
	
	public VipCustomer(String name, int phone, int totalSpent) {
		super(name, phone, totalSpent);
	}

	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "VipCustomer [point=" + point + ", customer_id=" + customer_id + ", name=" + name + ", phone=" + phone
				+ ", totalSpent=" + totalSpent + "]";
	}


	
}
