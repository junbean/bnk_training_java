package test;

public class Student_test {

	public static void main(String[] args) {
		Student st = new Student();

		st.setter_class_num(1);
		st.setter_name("james");
		st.setter_grade(11);
		
		int result1 = st.getter_class_num();
		int result3 = st.getter_grade();
		String result2 = st.getter_name();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}



/*
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

s1.name = "james";
s1.class_num = 11;
s1.kor_score = 55;
s1.eng_score = 65;
s1.math_score = 75;

s2.name = "Anne";
s2.class_num = 15;
s2.kor_score = 34;
s2.eng_score = 45;
s2.math_score = 56;

s3.name = "tom";
s3.class_num = 18;
s3.kor_score = 77;
s3.eng_score = 88;
s3.math_score = 99;	

s1.show_score();
System.out.println("=================");
s2.show_score();
System.out.println("=================");
s3.show_score();
*/


/*
//1. 학생 3명의 인스턴스를 생성하시오
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

s1.name = "james";
s1.class_num = 1;
s1.kor_score = 55;
s1.eng_score = 65;
s1.math_score = 75;

s2.name = "Anne";
s2.class_num = 2;
s2.kor_score = 34;
s2.eng_score = 45;
s2.math_score = 56;

s3.name = "tom";
s3.class_num = 3;
s3.kor_score = 79;
s3.eng_score = 88;
s3.math_score = 99;	

// 2. 1번을 활용해서 학생 배열을 만드시오
Student[] arr_st = new Student[3];
arr_st[0] = s1;
arr_st[1] = s2;
arr_st[2] = s3;

// 3.학생들의 국어점수 합계를 구하시오
int sum_kor_score = 0;
for(int i=0; i<3; i++) {
	sum_kor_score = sum_kor_score + arr_st[i].kor_score;
}
System.out.println("학생 배열의 국어 점수 합계 : " + sum_kor_score);
*/



/*
// 1. 학생 3명의 인스턴스를 생성하시오
Student s1 = new Student(1, "james", 11, 55, 66, 77);
Student s2 = new Student(2, "anne", 22, 40, 50, 60);
Student s3 = new Student(3, "mike", 34, 1, 2, 3);

// 2. 1번을 활용해서 학생 배열을 만드시오
Student[] arr_st = new Student[3];
arr_st[0] = s1;
arr_st[1] = s2;
arr_st[2] = s3;

// 3.학생들의 국어점수 합계를 구하시오
int sum_kor_score = 0;
for(int i=0; i<3; i++) {
	sum_kor_score = sum_kor_score + arr_st[i].kor_score;
}
System.out.println("학생 배열의 국어 점수 합계 : " + sum_kor_score);
*/

/*
Student st = new Student(1, "제임스", 13, 11, 22, 33);

System.out.println("현재 학생의 번호 : " + st.class_num);
st.change_num(30);
System.out.println("바꾼후 학생의 번호 : " + st.class_num);


*/

