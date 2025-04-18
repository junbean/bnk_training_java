package ex12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

// 일기장 프로그램
public class Diary {
	static FileWriter fw;
	static FileReader fr;	
	static BufferedReader br;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===일기장===");
			System.out.print("1:[일기장 작성] 2:[일기장 읽기] 3:[일기장 목록] 0:[프로그램 종료] >>");
			String choose = sc.nextLine();

			System.out.println();	// 빈칸
			
			if(choose.equals("1")) {
				diaryWrite();
				
			} else if(choose.equals("2")) {
				diaryRead();

			} else if(choose.equals("3")) {
				// File 객체 생성
				File directory = new File("C:/Temp/jv_test_diary");
				File[] fileList = directory.listFiles();
				
				if(fileList != null) {
					for(File file : fileList) {
						if(file.isFile()) {
							System.out.println("파일 : " + file.getName());
						} else if(file.isDirectory()) {
							System.out.println("폴더 : " + file.getName());
						}
					}
				} else {
					System.out.println("폴더가 비어있습니다");
				}
				

			} else if(choose.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

			System.out.println();
		}
		
	}

	
	public static void diaryWrite() {
		Scanner sc = new Scanner(System.in);
		//LocalDate today = LocalDate.now();
		//String diaryName = today.toString();
		
		System.out.println("===일기장 작성===");
		System.out.print("일기 이름 작성 >>");
		String diaryName = sc.nextLine();
		System.out.print("일기 내용 작성 (종료를 원하면 'end'를 입력) >>");
		String input = sc.nextLine();
		String content = "";
		content = input;
		
		while(true) {
			System.out.print("이어서 >>");
			String input_con = sc.nextLine();
			
			if(input_con.equals("end")) {
				break;
			} else {
				content = content + "\n" + input_con;
			}
		}
		
		try {
			fw = new FileWriter("C:/Temp/jv_test_diary/" + diaryName + ".txt");
			fw.write(content);
		} catch (IOException e) {
			System.out.println("일기장 내용 작성에 실패했습니다");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}						
		}
	}
	
	public static void diaryRead() {
		Scanner sc = new Scanner(System.in);
		// LocalDate today = LocalDate.now();
		System.out.println("===일기장 읽기===");
		System.out.print("일기 이름 >>");
		String diaryName = sc.nextLine();
		
		try {
			fr = new FileReader("C:/Temp/jv_test_diary/" + diaryName + ".txt");
			br = new BufferedReader(fr);
			
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("일기장 읽기에 실패했습니다.");
		} catch (IOException e) {
			System.out.println("일기장 읽기에 실패했습니다.");
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
