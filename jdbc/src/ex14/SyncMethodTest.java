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
		
		// join 메서드는 스레드의 실
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
/*

synchronized 메서드의 락(lock) 작동 방식

특정 메서드에만 락이 걸립니다. 
	한 스레드가 객체의 synchronized 메서드를 실행 중일 때, 
	다른 스레드는 같은 객체의 모든 synchronized 메서드에 접근할 수 없습니다.
일반 메서드는 영향 없음: 
	synchronized가 붙지 않은 일반 메서드는 락과 관계없이 
	어떤 스레드든 자유롭게 실행할 수 있습니다.
스레드 자체가 락 되는 것이 아님: 
	스레드 자체가 멈추거나 락이 걸리는 것이 아니라, 
	해당 스레드가 특정 락(객체 또는 클래스 락)을 획득하지 못해 대기하는 상태가 됩니다.


//=============================

예를 들어 설명하자면:
public class Example {
    public synchronized void method1() { ... }
    public synchronized void method2() { ... }
    public void method3() { ... }  // 동기화되지 않음
}
위 클래스에서:
	스레드 A가 method1()을 실행 중이라면, 
	스레드 B는 method1()과 method2()에 접근할 수 없습니다(둘 다 synchronized).

	하지만 스레드 B는 method3()은 자유롭게 실행할 수 있습니다(synchronized가 아님).

	스레드 A가 method1() 실행을 마치면 락을 해제하고, 
	대기 중이던 다른 스레드가 synchronized 메서드를 실행할 수 있게 됩니다.

요약
	synchronized 키워드는 메서드나 코드 블록 단위로 적용됩니다.
	
	한 스레드가 synchronized 메서드/블록을 실행 중일 때, 
	다른 스레드는 같은 객체(인스턴스 메서드) 또는 
	클래스(정적 메서드)의 synchronized 부분에 접근할 수 없습니다.

	synchronized가 아닌 메서드는 락의 영향을 받지 않습니다.
	
	스레드 자체가 아닌, 객체나 클래스에 대한 접근이 제한되는 것입니다.



*/