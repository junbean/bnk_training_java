package ex04;

import java.util.Scanner;

public class Unit_test {

	public static void main(String[] args) {
		Unit unit_a = new Unit("저그");
		Unit unit_b = new Unit("테란");
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		
		while(true) {
			System.out.print("행동을 선택하세요(1:[공격] 2:[강공격] 3:[대기] 0:[종료]]) : ");
			choice = sc.nextInt();
		
			if(choice == 1) {
				unit_a.attack(unit_b);
			} else if(choice == 2) {
				unit_a.attack(unit_b, 2);
			} else if(choice == 3) {
				System.out.println("대기");
				// continue;
			} else if(choice == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("에러발생");
			}
			System.out.println(unit_a.getName() + " : " + unit_a.getEnergy());
			System.out.println(unit_b.getName() + " : " + unit_b.getEnergy());
			System.out.println();
		}
	}
}

/*

unit_a.attack(unit_b);
System.out.println(unit_a.getEnergy());
System.out.println(unit_b.getEnergy());
System.out.println("-------");
unit_a.attack(unit_b);
System.out.println(unit_a.getEnergy());
System.out.println(unit_b.getEnergy());
System.out.println("-------");
unit_a.attack(unit_b);
System.out.println(unit_a.getEnergy());
System.out.println(unit_b.getEnergy());
System.out.println("-------");
unit_a.attack(unit_b);
System.out.println(unit_a.getEnergy());
System.out.println(unit_b.getEnergy());
System.out.println("-------");
unit_a.attack(unit_b);
System.out.println(unit_a.getEnergy());
System.out.println(unit_b.getEnergy());
*/