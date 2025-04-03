package ex09;

import java.util.Scanner;

public class Printer_test {

	public static void main(String[] args) {
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
	}

}
