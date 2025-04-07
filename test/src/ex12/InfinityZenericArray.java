package ex12;

public class InfinityZenericArray<T> {
	private T[] arr;
	private int idx;
	
	public InfinityZenericArray() {
		// arr = (T[]) new Object[3];
	}
	
	public void add(T t) {
		if(idx >= 3) {
			
		}
		arr[idx] = t;
		idx++;
	}
	
	public void delete() {
		
	}
	

}
