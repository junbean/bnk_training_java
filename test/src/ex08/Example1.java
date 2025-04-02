package ex08;

import java.util.Arrays;

public class Example1 {
	private int[] arr;
	
	Example1() {
		arr = new int[5];
	}
	
	void add(int idx, int n) {
		if(arr[idx] == 0) {
			arr[idx] = n;
		} else {
			arr[idx] = 0;
		}
	}

	@Override
	public String toString() {
		return "Example1 [arr=" + Arrays.toString(arr) + "]";
	}
}
