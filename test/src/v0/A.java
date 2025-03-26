package v0;

public class A {
	private int n;
	private String s;
	
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	public String getS() {
		return s;
	}
	
	public String showInfo() {
		return "n : " + n + ", s : " + s;
	}
	
	//인스턴스의 변수값들을 제공하는 기능을 하는것으로 약속되어 있다
	@Override		// <--- @기호는 어노테이션	
	public String toString() {
		return "A [n=" + n + ", s=" + s + "]";
	}
}
/*
	정보 은닉 기술
	

*/
