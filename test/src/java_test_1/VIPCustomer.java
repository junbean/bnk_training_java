package java_test_1;

public class VIPCustomer extends Customer implements VipService{

	private static int vcnt = 1;
	private String vno;
	private double point;
	
	// 수정본
	// 부모 생성자를 호출하여 객체를 기존 데이터를 통하여 객체 필드값을 지정
	public VIPCustomer(Customer customer) {
		super(customer.cno, customer.name, customer.phone, customer.payment);
		vno = "v" + vcnt++;
	}
	
	// 원본
	/*
	public VIPCustomer(Customer customer) {	
		vno = "v" + vcnt++;
	} 
	*/
	
	public String getVno() {
		return vno;
	}
	
	public double getPoint() {
		return point;
	}
	
	// 수정
	// 인터페이스를 생성하여 해당 추상 메서드를 생성
	@Override
	public void savePoint(int cost) {
		// 수정본
		point = point + (double)cost * ((double) 5/100);
		// 원본
		// point = point + (double)cost * (5/100);
	}
	
	@Override
	public String toString() {
		return "VIPCustomer [vno=" + vno + ", point=" + point + ", cno=" + cno + ", name=" + name + ", phone=" + phone
				+ ", payment=" + payment + "]";
	}

}
