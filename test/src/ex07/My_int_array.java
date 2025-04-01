package ex07;

import java.util.Arrays;

public class My_int_array {
	private int[] arr;
	
	My_int_array() {
		arr = new int[5];
	}	
	
	public int getArr(int n) {
		return arr[n];
	}
	public void setArr(int n, int x) {
		this.arr[n] = x;
	}

	@Override
	public String toString() {
		return "My_int_array [arr=" + Arrays.toString(arr) + "]";
	}
}

// 기본 생성자를 써서 기본 생성자에 배열 길이 5개 저장할수 있도록 마들기
// getter, setter는 각 배열의 요소를 가져오는 기능을 구현, 
// 배열 안의 값을 달라고함
// 특정한 요소값을 반환하는 getter메서드
//