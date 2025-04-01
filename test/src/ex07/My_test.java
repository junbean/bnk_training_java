package ex07;

public class My_test {
	public static void main(String[] args) {
		My_int_array m = new My_int_array();
		
		m.setArr(0, 1);
		m.setArr(1, 3);
		m.setArr(2, 5);
		m.setArr(3, 7);
		m.setArr(4, 9);
		
		for(int i=0; i<5; i++) {
			System.out.println(m.getArr(i));		
		}
		
		System.out.println(m.toString());
	}
}
