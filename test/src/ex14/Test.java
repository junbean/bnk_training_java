package ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("James", 93);
		Student s2 = new Student("Ann", 46);
		Student s3 = new Student("Candy", 100);
		Student s4 = new Student("Bruce", 64);
		Student s5 = new Student("Ben", 56);
		
		
		// 컬렉션
		// arrayList
		ArrayList<Student> sList = new ArrayList<>();
		//boolean tf = sList.add(s1);		// add메서드는 boolean을 반환
		//System.out.println(tf);
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		//배열을 사용하여 낙재생 갯수 출력
		/*
		int count = 0;
		for(int i=0; i<sList.size(); i++) {		// ArrayList의 길이 출력은 size()를 사용한다
			if(sList.get(i).getScore() < 60) {
				count++;					
			}
			// Student result = sList.get(i);		// 배열과 같이 0번째 부터 시작한다
			// System.out.println(result);			
		}
		System.out.println("낙재생 수 : " + count);	// 낙제생 수 출력
		System.out.println("//==================================================//");
		*/
		
		// 또는 향상된 for문을 사용하는 방법
		/*
		for(배열의 요소 타입변수 선언 : 배열) {
			
		}
		*/
		
		// 실제 사용
		 
		for(Student stu : sList) {
			System.out.println(stu);
		}
		
		
		// 문제
		// 매개변수에 번호와 이름을 받고 두개가 현재 사용자 정보와 일치한다면 
		// 해당 객체의 정보를 출력시킨다
		Object[] objs = inputText();
		int sno = (Integer)objs[0];
		String sname = (String)objs[1];
		
		// 메인 로직
		//findStudent(sno, sname, sList); - 현재 클래스에 존재하는 메서드
		StudentCheker.findStudent(sno, sname, sList);
		

		// 배열을 사용하는 방법
		/*
		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
	
		int count = 0;
		for(int i=0; i<students.length; i++) {
			if(students[i].getScore() < 60) {
				count++;
			}
			System.out.println(students[i]);
		}
		System.out.println("낙재생 수 : " + count);
		*/
	}
	
	public static Object[] inputText() {
		Scanner sc = new Scanner(System.in);
		Object[] objs = new Object [2];
		int sno;
		String sname;
		
		System.out.print("번호를 입력하세요 : ");
		sno = sc.nextInt();
		
		System.out.print("이름을 입력하세요 : ");
		sname = sc.next();	
		
		objs[0] = sno;
		objs[1] = sname;
		
		sc.close();
		return objs; 
	}
	
	/*
	알아서 타입에 따라 scanner를 통해서 알아서 받기
	public static <T> T inputSomething() {
		Scanner sc = new Scanner(System.in);
		T input;
		
		System.out.print("번호를 입력하세요 : ");
		input = sc.next();
		
		
		
		sc.close();
		return input; 
	}
	*/

	public static void findStudent(int sno, String sname, ArrayList<Student> sList) {
		int count = 0;
		for(Student stu : sList) {
			if((stu.getSno() == sno) && (sname.equals(stu.getSname()))) {
				System.out.println("찾은 학생 : " + stu);
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("찾은 학생이 없습니다.");
		}
	}
}
