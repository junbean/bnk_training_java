package ex09;

import java.util.Scanner;

public class Printer_test {

	public static void main(String[] args) {
		/*
		BlackPrinter bp = new BlackPrinter();
		ColorPrinter cp = new ColorPrinter();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할거 : ");
		String txt = sc.next();
		
		Document doc = new Document();
		doc.write(txt);
		
		bp.print(doc);
		cp.print(doc);
		
		sc.close();
		*/
		
		/*
		Printable printer = new BlackPrinter();
		Document doc = new Document();
		doc.docuemnt_text = "나는 정말 자바가 좋아요.";
		printer.print(doc);
		*/
		

		// 추가 문제 
		// 지금 현재는 문장 하나밖에 저장이 되고 나머지는 저장이 되지 않음 
		// 이걸 해결하시오
		
		
		// document
		Document doc = new Document();
		doc.write();
		
		// printer
		PrinterSelector ps = new PrinterSelector();
		ps.select(doc);
		
	}

}
/*

Scanner sc = new Scanner(System.in);
System.out.print("프린트할 문서를 작성하세요 : ");	// 최초 입력
String content = sc.nextLine();			// 입력 전체 저장
String str1;	//	<-- ??? 모르겠음
String str2;	//	<-- ??? 모르겠음	
String str3;	//	<-- ??? 모르겠음

while(true) {
	String input = sc.nextLine();	// <-- 입력
	
	// 종료 
	if(input.equals("end")) {
		break;
	}
	
	// 추가
	content = content + "," + input;
}

// document
Document doc = new Document();
doc.setArrContent(content.split(","));

// printer
Printable printer1 = new BlackPrinter();
printer1.printArr(doc);

System.out.println();	// 빈칸

Printable printer2 = new ColorPrinter();
printer2.printArr(doc);

sc.close();


//=================================================================


Document doc = new Document();
String[] content = doc.writeArr();
doc.setArrContent(content);

// printer
Printable printer1 = new BlackPrinter();
printer1.printArr(doc);

System.out.println();	// 빈칸

Printable printer2 = new ColorPrinter();
printer2.printArr(doc);


//===================================================================

클래스는 다중 상속을 지원하지 않음
하나의 클래스로만 상속받을 수 있다

인터페이스는 다중 상속을 지원한다
정확히는 implements를 통해 여러개의 interface를 상속받을 수 있다

참고로 클래스에게 상속받고 인터페이스에게 따로 상속받을수 있다
*/

