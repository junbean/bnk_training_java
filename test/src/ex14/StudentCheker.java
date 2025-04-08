package ex14;

import java.util.ArrayList;

public class StudentCheker {
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
