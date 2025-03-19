package test;

public class Test_al_sort {

	public static void main(String[] args) {

		// 선택 정렬
		/*
		int[] arr = {5,6,2,1,4,3};
		int[] arr_sort = sortSelect(arr);
		System.out.println("선택 정렬 결과");
		show(arr_sort);
		*/
		
		//==============================================================================
		//문자 찾기
		int[] arr = {1,2,3,4,5,6,7};
		int n = 6;		// 배열에서 찾고자 하는 값
		int mid = (int) Math.ceil((double)arr.length/2);	// 배열의 중간값
		// 6일 경우 -> 4(index=3) < 6 -> [5,6,7] -> 6(index=5) == 6 ->  
		// 11일 경우 -> 4(index=3) < 11 -> [5,6,7] -> 6(index=5) < 11 -> 7 < 11
		
		System.out.println(mid);
		System.out.println(arr.length);
		System.out.println("---------");
		double temp;
		int count = 0;
		
		while(count<10) {
			if(n > arr[mid]) {
				// 7 + 4 -> 11 / 2 -> 5.5
				temp = mid;
				temp = (arr.length + temp)/2;
				mid = (int)Math.ceil(temp);
				System.out.println("temp : " + temp);
				System.out.println("n이 큼");
			} else if(n < arr[mid]) {
				temp = mid;
				temp = mid/2;
				mid = (int) Math.ceil(temp);
				System.out.println("n이 작음");
			} else if(n == arr[mid]) {
				System.out.println("arr 배열에서 " + n + "의 위치는 " + mid + "입니다.");
				break;
			} else if(mid == arr.length) {
				System.out.println("arr 배열에서 " + n + "은 존재하지 않습니다.");
				break;
			}
			System.out.println(mid);
			System.out.println("---------");
			count = count + 1;
		}
		
		
		// 해당 단어의 인덱스를 출력해야함
	}
	
	static int[] sortSelect(int[] arr) {
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print((i+1) + "회차 : ");
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			show(arr);
		}
		return arr;
	}
	
	static void show(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
/*
알고리즘 정리

선택 정렬
	562143을		고정된 자리와 그 외의 자리를 두고 낮은 자리 숫자인지를 비교하여 정렬함  
	1회전 1 6 5 2 4 3 
	2회전 1 2 6 5 4 3 
	3회전 1 2 3 6 5 4 
	4회전 1 2 3 4 6 5 
	5회전 1 2 3 4 5 6 
	
	
문자 찾기
	배열에서 글자 찾기(배열은 이미 정렬됨)
	길이를 찾고 중간값을 찾음
		만약 3.5같은게 나오면 반올림 해서 4로 만든
	중간값을 찾아서 비교함
		만약 n의 값이 크다면 오른쪽 해서 반복
		n이 작다면 왼쪽에서 반복

*/
