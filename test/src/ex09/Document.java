package ex09;

import java.util.Scanner;

public class Document {
	private String[] content;

	public void setContent(String[] content) {
		this.content = content;
	}
	public String[] getContent() {
		return content;
	}
	
	// 문서 작성 기능
	public void write() {
		Scanner sc = new Scanner(System.in);		// 스캐너
		System.out.print("프린트할 문서를 작성하세요 : ");	// 최초 입력
		String content = sc.nextLine();			// 입력 전체 저장
		
		while(true) {
			String input = sc.nextLine();	// <-- 입력
			
			// 종료 
			if(input.equals("end")) {
				break;
			}
			
			// 추가
			content = content + "," + input;
		}
		
		sc.close();
		this.content = content.split(","); 	//	<-- 현재 멤버변수에 저장
	}
	
	
	
	/*
	public void write(String text) {
		System.out.println("흑백으로 출력");
		content = text;
	}
	*/
}
