package ex14;

public class SyncMethodTest {

	public static int money = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable task1 = () -> {
			 for(int i=0; i<10000; i++) {
				 deposit();
			 }
		};
		
		
		Runnable task2 = () -> {
			for(int i=0; i<10000; i++) {
				withdraw();
			 }
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(money);
	}
	
	// synchronized : 동기화
	// asynchronized : 비동기화
	// synchronized 키워드의 메서드를 실행중일때 다른 스레드는 해당 객체의 모든 synchronized 메서드에 접근할수 없다
	// 말그대로 t1이 deposit()을 실행중일때 t2는 락이 된다. deposit()이 실행이 끝나면 t2의 락이 끝난다 
	public synchronized static void deposit() {
		money++;
	}
	
	public synchronized static void withdraw() {
		money--;
	}

}
