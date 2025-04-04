package ex09;

import java.util.Scanner;

public class PrinterSelector {
	Scanner sc = new Scanner(System.in);
	Printable printer;
	
	
	public PrinterSelector() { }
	public PrinterSelector(Printable printer) {
		this.printer = printer;
	}

	public void selet(Printable printer) {
		this.printer = printer;
	}
	public void select(Document doc) {
		System.out.print("프린터를 선택하세요 (black:[흑백], color:[컬러]) : ");
		String input = sc.nextLine();
		
		if(input.equals("black")) {
			printer = new BlackPrinter();
		} else if(input.equals("color")) {
			printer = new ColorPrinter();
		} else {
			printer = new BlackPrinter();	
		}
		printer.print(doc);
	}
	
}
