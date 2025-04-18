package ex14;

public class MyRunnableTest {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();

		Thread t1 = new Thread(runnable, "Thread-A");
		Thread t2 = new Thread(runnable, "Thread-B");
		
		// 작성된 순서에 따라 스레드는 실행순서를 정할수 없다
		// 스레드는 다른 공간에서 코드가 실행되는거라고 봐야한다
		t1.start();
		t2.start();
		
		
	}

}
