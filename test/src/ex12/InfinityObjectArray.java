package ex12;

public class InfinityObjectArray {

	public Object[] objs;
	private int idx = 0;
	
	public InfinityObjectArray() {
		objs = new Object[3];
	}
	
	public void add(String s) {
		// 배열의 물리적 크기의 끝에 도달하면 에러가 남
		// 물리적 크기의 끝에 도달했을 때(에러가 나기 전에) 새로운 배열을 만들어서  
		// 그 배열에 넣으면 되지 않을까?
		// 만약에 현재 인덱스 값(i:0~2)이 배열의 크기(3)와 같나?
		// i값이 3과 같냐 --- 그렇다면 세배열(기존 배열  크기 + 3)을 만들어라.
		if(idx >= 3) {
			Object[] temp = new Object[objs.length + 1];
			
			for(int i=0; i<objs.length; i++) {
				temp[i] = objs[i];
			}
			objs = temp;
		}
		objs[idx] = s;
		idx++;
		// 해당 변수의 범위를 따져봐라
		// 인덱스용 변수 1의 범위는? 0~2
	}
	
	
	public void showArray() {
		for(int i=0; i<objs.length; i++) {
			System.out.println(objs[i]);
		}
	}
}
/*


// objs 배열에 데이터를 추가하는 기능의 메서드

public void f1() {
	String s = "aaa";
	objs[0] = s;
}

public void f2() {
	String s = "bbb";
	objs[1] = s;
}

public void f3() {
	String s = "ccc";
	objs[2] = s;
}

	
	
*/
