package ex_management;

import java.util.List;
import java.util.Scanner;

public class MainTest {


	public static void main(String[] args) {
		// testSalery();
		testStock();
	}
	
	// 회원 관리 테스트
	public static void testSalery() {
		Scanner sc = new Scanner(System.in);
		SalerymenDAO dao = new SalerymenDAO();
		
		while(true) {
			System.out.println("회원 관리 테스트");
			System.out.print("1.로그인 \t 2.회원목록 \t 3.회원추가 \t 4.회원정보수정 \t 5.회원삭제 >>");
			String choose = sc.next();

			System.out.println();	// 여백
			
			if(choose.equals("1")) {
				// 로그인
				System.out.println("===회원 로그인===");
				System.out.print("코드를 입력하세요 >>");
				int code = sc.nextInt();
				
				Salerymen salery = dao.selectOne(code);
				
				if(salery != null) {
					System.out.println("사용자가 로그인되었습니다.");
					System.out.println(salery);
				} else {
					System.out.println("존재하지 않는 사용자입니다.");	
				}
				
			} else if(choose.equals("2")) {
				// 회원 목록
				System.out.println("===회원 목록 조회===");
				List<Salerymen> list = dao.selectAll();
				
				if(list.isEmpty()) {
					System.out.println("회원 목록이 비어있습니다");
				} else {
					for(Salerymen s : list) {
						System.out.println(s);
					}
				}
				
			} else if(choose.equals("3")) {
				// 회원 추가
				System.out.println("===회원 추가===");
				System.out.print("이름을 입력하세요 >>");
				String name = sc.next();
				System.out.print("연락처를 입력하세요 >>");
				String phone = sc.next();
				
				int result = dao.insert(name, phone);
				
				if(result == 0) {
					System.out.println("회원 추가가 실패하였습니다.");
				} else {
					System.out.println("회원 추가가 성공했습니다.");
				}
				
			} else if(choose.equals("4")) {
				// 회원 정보 수정
				System.out.println("===회원 정보 수정===");
				System.out.print("코드를 입력하세요 >>");
				int code = sc.nextInt();
				System.out.print("이름을 입력하세요 >>");
				String name = sc.next();
				System.out.print("연락처를 입력하세요 >>");
				String phone = sc.next();
				
				Salerymen salery = new Salerymen(code, name, phone);
				
				int result = dao.update(salery);
				
				if(result == 0) {
					System.out.println("회원 정보 수정이 실패하였습니다.");
				} else {
					System.out.println("회원 정보 수정이 성공했습니다.");
				}
				
			} else if(choose.equals("5")) {
				// 회원 삭제
				System.out.println("===회원 삭제===");
				System.out.print("코드를 입력하세요 >>");
				int code = sc.nextInt();
				
				int result = dao.delete(code);
				
				if(result == 0) {
					System.out.println("회원 삭제가 실패하였습니다.");
				} else {
					System.out.println("회원 삭제가 성공했습니다.");
				}
				
			} else if(choose.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println();	// 빈칸
			
		}
		
	}

	//재고 관리 테스트
	public static void testStock() {
		Scanner sc = new Scanner(System.in);
		StockDAO dao = new StockDAO();
		
		while(true) {
			System.out.println("재고 테스트");
			System.out.print("1.재고목록 2.특정재고조회 3.특정상품재고조회 4.재고물량추가 5.재고물량감소 6.재고추가 7.재고삭제 0.프로그램종료 >>");
			String choose = sc.next();

			System.out.println();	// 여백
			
			if(choose.equals("1")) {
				System.out.println("===재고 목록===");
				
				List<Stock> list = dao.selectAll();
				
				if(list.isEmpty()) {
					System.out.println("재고 목록이 비어있습니다");
				} else {
					for(Stock s : list) {
						System.out.println(s);
					}
				}
				
			} else if(choose.equals("2")) {
				System.out.println("===특정 재고 조회===");
				System.out.print("재고코드를 입력하세요 >>");
				int code = sc.nextInt();
				
				Stock stock = dao.selectByCode(code);
				
				if(stock == null) {
					System.out.println("존재하지 않는 재고입니다");
				} else {
					System.out.println(stock);
				}
				
			} else if(choose.equals("3")) {
				System.out.println("===재고 상품 조회===");
				System.out.print("상품 코드를 입력하세요 >>");
				int pCode = sc.nextInt();
				
				List<Stock> list = dao.selectByPCode(pCode);
				
				if(list.isEmpty()) {
					System.out.println("재고 목록에 존재하지 않는 상품입니다");
				} else {
					for(Stock s : list) {
						System.out.println(s);		
					}
				}
				
			} else if(choose.equals("4")) {
				// 재고 수량 추가
				System.out.println("===재고 수량 추가===");
				System.out.print("추가할 재고의 재고번호 : ");
				int code = sc.nextInt();
				System.out.print("추가할 재고의 수량 : ");
				int qty = sc.nextInt();
				
				int result = dao.updatePlus(code, qty);
				
				if(result == 0) {
					System.out.println("재고 수량 추가가 실패하였습니다.");
				} else {
					System.out.println("재고 수량 추가가 성공했습니다.");
				}
				
			} else if(choose.equals("5")) {
				// 재고 수량 감소
				System.out.println("===재고 수량 감소===");
				System.out.print("감소할 재고의 재고번호 : ");
				int code = sc.nextInt();
				System.out.print("감소할 재고의 수량 : ");
				int qty = sc.nextInt();
				
				int result = dao.updateMinus(code, qty);
				
				if(result == 0) {
					System.out.println("재고 수량 감소가 실패하였습니다.");
				} else {
					System.out.println("재고 수량 감소가 성공했습니다.");
				}
					
			} else if(choose.equals("6")) {
				// 재고 추가
				System.out.println("===재고 추가===");
				System.out.print("추가할 재고의 상품코드 : ");
				int pcode = sc.nextInt();
				System.out.print("추가할 재고의 수량 : ");
				int qty = sc.nextInt();
				
				int result = dao.insert(pcode, qty);
				
				if(result == 0) {
					System.out.println("재고 추가가 실패하였습니다.");
				} else {
					System.out.println("재고 추가가 성공했습니다.");
				}
				
			} else if(choose.equals("7")) {
				// 재고 삭제
				System.out.println("===재고 삭제===");
				System.out.print("삭제할 재고의 재고번호 : ");
				int code = sc.nextInt();
				
				int result = dao.delete(code);
				
				if(result == 0) {
					System.out.println("재고 삭제가 실패하였습니다.");
				} else {
					System.out.println("재고 삭제가 성공했습니다.");
				}
				
			} else if(choose.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println();	// 빈칸
			
		}
		
	}
}
/*

필요 구현 기능 정리

프로그램 작동 시나리오
	- 프로그램 시작
	- 회원가입, 로그인(코드)
	- 전체 메뉴 페이지 (회원, 구매/판매, 재고, 실적) (숫자 입력으로 선택)
	- 각 메뉴별 상세 기능 선택( 예시 : 회원 선택 -> 회원 [삭제,수정] 기능 중 선택)
	- 기능 선택 후 jdbc를 통한 db데이터 통신 작업 처리
	- 작업 처리 완료
	- 처음 전체 메뉴 화면으로 이동
	- 프로그램 종료(전체 메뉴 선택에서 0을 입력할 경우)

유의사항
	- 메뉴에서 회원 -> 회원삭제를 선택할 경우 프로그램의 처음 회원가입/로그인 화면으로 돌아가기
	
회원가입/로그인 화면
	1. 프로그램 시작시 로그인 화면 입장
	2. 사용자 이름과 전화번호를 통한 입력(추후 아이디, 비번으로 교체 가능성 있음) 
	3. 사용자의 이름을

프로그램 전체 메뉴 
	1. 회원
	2. 구매/판매
	

각 메뉴별 상세 기능




수정 사항
	재고 테이블의 
	s_code를 st_code로 변경
	s_qty를 st_qty로 변경


*/

