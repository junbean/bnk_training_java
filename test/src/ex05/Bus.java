package ex05;

public class Bus {
	private int buss_no;
	private int passenser_cnt;
	private int all_money;
	private final int fee = 1000;
	
	Long i;
	int a;
	
	
	public Bus() { }
	public Bus(int buss_no, int passenser_cnt, int all_money) {
		this.buss_no = buss_no;
		this.passenser_cnt = passenser_cnt;
		this.all_money = all_money;
	}
	
	
	public int getBuss_no() {
		return buss_no;
	}
	public void setBuss_no(int buss_no) {
		this.buss_no = buss_no;
	}
	public int getPassenser_cnt() {
		return passenser_cnt;
	}
	public void setPassenser_cnt(int passenser_cnt) {
		this.passenser_cnt = passenser_cnt;
	}
	public int getAll_money() {
		return all_money;
	}
	public void setAll_money(int all_money) {
		this.all_money = all_money;
	}
	
	
	// etc
	public void take(Student student) {
		student.takeBus(fee);
		all_money += fee;
		passenser_cnt += 1;
	}
	public void showInfo() {
		System.out.println("버스번호 : " + buss_no + "\n승객 수 : " + passenser_cnt + "\n요금 총액 : " + all_money);
	}
}
