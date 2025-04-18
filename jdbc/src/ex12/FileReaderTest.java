package ex12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	static FileReader fr;	
	static BufferedReader br;
	
	public static void main(String[] args) {
		
		try {
			System.out.println("File Reader 사용하기");
			
			fr = new FileReader("C:/Temp/jv_test/test1.txt");	// 해당 경로의 파일을 읽는다
			int data = 0;
			
			// 파일의 마지막은 -1인 정수로 표시됨, 그래서 읽어들인 값이 -1이면 마지막이라고 판단함
			// 파일을 문자 바이트 단위로 읽는다, 그러니까 한글자씩 읽는다
			while((data = fr.read()) != -1) {	
				// 실제 fr.read()로 읽은 데이터는 정수형이기 때문에 문자로 형변환을 해준다
				System.out.print((char)data);	
			}
			fr.close();
			
			//===============================================
			System.out.println();	// 빈칸
			
			// 버퍼	=========================================
			System.out.println("버퍼 사용하기");
			
			fr = new FileReader("C:/Temp/jv_test/test1.txt");	// 해당 경로의 파일을 읽는다
			br = new BufferedReader(fr);			// 버퍼는 fr을 도와주는 보조 수단, 보조 스트림이라고 부르기도 함
			
			String s = null;		// 문장 단위로 읽는다
			while((s = br.readLine()) != null) {	// 엔터키가 된 곳까지 하나의 문장으로 인식한다, 문장이 없다면 null을 반환한다
				System.out.println(s);
			}
			
			// br.close();
			// fr.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
/* 

end of file = eof
파일의 끝은 정수로 표현되는데 -1로 표시된다

*/