package ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		String choose;

		List<Book> list = new ArrayList<>();

		BookDao dao = new BookDao();

		while (true) {
			System.out.println("행동을 선택하시오");
			System.out.print("1:[조회] 2:[추가] 3:[수정] 4:[삭제] 0:[종료] >>");
			choose = sc.next();

			System.out.println(); // 빈 칸

			if (choose.equals("1")) {
				chooseSelect(list, dao);
			} else if (choose.equals("2")) {
				chooseInsert(dao);
			} else if(choose.equals("3")) {
				chooseUpdate(dao);
			} else if (choose.equals("4")) {
				chooseDelete(dao);
			} else if (choose.equals("0")) {
				System.out.println("현재 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 입력입니다.");
			}


			System.out.println(); // 빈 칸
		}
	}

	
	public void chooseSelect(List<Book> list, BookDao dao) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==책 정보 조회==");

		System.out.print("1:[전체조회] 2:[선택조회] >>");
		String selectChoose = sc.next();

		if (selectChoose.equals("1")) {
			
			list = dao.selectAll();

			if (list.size() == 0) {
				System.out.println("조회된 데이터가 없습니다..");
			} else {
				for (Book book : list) {
					System.out.println(book);
				}
			}
		} else if (selectChoose.equals("2")) {
			System.out.print("조회할 책 제목 입력 >>");
			String inputTitle = sc.next();

			list = dao.select(inputTitle);

			if (list.size() == 0) {
				System.out.println("조회된 데이터가 없습니다..");
			} else {
				for (Book book : list) {
					System.out.println(book);
				}
			}
		} else {
			System.out.println("올바르지 않은 입력입니다.");
		}
	}

	public void chooseInsert(BookDao dao) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==책 정보 삽입==");
		System.out.print("책 제목 입력 >>");
		String title = sc.next();
		System.out.print("책 저자 입력 >>");
		String author = sc.next();
		System.out.print("책 출판사 입력 >>");
		String publisher = sc.next();
		System.out.print("책 가격 입력 >>");
		int price = sc.nextInt();
		int bookId = Book.cnt++;

		Book book = new Book(bookId, title, author, publisher, price);

		int result = dao.insert(book);
		if (result == 0) {
			System.out.println("책 정보 입력에 실패했습니다.");
		} else {
			System.out.println("성공적으로 책 정보를 입력했습니다.");
		}
	}

	public void chooseDelete(BookDao dao) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==책 정보 삭제==");
		System.out.print("책 제목 입력 >>");
		String titleToDelete = sc.next();

		int result = dao.delete(titleToDelete);

		if (result == 0) {
			System.out.println("책 정보 삭제에 실패했습니다.");
		} else {
			System.out.println("성공적으로 책 정보를 삭제했습니다");
		}
	}

	public void chooseUpdate(BookDao dao) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==책 정보 수정==");
		
		System.out.print("수정할 책 id 입력 >>");
		int targetId = sc.nextInt();
		System.out.print("책 제목 입력 >>");
		String updateTitle = sc.next();
		System.out.print("책 저자 입력 >>");
		String updateAuthor = sc.next();
		System.out.print("책 출판사 입력 >>");
		String updatePublisher = sc.next();
		System.out.print("책 가격 입력 >>");
		int updatePrice = sc.nextInt();

		
		Book book = new Book(targetId, updateTitle, updateAuthor, updatePublisher, updatePrice);
		
		int result = dao.update(book);
		
		if(result == 0) {
			System.out.println("책 정보 수정에 실패했습니다.");
		} else {
			System.out.println("성공적으로 책 정보를 수정했습니다");
		}
	}
}
