package ex09;

public class LgTV implements TV {
	public void turnOn() {
		System.out.println("LgTV 전원 킨다.");
	}
	public void turnOff() {
		System.out.println("LgTV 전원 끈다.");
	}
	public void soundUp() {
		System.out.println("LgTV 소리 올리기.");
	}
	public void soundDown() {
		System.out.println("LgTV 소리 내리기.");
	}

	
	// 상속받은 오버라이드 메서드
	@Override
	public void powerOn() {
		System.out.println("LgTV 전원 킨다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV 전원 끈다.");
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV 소리 올리기.");
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV 소리 내리기.");
	}
}
