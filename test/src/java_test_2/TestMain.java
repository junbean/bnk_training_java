package java_test_2;

import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어느 DBMS를 사용하겠습니까?");
		System.out.println("1. 오라클 \t 2. 마리아디비");
		int answer = sc.nextInt();
		
		// 수정
		IMapper_crud mapper = null;
		// 원본
		// IMapper_crud mapper;
		
		// 수정본
		if(answer == 1) {
			mapper = new Mapper_Oracle();
		}else if(answer == 2) {
			mapper = new Mapper_Maria();
		} 
		// 원본 
		/*
		if(____) {
			mapper = new Mapper_Oracle();
		}else if(_____) {
			mapper = new _______________;
		}
		*/
		
		// 수정 - 멤버 데이터 입력
		Member member = new Member("A", "1234");
		mapper.create(member);
		// 원본
		//mapper.create(Member member);
		
		
		// 멤버 전체조회
		// 수정
		List<Member> list = mapper.readAll();
		// 원본
		/*
		List<______> list = mapper.readAll();
		*/
		
		
		//멤버 목록 콘솔 출력
		// 수정 
		for(Member m : list) {
			System.out.println(m.toString());
		}
		// 원본
		/*
		for(_________ : _______) {
			System.out.println(___);
		}
		*/
		
		
		// 멤버 한명 조회(멤버번호(정수))
		// 수정
		Member m = mapper.read(member);
		// 원본
		/*
		_______ m = mapper.read(____);
		*/
		
		// 생성 - 가져온 멤버 출력
		//System.out.println(m.toString());
		
		
	}
}
