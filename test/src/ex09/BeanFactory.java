package ex09;

public class BeanFactory {
	TV factory_tv;
	
	public TV getBean(int num) {
		if(num == 1) {
			return new SamsungTV();
		} else if(num == 2) {
			return new LgTV();
		} else {
			return null;
		}
	}
}
