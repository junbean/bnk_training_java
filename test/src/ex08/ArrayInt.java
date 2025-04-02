package ex08;

import java.util.Arrays;

public class ArrayInt extends ArrayParrent {
	private int[] arr;

	ArrayInt() {
		arr = new int[5];
	}

	// 값을 배열 맨뒤에 추가 메서드
	// 길이를 초과하게 되면 길이를 동적으로 늘려야함
	// before -> [1,2,3, , ]
	// after -> [1,2,3,6, ]
	@Override
	void add(int n) {
		// 만약 현재 길이를 넘어버리면 길이를 더 올린다
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = n;
				flag = true;
				break;
			}
		}

		if (flag == false) {
			int[] temp = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			temp[arr.length] = n;
			arr = temp;
		}
	}

	// 특정 인덱스 삭제 메서드
	// 그 뒤에 삭제되는 위치 뒤에 요소가 있다면 삭제된 위치를 메꿔야 한다
	@Override
	void delete(int idx) {
		boolean flag = false;
		int[] temp = new int[arr.length - 1];

		for (int i = 0; i < temp.length; i++) {
			if (i == idx) {
				flag = true;
			}

			if (flag == false) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i + 1];
			}
		}
		arr = temp;
	}

	// 배열의 요소를 출력하는 메서드
	void show(String title) {
		System.out.print(title + " arr=[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}

		}
		System.out.println("]");
	}

	int getValidLength() {
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				length++;
			}
		}

		return length;
	}

	@Override
	public String toString() {
		return "arr=" + Arrays.toString(arr);
	}

}

/*
 * 
 * 
 * // idx가 맨 뒤의 위치일 경우 if(idx == arr.length - 1) { int[] temp = new
 * int[arr.length - 1]; for(int i=0; i<arr.length-1; i++) { temp[i] = arr[i]; }
 * arr = temp; } else { int[] temp = new int[arr.length - 1]; for(int i=idx;
 * i<arr.length-1; i++) { arr[i] = arr[i+1]; }
 * 
 * for(int i=0; i<temp.length; i++) { temp[i] = arr[i]; }
 * 
 * arr = temp; }
 * 
 * 
 * ================
 * 
 * 
 * void delete(int idx) { arr[idx] = -1;
 * 
 * int[] temp = new int[arr.length - 1]; for(int i=idx; i<arr.length-1; i++) {
 * arr[i] = arr[i+1]; }
 * 
 * for(int i=0; i<temp.length; i++) { temp[i] = arr[i]; }
 * 
 * arr = temp; }
 * 
 * 
 * =====================
 * 
 * 
 * void delete(int idx) { arr[idx] = -1;
 * 
 * int[] temp = new int[arr.length - 1];
 * 
 * boolean flag = false; for(int i=0; i<temp.length; i++) { if(arr[i] == -1) {
 * flag = true; }
 * 
 * if(flag == false) { temp[i] = arr[i]; } else { temp[i] = arr[i+1]; } }
 * 
 * arr = temp; }
 */
