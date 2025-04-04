package ex09;

public class BeanFactory {
	/*
	정수를 통한 입력받기
	public TV getBean(int num) {
		if(num == 1) {
			return new SamsungTV();
		} else if(num == 2) {
			return new LgTV();
		} else {
			return null;
		}
	}
	*/
	
	public TV getBean(String name) {
		if(name.equals("삼성")) {
			return new SamsungTV();
		} else if(name.equals("lg")) {
			return new LgTV();
		} else {
			System.out.println("해당되는 TV가 존재하지 않습니다..");
			return null;
		}
	}
}
