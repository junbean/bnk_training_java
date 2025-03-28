package ex04;

public class Delivery {
	private Long orderNumber;
	private String orderDate;
	private String orderProductNumber;
	private User orderUser;
	
	// 생성자
	public Delivery() { }
	public Delivery(Long orderNumber, String orderDate, String orderProductNumber, User orderUser) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderProductNumber = orderProductNumber;
		this.orderUser = orderUser;
	}
	
	// delivery data
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderProductNumber() {
		return orderProductNumber;
	}
	public void setOrderProductNumber(String orderProductNumber) {
		this.orderProductNumber = orderProductNumber;
	}
	// user data
	public User getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(User orderUser) {
		this.orderUser = orderUser;
	}

	
	@Override
	public String toString() {
		return "orderNumber = " + orderNumber + "\norderDate = " + orderDate + "\norderProductNumber = "
				+ orderProductNumber + "\norderUser = " + orderUser.toString() + "\n";
	}
}


//public String getOrderUserId() {
//	return orderUser.getUserId();
//}
//public void setOrderUserId(String orderUserId) {
//	this.orderUser.setUserId(orderUserId);
//}
//public String getOrderUserName() {
//	return orderUser.getUserName();
//}
//public void setOrderUserName(String orderUserName) {
//	this.orderUser.setUserName(orderUserName);
//}
//public String getOrderUserAddress() {
//	return orderUser.getUserAddress();
//}
//public void setOrderUserAddress(String orderUserAddress) {
//	this.orderUser.setUserAddress(orderUserAddress);
//}
//
