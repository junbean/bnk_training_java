package test;

import java.util.Scanner;

public class Test_hotel {

	public static void main(String[] args) {

		// 호텔 예약 시스템
		// 10개바의 방이 있음, 처음에는 0모두 0개 예약
		// 몇번 방 예약할지 입력받음
		// 입력하면 방의 현황을 출력함
		// 이미 방이 예약되어 있는데 방을 예약하면 -> 이미 예약된 방임을 알림
		// 퇴실 개념을 없음
		// 만약 방이 모두 찼다면 -> 만실이라고 알리고 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr_room = new int[10];
		//int[] arr_room = {1,1,0,0,1,1,0,0,1,0};
		
		int choose;
		int isfull = 0;
		String isReserve;
		
		// 처음 객실 예약 횟수 체크
		for(int i=0; i<10; i++) {
			if(arr_room[i] == 1) {
				isfull = isfull + 1;
			}
		}
		
		while(true) {
			// 객실 현황 출력
			System.out.println("현재 객실 현황");
			System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");			

			for(int i=0; i<10; i++) {
				
				if(arr_room[i] != 0) {
					isReserve = "예약됨";
				} else {
					isReserve = "-";
				}
				
				System.out.print(isReserve + "\t");
			}
			System.out.println();	// 빈칸
			System.out.println();	// 빈칸
			
			// 예약이 만석이라면 나감
			if(isfull == 10) {
				System.out.println("현재 객실의 예약의 만석이므로 예약시스템을 종료합니다...");
				break;
			}
			
			// 객실 입력
			System.out.print("예약할 방을 골라주세요 : ");
			choose = sc.nextInt();
			
			// 판별
			if(choose>0 && choose <11) {
				if(arr_room[choose-1] == 0) {
					arr_room[choose-1] = 1;
					isfull  = isfull + 1;
					System.out.println("성공적으로 예약되었습니다!");
				} else {
					System.out.println("해당 객실은 이미 예약되었습니다...");
				}
			} else {
				System.out.println("입력이 올바르지 않아 무효처리 되었습니다. 올바른 입력은 1 ~ 10 사이의 숫자입니다.");
			}
			
			System.out.println();	// 빈칸
		}
		
		sc.close();		// Scanner 닫기

	}
}
