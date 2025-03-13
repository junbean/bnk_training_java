package test;

import java.util.Random;
import java.util.Scanner;

public class Test_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 3;

		// switch 타입 - 1
		switch (a) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("1,2,3이 아니다");
			break;
		}

		// switch 타입 - 2
		char b = 'd';
		switch (b) {
		case 'a' -> System.out.println("a 입니다");
		case 'b' -> System.out.println("b 입니다");
		case 'c' -> System.out.println("c 입니다");
		default -> System.out.println("a,b,c가 아니다");
		}

		String c = "a"; // 쌍따옴표는 문자열로 인식한다
		switch (c) {
		case "a" -> System.out.println("a 입니다");
		case "b" -> System.out.println("b 입니다");
		case "c" -> System.out.println("c 입니다");
		default -> System.out.println("a,b,c가 아니다");
		}
		
		
		String s = "철수";
		switch (s) {
		case "철수":
			System.out.println("철수입니다");
			break;
		case "영희":
			System.out.println("영희입니다");
			break;
		case "민수":
			System.out.println("민수입니다");
			break;
		default:
			System.out.println("모름");
			break;
		}
		
		
		char g = 'A';
	
		switch (g) {
		case 65 -> System.out.println("A 입니다");
		case 66 -> System.out.println("B 입니다");
		case 67 -> System.out.println("C 입니다");
		default -> System.out.println("A, B, C가 아니다");
		}
	
		
		char m = '\uac00';
		System.out.println(m);
		*/

		// 다이스 switch 문으로
		/*
		Scanner sc = new Scanner(System.in);

		System.out.print("주사위 굴리는 횟수 : ");
		int roll = sc.nextInt();
		System.out.println(); // 빈칸

		Random rd = new Random();
		int rdNum;

		int[] arr_dice = new int[roll];
		int[] arr_stats = new int[6];

		// 주사위 던지기
		for (int i = 0; i < roll; i++) {
			rdNum = rd.nextInt(6) + 1;
			arr_dice[i] = rdNum;
			
			switch(arr_dice[i]) {
			case 1: 
				arr_stats[0] = arr_stats[0] + 1;
				break;
			case 2: 
				arr_stats[1] = arr_stats[1] + 1;
				break;
			case 3: 
				arr_stats[2] = arr_stats[2] + 1;
				break;
			case 4: 
				arr_stats[3] = arr_stats[3] + 1;
				break;
			case 5: 
				arr_stats[4] = arr_stats[4] + 1;
				break;
			default: 
				arr_stats[5] = arr_stats[5] + 1;
				break;
			}
		}

		System.out.println("주사위 값 통계");

		for (int i = 0; i < arr_stats.length; i++) {
			System.out.println((i + 1) + "의 횟수 : " + arr_stats[i]);
		}
		*/
		
		
	}
}
