package test;

import java.util.Scanner;

public class Test_vanding_machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 정리
		int role = 0;	// 역할(0:사용자, 1:관리자)
		
		// String[] arr_vanding_machine_drink_name = {"콜라", "사이다", "매실음료", "탄산수", "제로음료", "아이스티"};
		// int[] arr_vanding_machine_drink_quan = new int[6];
		
		//int[][] arr_vanding_machine = new int[6][2];

		// 콜라	사이다	매실음료	탄산수	제로음료	아이스티;
		//	=========================================
		// 1	2		2		3		4		1
		// 1000	1400	1600	1200	1200	1500	
		int[][] arr_vanding_machine = {
				{2, 1500},
				{2, 900},
				{2, 1300},
				{2, 1200},
				{2, 1500},
				{2, 2000}
		};
		int[][] arr_user = new int[6][2];	// 사용자가 가지고 있는 음료와 음료의 갯수
		int user_money = 0;					// 사용자의 현재 잔액
		int revenue = 0;		// 자판기 수익 
		
		// 관리자와 사용자 분리
		while(true) {
			// 역할을 고른다
			role = selectRole();
			System.out.println();	// 빈칸
			
			if(role == 1) {
				userFunc(arr_vanding_machine, revenue);
			} else if(role == 2) {
				managerFunc(arr_vanding_machine, revenue);
			} else {
				System.out.println("현재 입력값이 올바르지 않습니다. 다시 입력하여 주십시오");
			}
		}
		
		// 각 역할에 맞는 기능 구현
		// 사용자 기능
		// 1. 현재 잔액 확인 (예시 10,000원)										1-*. 현재 잔액 확인(100, 500, 1000, 5000, 10000)
		// 2. 현재 음료 정보와 남은 갯수 출력
		// 3. 음료 선택(1~6 입력)												3-* 다양한 음료와 여러개를 구입하는 기능
		// 3-0. 만약 현재 자판기에 남은 음료가 없을 시에 알아서 나가게 만듦
		// 3-1. 선택한 음료의 남은 갯수 확인하여 연산 -> 없으면 돌려보냄
		// 3-2. 현재 사용자의 잔액이 음료의 가격보다 높은지 확인
		// 4. 3번의 조건을 돌파한다면 선택한 음료를 반환
		// 5. 사용자의 arr_user 배열에 해당 음료와 해당 음료의 갯수를 가짐
		// 6. 사용자의 현재 잔액을 충전하는 기능
		// ***** 메인으로 선택하게 만듦(3번, 6번)
		// 1번은 위의 메인 콘솔창이 나올때마다 같이 ㅜㄹ력되게 함
		// 2번은 음료 선택을 할때마다 출력함
		
		
		
		
		// 관리자 기능
		
	}
	
	
	//========================================================
	/**
	 * 관리자 기능
	 */
	static void managerFunc(int[][] arr_vanding_machine, int revenue) {
		// 현재 관리자 기능 정리
		// 1. 음료 재고 채우기 기능
		// 2. 음료의 가격 수정
		// 3. 현재 상품 재고 상태 출력
		
		int select = 0;
		while(true) {
			
			// 관리자가 기능을 선택
			select = managerSelectContent();
			System.out.println();	// 빈칸
			
			// 핵십 로직
			if(select == 1) {
				// 물품 보충
				replenishDrink(arr_vanding_machine);
			} else if(select == 2) {
				// 물품 가격 수정
				modifyDrinkPrice(arr_vanding_machine);
			} else if(select == 3) {
				// 물품 출력
				showCurrentDrink(arr_vanding_machine);		
			} else if(select == 4) {
				// 자판기 수익 확인
				showRevenue(revenue);
			} else if(select == 0) {
				// 관리자 모드 종료
				System.out.println("현재 관리자 모드를 종료합니다");
				break;
			} else {
				// 예외 처리
				System.out.println("현재 입력값이 올바르지 않습니다. 다시 입력하여 주십시오");
			}
			System.out.println();	// 빈칸
		}
		
	}
	
	/**
	 * 자판기 수익 출력
	 */
	static void showRevenue(int revenue) {
		System.out.println("현재 자판기의 수익은 " + revenue + "원 입니다");
	}
	
	/**
	 * 상품 가격 변경
	 */
	static void modifyDrinkPrice(int[][] arr_vanding_machine) {
		// 가격을 변경하고자 하는 물품을 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보충할 물품을 선택하세요(콜라:[0] 사이다:[1] 매실음료:[2] 탄산수:[3] 제로음료:[4] 아이스티:[5]) : ");
		int select_drink = sc.nextInt();
		
		// 수정하고자 하는 값으로 변경 && 예외 처리
		if(select_drink<0 && select_drink>5) {
			System.out.println("상품의 입력값이 올바르지 않습니다...");	
		} else {
			System.out.print("해당 상품의 수정할 값을 입력하세요 : ");	
			int drink_price = sc.nextInt();
			
			if(drink_price < 0) {
				System.out.println("입력한 물품의 가격이 올바르지 않습니다...");		
			} else {
				arr_vanding_machine[select_drink][1] = drink_price;
				System.out.println("가격을 성공적으로 수정했습니다");			
			}
		}
	}
	
	/**
	 * 물품 보충하기
	 */
	static void replenishDrink(int[][] arr_vanding_machine) {
		//보충하고자 하는 물품을 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보충할 물품을 선택하세요(콜라:[0] 사이다:[1] 매실음료:[2] 탄산수:[3] 제로음료:[4] 아이스티:[5]) : ");
		int select_drink = sc.nextInt();
		
		if(select_drink<0 && select_drink>5) {
			System.out.println("상품의 입력값이 올바르지 않습니다...");	
		} else {
			System.out.print("해당 물품 추가할 갯수를 입력하세요 : ");	
			int drink_quan = sc.nextInt();
			
			if(drink_quan < 0) {
				System.out.println("물품 갯수가 올바르지 않습니다...");		
			} else {
				arr_vanding_machine[select_drink][0] = arr_vanding_machine[select_drink][0] + drink_quan;
				System.out.println("재고를 성공적으로 추가했습니다");			
			}
		}
	}
	
	
	/**
	 * 관리자 기능을 선택
	 */
	static int managerSelectContent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 사용할 기능을 선택하십시오(1:[물품채우기] 2:[가격수정] 3:[물품상태보기] 4:[자판기수익] 0:[관리자모드종료]) : ");
		int num = sc.nextInt();
		return num;	
	}
	
	//========================================================
	/**
	 * 사용자 기능
	 */
	static void userFunc(int[][] arr_vanding_machine, int revenue) {
		//int[] arr_user = new int[6];	// 사용자가 가지고 있는 음료와 음료의 갯수
		int user_money = 0;					// 사용자 잔액
		int select;	// 사용자의 산택
		
		while(true) {
			// 현재 사용자 잔액 출력
			showUserMoney(user_money);
			
			// 사용자가 기능을 선택
			select = userSelectContent();
			System.out.println();	// 빈칸
			
			// 선택한 선택지 기능
			if(select == 1) {
				// 음료 구입하기
				user_money = user_money - userBuyDrink(user_money, arr_vanding_machine);
			} else if(select == 2) {
				// 사용자의 잔액 충전
				user_money = user_money + userRechargeMoney();
			} else if(select == 3) {
				showCurrentDrink(arr_vanding_machine);
			} else if(select == 0) {
				// 사용자 모드 종료
				System.out.println("현재 사용자 모드를 종료합니다");
				break;
			} else {
				// 예외 처리
				System.out.println("현재 입력값이 올바르지 않습니다. 다시 입력하여 주십시오");	
			}
			System.out.println();	// 빈칸
		}
	}	

	/**
	 * 자판기에서 음료 구매
	 */
	static int userBuyDrink(int money, int[][] arr_vanding_machine) {
		// 음료 현황 출력
		// showCurrentDrink(arr_vanding_machine);
		// System.out.println();
		
		// 음료 선택 및 현재
		Scanner sc = new Scanner(System.in);
		System.out.print("음료를 선택하세요(콜라:[0] 사이다:[1] 매실음료:[2] 탄산수:[3] 제로음료:[4] 아이스티:[5]) : ");
		int select = sc.nextInt();		// 선택 항목
		
		// 입력값이 올바른지 판별
		if((select < 0) || (select > 5)) {
			System.out.println("해당 음료는 존재하지 않습니다...");
			return 0;
		}
		
		// 핵심 로직
		if(arr_vanding_machine[select][0] == 0) {
			// 현재 선택한 음료의 남은 횟수가 0이 아닌지 확인
			System.out.println("현재 해당 음료가 재고가 없습니다...");
			return 0;
		} else if(arr_vanding_machine[select][1] > money) {
			// 현재 사용자의 잔액이 음료보다 높은지 확인
			System.out.println("현재 잔액이 부족합니다...");
			return 0;
		} else {
			// 음료 구입 -> 금액 차감
			// 사용자 음료 배열 수정
			//arr_user[select] = arr_user[select] + 1;
			//money = money - arr_vanding_machine[select][1];
			
			// 재고에서 1개 빼기
			arr_vanding_machine[select][0] = arr_vanding_machine[select][0] - 1;
			
			// 현재 음료 가격 출력
			return arr_vanding_machine[select][1];
		}
	}

	
	/**
	 * 사용자의 잔액을 충전
	 */
	static int userRechargeMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("충전할 잔액을 입력하세요 : ");
		int moreMoney = sc.nextInt();
		
		if(moreMoney < 0) {
			System.out.println("올바른 잔액 입력값이 아닙니다...");
			return 0;
		} else {
			System.out.println(moreMoney + "원을 충전하였습니다.");
			return moreMoney;		
		}	
	}

	/**
	 * 현재 사용자 잔액 출력
	 */
	static void showUserMoney(int money) {
		System.out.println("현재 사용자의 잔액은 " + money + "원 입니다.");
	}
	
	/**
	 * 사용자 기능을 선택
	 */
	static int userSelectContent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 사용할 기능을 선택하십시오(1:[음료선택] 2:[잔액충전] 3:[자판기재고확인] 0:[사용자모드종료]) : ");
		int num = sc.nextInt();
		return num;	
	}
	
	
	//======================================
	// 공통 기능
	
	static int selectRole() {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 사용자의 역할을 고르시오(1:[사용자] 2:[관리자]) : ");
		int role = sc.nextInt();
		return role;
	}
	

	/**
	 * 현재 자판기 현황을 출력
	 */
	static void showCurrentDrink(int[][] arr_vanding_machine) {
		System.out.println("현재 자판기 음료 현황");
		System.out.println("콜라\t사이다\t매실음료\t탄산수\t제로음료\t아이스티");
		for(int i=0; i<2; i++) {
			for(int j=0; j<arr_vanding_machine.length; j++) {
				System.out.print(arr_vanding_machine[j][i] + "\t");	
			}
			System.out.println();
		}
	}
	
	
}
/*
자판기 기능 정리
	사용자
		돈을 넣는다		// Scanner 사용한 입력
		잔돈 계산			// 연산으로 잔돈 계산
		상품을 선택한다 	// Scanner 사용한 입력 
		상품을 가져간다		// 
		잔돈을 가져간다
	공급자
		잔돈을 채워넣는다
		상품을 넣는다
*/