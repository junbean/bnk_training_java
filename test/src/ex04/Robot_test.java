package ex04;

import java.util.Scanner;

public class Robot_test {

	public static void main(String[] args) {
		Robot robot = new Robot();
		Scanner sc = new Scanner(System.in);
		int choice;
		String name;
		
		// 로봇 이름 정하기
		System.out.print("로봇의 이름을 정해주세요 : ");
		name = sc.next();
		robot.setName(name);
		
		// 메인 로직
		while(true) {
			System.out.print("숫자를 입력하세요(1:[칭찬하기] 2:[꾸중하기] 0:[종료]) : ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println(robot.getName() + "은 칭찬을 들었습니다!");
				robot.praise();
				System.out.println(robot.toString());
				System.out.println();	// 빈칸
			} else if(choice == 2) {
				System.out.println(robot.getName() + "은 꾸중을 들었습니다.");
				robot.scold();
				System.out.println(robot.toString());
				System.out.println();	// 빈칸
			} else if(choice == 0) {
				System.out.println("종료합니다...");
				break;
			} else {
				System.out.println("올바른 입력값이 아닙니다...");
			}
		}
		
	}

}
/*
	System.out.println("===================================");
	
	robot.praise();							// 6
	System.out.println(robot.toString());	// 6
	robot.praise();							// 7
	robot.praise();							// 8
	robot.praise();							// 9
	robot.praise();							// 10
	robot.praise();							// 11
	
	System.out.println("===================================");
	
	robot.scold();
	System.out.println(robot.toString());
*/

	