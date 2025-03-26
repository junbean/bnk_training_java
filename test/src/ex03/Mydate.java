package ex03;

public class Mydate {
	// 멤버 변수
	int year;
	int month;
	int date;
	
	// 생성자
	Mydate() {
		
	}
	public Mydate(int year, int month, int date) {
		//		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	// getter setter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(check_month(month)) {
			this.month = month;
		} else {
			System.out.println("setMonth 에러 발생 - 올바르지 않은 입력값");
		}
		
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if(check_date(date)) {
			this.date = date;	
		} else {
			System.out.println("setDate 에러 발생 - 올바르지 않은 입력값");
		}
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Mydate [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
	
	
	// func
	private boolean check_month(int month) {
		if(month >= 1 && month <= 12) {
			return true;
		} else {
			return false;	
		}
	}
	
	private boolean check_date(int date) {
		if(date < 1 || date > 31) {
			return false;
		}
		
		if(month == 2) {
			if(date <= 28) {
				return true;
			} else {
				return false;
			}
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(date <= 30) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
}
