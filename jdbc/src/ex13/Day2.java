package ex13;

public enum Day2 {
	// 각 상수에 한글이름과 영어이름을 부여 
	MONDAY("월요일", "Monday"),
	TUESDAY("화요일", "Tuesday"),
	WEDNESDAY("수요일", "Wednesday"),
	THURSDAY("목요일", "Thursday"),
	FRIDAY("금요일", "Friday"),
	SATURDAY("토요일", "Saturday"),
	SUNDAY("일요일", "Sunday");

	private final String korName;
	private final String engName;
	
	Day2(String korName, String engName) {
		this.korName = korName;
		this.engName = engName;
	}

	public String getKorName() {
		return korName;
	}

	public String getEngName() {
		return engName;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
