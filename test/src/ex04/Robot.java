package ex04;

public class Robot {
	private String name;
	private int emotion;
	
	
	public Robot() {
		emotion = 5;
	}
	public Robot(String name) {
		this();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getemotion() {
		return emotion;
	}
	public void setemotion(int emotion) {
		if (check_emotion(emotion)) {
			this.emotion = emotion;
		} else {
			System.out.println("기분의 수치가 한계범위 밖입니다..");
		}
	}
	
	// to string
	@Override
	public String toString() {
		String info;
		if(emotion <= 2) {
			info = name + "은(는) 울적해요.";
		} else if(emotion >= 6) {
			info = name + "은(는) 하늘을 나는 기분이에요.";
		} else {
			info = name + "의 기분은 " + emotion + "입니다";
		}
		
		return info;
	}
	

	// etc
	public void praise() {
		int a = this.emotion + 1;
		
		if (check_emotion(a)) {
			this.emotion = a;
		} else {
			// System.out.println("더이상 하면 뇌절임");
		}
		
//		if (emotion >= 7)
//			System.out.println("하늘을 나는 기분이에요!! - " + this.emotion);
	}

	public void scold() {
		int b = this.emotion - 2;
		if(check_emotion(b)) {
			this.emotion = b;	
		} else {
			// System.out.println("적당히 갈구셈");	
		}
		
//		if(emotion <= 2) 
//			System.out.println("울적해요.. - " + this.emotion);		
	
	}

	private boolean check_emotion(int emotion) {
		if (emotion >= 1 && emotion <= 10) {
			return true;
		} else {
			return false;
		}
	}
}
