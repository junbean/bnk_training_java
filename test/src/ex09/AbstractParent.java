package ex09;

public abstract class AbstractParent {
	private int n;
	
	public AbstractParent() {
		System.out.println("AbstractParent 생성자 호출");
	}
	public AbstractParent(int n) {
		this();
		this.n = n;
	}
	
	public void f() {
		System.out.println("f()함수 실행....");
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public abstract void af();
}


// abstract, interace 관련
// https://chatgpt.com/c/67e0ed68-ec70-800a-b56e-b9fe98c62b57 