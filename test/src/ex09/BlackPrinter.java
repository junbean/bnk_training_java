package ex09;

public class BlackPrinter implements Printable {

	@Override
	public void print(Document doc) {
		System.out.println("흑백으로 전문 프린트 합니다.");
		String[] arr = doc.getContent(); 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
	}
	
}
