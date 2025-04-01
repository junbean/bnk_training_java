package ex07;
public class Travel_test {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Train train = new Train();
		
		/*
		BusanTravel bt = new BusanTravel();
		
		// 콘솔에 버스를 타고 부산여행을 간 결과로 '부산행 버스에 몸을 싣고...' 가 출력되게 하시오
		bt.goBusan(bus);
		
		// 콘솔에 기차를 타고 부산여행을 간 결과로 '부산행 기차에 몸을 싣고...' 가 출력되게 하시오
		bt.goBusan(train);
		*/
		
		
		// Transporation 사용 - ex07 
		/*
		Transportation t = new Transportation();
		t.goBusan(bus);
		t.goBusan(train);
		*/
		
		// 추상클래스는 선언만 하고 안의 내용을 구현을 하지 않는다
		// 상속받는 자식들이 메서드를 완성시킴
		
		// 추상메서드는 상속받는 메서드간의 약속이다. 그니까 상속받으로 기능만 구현하고 그 나머지는 건들지 않는게 좋다
		// 추상 메서드는 딱 그 용도로 쓰인다
		
		
	}

}
