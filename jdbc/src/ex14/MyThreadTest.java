package ex14;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("Thread-A");	// 스레드의 이름을 지정한다
		t2.setName("Thread-B");
		
		// start() 메서드를 호출하면 상속받은 run() 메서드를 호출한다
		// 스레드의 run() 메서드를 호출하려면 부조건 start() 메서드를 통해서 호출해야 한다
		t1.start();	
		t2.start();
		System.out.println("--------End of Main--------");
	
		// 두개 이상의 스레드가 공용자원을 사용하면 문제가 발생할 수 있다
	}

}
