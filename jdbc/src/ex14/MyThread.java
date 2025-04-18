package ex14;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		
			try {
				Thread.sleep(1000); 	// 1초가 스레드를 잠재운다(멈춘다)
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}


/*

프로세스는 하나 이상의 스레드를 가진다
프로세스 : 프로그램이 동작하는 실행되는 하나의 흐름

하나의 프로세스 안에서 여러개의 쓰레드가 존재할 수 있다

CPU의 사용을 번갈아 가면서 사용한다

스레드 만드는 방법

1.스레드를 상속받는다
	- run()을 받아서 오버라이딩 해야함
 
 
 
*/