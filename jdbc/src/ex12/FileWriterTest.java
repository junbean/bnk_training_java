package ex12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			//FileWriter fw = new FileWriter("C:/Temp/jv_test/test.txt");
			FileWriter fw = new FileWriter("C:/Temp/jv_test/test1.txt");	// 작성할 파일 경로를 지정, 만일 파일이 없다면 해당 경로에 파일을 만든다
			fw.write("Hello, Java File I/O를 연습중입니다.");	// 작성할 문자열을 입력
			fw.close();	// close를 사용하지 않으면 파일에 문자열이 작성되지 않는다
			
			System.out.println("파일에 문자열을 성공적으로 썼습니다.");
			
			fw = new FileWriter("C:/Temp/jv_test/test1.txt", true);		// true를 사용하면 이어쓰기가 가능하다
			fw.write("\n이어서 씁니다. Hello, Java File I/O를 연습중입니다.\n");	
			fw.close();	
			
			System.out.println("파일에 문자열을 성공적으로 이어 썼습니다.");
			
		} catch(IOException e) {
			
		}

	}

}
