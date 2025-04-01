package ex07;

public class OpticalMouse extends WheelMouse {

	@Override
	void clickLeft() {
		System.out.println("광센서로 왼쪽 클릭");
	}

	@Override
	void clickRight() {
		System.out.println("광센서로 오른쪽 클릭");
	}

}
