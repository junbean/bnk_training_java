package ex04;

public class Delivery_test {

	public static void main(String[] args) {
		User user = new User();
		user.setUserId("abc123");
		user.setUserName("홍길순");
		user.setUserAddress("서울시 영등포구 여의도동 20번지");
		
		Delivery delivery = new Delivery(202503290001L, "2025년 3월 28일", "PD0345-12", user);
		delivery.getOrderUser().getUserId();
		
		// get delivery data
		System.out.println("get data");
		System.out.println(delivery.getOrderNumber());
		System.out.println(delivery.getOrderDate());
		System.out.println(delivery.getOrderProductNumber());
		System.out.println(delivery.getOrderUser().getUserId());
		System.out.println(delivery.getOrderUser().getUserName());
		System.out.println(delivery.getOrderUser().getUserAddress());
		System.out.println();
			
		// to string
		System.out.println("to string");
		System.out.println(delivery.toString());
		System.out.println();
	
	}

}

/*
사람 클래스 생성 - Personal class
개인정보 - 이름, 생년월일, 성별 등등
학생 클래스 - 클래스 객체  - student class
학생 데이터 - 학년, 반, 번호 등등
 
*/



/*
// set data - delivery
Delivery delivery = new Delivery();
delivery.setOrderNumber(202503290001L);
delivery.setOrderDate("2025년 3월 28일");
delivery.setOrderProductNumber("PD0345-12");
// delivery.setOrderId("abc123");
// delivery.setOrderName("홍길순");
// delivery.setOrderAddress("서울시 영등포구 여의도동 20번지");
		
// set data - user
User user = new User();
user.setUserId("abc123");
user.setUserName("홍길순");
user.setUserAddress("서울시 영등포구 여의도동 20번지");
delivery.setOrderUser(user);

// get delivery data
System.out.println("get data");
System.out.println(delivery.getOrderNumber());
System.out.println(delivery.getOrderDate());
System.out.println(delivery.getOrderProductNumber());
// System.out.println(delivery.getOrderId());
// System.out.println(delivery.getOrderName());
// System.out.println(delivery.getOrderAddress());
		
// get user data
System.out.println(delivery.getOrderUser().getUserId());
System.out.println(delivery.getOrderUser().getUserName());
System.out.println(delivery.getOrderUser().getUserAddress());
System.out.println();
	
// to string
System.out.println("to string");
System.out.println(delivery.toString());
System.out.println();
*/