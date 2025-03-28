package ex04;

public class Personal_test {

	public static void main(String[] args) {
		Student st = new Student(3, 1, 11, "축구동아리");
		Personal ps = new Personal("이름", "2001-01-13", '남', "울산 중구", st);
		System.out.println(ps.toString());
		
		System.out.println();
		
		ps.setAddress("부산 부산진구");		
		ps.setName("김아무개");
		ps.getStudent().setGrade(4);
		ps.getStudent().setClass_no(3);
		ps.getStudent().setStud_no(24);
		ps.getStudent().setClub("야구동아리");
		System.out.println(ps.toString());
	}

}
