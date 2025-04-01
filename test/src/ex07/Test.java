package ex07;

public class Test {

	public static void main(String[] args) {
		Mouse[] arr = new Mouse[3];
		Mouse m = new Mouse();
		WheelMouse wm = new WheelMouse();
		OpticalMouse om = new OpticalMouse();
		
		arr[0] = m;
		arr[1] = wm;
		arr[2] = om;
		
		for(int i=0; i<3; i++) {
			arr[i].clickLeft();
			arr[i].clickRight();
			if(arr[i] instanceof WheelMouse) {
				((WheelMouse) arr[i]).scroll();
			}
			System.out.println();
		}
		
		System.out.println("===================================");
	
		for(int i=0; i<3; i++) {
			if(arr[i] instanceof OpticalMouse) {
				System.out.println("Opcation Mouse에 해당");
			} else if(arr[i] instanceof WheelMouse) {
				System.out.println("Wheel Mouse에 해당");
			} else if(arr[i] instanceof Mouse) {
				System.out.println("Mouse에 해당");	
			} else {
				System.out.println("i don't know");
			}
			System.out.println();
		}
	}
}
