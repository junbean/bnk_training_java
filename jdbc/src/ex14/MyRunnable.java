package ex14;

public class MyRunnable implements Runnable {

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
