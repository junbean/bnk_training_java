package ex07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	@Override
	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
}
