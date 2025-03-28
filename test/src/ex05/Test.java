package ex05;

public class Test {

	public static void main(String[] args) {
		/*
		버스 요금
		Bus bus = new Bus(1, 0, 0);
		Student student = new Student("제임스", 2);
		
		show(bus, student);
		System.out.println();
	
		System.out.println("학생 탑승");
		System.out.println();
		bus.take(student);
		show(bus, student);
		*/
		
		// 성적 로직
		Student st1 = new Student("제임스", 1, 1, 10, 20, 30);
		Student st2 = new Student("엠마", 1, 2, 20, 30, 40);
		Student st3 = new Student("칼", 1, 3, 90, 90, 80);
		Student st4 = new Student("마이크", 1, 4, 80, 80, 80);
		Student st5 = new Student("제인", 1, 5, 60, 70, 80);
		Student[] arr_st = {st1, st2, st3, st4, st5};
		Student[] arr_rank = new Student[5];
		
		
		for(int i=0; i<arr_st.length; i++) {
			// 총합
			int total = arr_st[i].calcTotalScore();
			arr_st[i].setTotal_score(total);
			
			// 평균
			double avg = arr_st[i].calcAvgScore();
			arr_st[i].setAvg_score(avg);
			
			// 통과 여부
			boolean isPass = arr_st[i].checkIsPass();
			arr_st[i].setPass(isPass);
		}
		
		int max_score = 0;
		for(int i=0; i<5; i++) {
			for(int j=1; j<5; j++) {
				if(arr_st[i].getAvg_score() > max_score) {
					
				}
			}
		}
		
		
		
		
	}
	
	static void show(Bus bus, Student student) {
		System.out.println("버스 정보 ----------");
		bus.showInfo();
		System.out.println("학생 정보 ----------");
		student.showInfo();
	}
}

/*
국영수 
선생님 - 성적 처리
	다섯명의 학생 정보를 
	
학생
	이름, 학년, 번호, 국어, 영어, 수학
	
학생들의 성적표가 만들어 지도록
	세과목의 평균이 
		60점 미만이면 유급
		60점 이상이면 통과
		
성적처리가 되면 학생 클래스에 학생 성적 여부와 낙제여부가 기록이 된다

학생들의 순위를 매긴다
학생 순위 조회 메서드
학생 순위 조회 메서드 - 특정 학생 순위 조회
*/