package java_test_2;

public class Member {
	private String name;
	private String pw;
	
	
	public Member() { }
	public Member(String name, String pw) {
		this.name = name;
		this.pw = pw;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", pw=" + pw + "]";
	}
}
