package ex14;

public class PromblemOfThread {

	public static int money = 0;
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			 for(int i=0; i<10000; i++) {
				 money++;
			 }
		};
		
		
		Runnable task2 = () -> {
			for(int i=0; i<10000; i++) {
				 money--;
			 }
		};
		
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	
		// money의 예상 값은 0이었다 -> t1과 t2가 서로 10000씩 추가하고 감소시키니까
		// 하지만 두개의 스레드가 공용자원을 사용해서 자원의 동시성 문제가 발생함
		System.out.println(money);
	}

}
