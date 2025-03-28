package ex05;

public class Student {
	private String name;
	private int grade;
	private int stud_no;
	private int score_kor;
	private int score_eng;
	private int score_math;
	private int total_score;
	private double avg_score;
	private boolean isPass;	// 통과 여부
	private int rank;
	
	// 현재 학생 돈
	private int money;
	
	
	
	
	
	// 버스 요금
	/*
	public Student() {
		this.money = 10000;
	}
	public Student(String name, int grade) {
		this();
		this.name = name;
		this.grade = grade;
	}
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	*/
	// 성적 기능
	public Student() { }
	public Student(String name, int grade, int stud_no) {
		this.name = name;
		this.grade = grade;
		this.stud_no = stud_no;
	}
	public Student(String name, int grade, int stud_no, int score_kor, int score_eng, int score_math) {
		this.name = name;
		this.grade = grade;
		this.stud_no = stud_no;
		this.score_kor = score_kor;
		this.score_eng = score_eng;
		this.score_math = score_math;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getStud_no() {
		return stud_no;
	}
	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
	}
	public int getScore_kor() {
		return score_kor;
	}
	public void setScore_kor(int score_kor) {
		this.score_kor = score_kor;
	}
	public int getScore_eng() {
		return score_eng;
	}
	public void setScore_eng(int score_eng) {
		this.score_eng = score_eng;
	}
	public int getScore_math() {
		return score_math;
	}
	public void setScore_math(int score_math) {
		this.score_math = score_math;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getTotal_score() {
		return total_score;
	}
	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}
	public double getAvg_score() {
		return avg_score;
	}
	public void setAvg_score(double avg_score) {
		this.avg_score = avg_score;
	}
	public boolean isPass() {
		return isPass;
	}
	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	// etc
	public int calcTotalScore() {
		// this.total_score = score_eng + score_kor + score_math;
		return score_eng + score_kor + score_math;
	}
	public double calcAvgScore() {
		//this.avg_score = (double)(score_eng + score_kor + score_math)/3;
		return (double)calcTotalScore()/3;
	}
	public boolean checkIsPass() {
		if(avg_score >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public void takeBus(int fee) {
		if(money >= fee) {
			this.money -= fee;
		} else {
			System.out.println("돈이 없음");
		}
	}
	public void showInfo() {
		System.out.println("이름 : " + name + "\n학년 : " + grade + "\n가진 돈 : " + money);
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", stud_no=" + stud_no + ", score_kor=" + score_kor
				+ ", score_eng=" + score_eng + ", score_math=" + score_math + ", total_score=" + total_score
				+ ", avg_score=" + avg_score + ", isPass=" + isPass + ", rank=" + rank + ", money=" + money + "]";
	}
}
