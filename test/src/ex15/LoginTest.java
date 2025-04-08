package ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<>();  
		User currentUser = null;
		
		while (true) {
			System.out.print("행동을 고르세요(1:[사용자 정보 조회] 2:[로그인] 3:[회원가입] 4:[종료하기]) :");
			int select = sc.nextInt();

			if(currentUser == null) {
				if (select == 1) {
					findUser(users);
				} else if (select == 2) {
					login(users, currentUser);
				} else if (select == 3) {
					signUp(users);
				} else if (select == 4) {
					System.out.println("프로그램을 정지합니다.");
					break;
				}
			} else {
				loginPage(currentUser);
			}
			
		}
	}

	// 사용자의 이름을 통해서 사용자를 조회
	public static void findUser(ArrayList<User> users) {
		Scanner sc = new Scanner(System.in);
		String userName;
		boolean flag = false;
		
		System.out.print("조회할 사용자의 이름을 작성하세요 : ");
		userName = sc.next();
		
		if(users.size() < 1) { 
			System.out.println("현재 등록된 사용자가 없습니다..");	
		} else {
			for(User u : users) {
				if(u.getName().equals(userName)) {
					System.out.println("조회한 사용자 : " + u);
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("해당 이름의 사용자가 존재하지 않습니다..");
		}

		System.out.println();	// 빈칸
	}

	// 로그인 기능
	// 입력 데이터 : 이름, 비밀번호
	// 이름과 비밀번호를 같이 입력받는다
	// 하지만 둘중 하나라도 일치하지 않는다면 같은 에러 메세지를 출력한다 - 크래커 예방
	public static void login(ArrayList<User> users, User currentUser) {
		Scanner sc = new Scanner(System.in);
		String userName;
		String userPassword;
		boolean flag = false;
		
		System.out.print("이름 : ");
		userName = sc.next();

		System.out.print("비밀번호 : ");
		userPassword = sc.next();

		for(User u : users) {
			if(u.getName().equals(userName) && u.getPassword().equals(userPassword)) {
				currentUser = u;
				flag = true;
			} 
		}
				
		if(flag == false) {
			System.out.println("이름 또는 비밀번호가 일치하지 않습니다..");	
		}
		
		System.out.println();	// 빈칸
	}

	// 회원가입 기능
	// 입력 데이터 : 이름, 비밀번호
	// 이름은 중복되서는 안됨
	public static void signUp(ArrayList<User> users) {
		Scanner sc = new Scanner(System.in);
		String userName;
		String userPassword;
		boolean flag = false;

		while(true) {
			System.out.print("이름을 입력하십시오 : ");
			userName = sc.next();

			flag = false;
			
			for(User u : users) {
				if(u.getName().equals(userName)) {
					System.out.println("중복된 이름이 존재합니다.");		
					flag = true;
					continue;
				}
			}
			
			if(flag == false) {
				break;
			}
		}
		
		System.out.print("비밀번호를 입력하십시오 : ");
		userPassword = sc.next();

		User user = new User(userName, userPassword);
		users.add(user);
		
		System.out.println("회원가입 되었습니다!!");
		System.out.println();	// 빈칸
	}


	// 로그인 페이지
	// 현재 currentUser가 존재하면 이곳으로 이동한다
	// 로그아웃하면 나간다
	// 현재 기능 : 아무것도 안하기, 로그아웃, 
	public static void loginPage(User currentUser) {
		Scanner sc = new Scanner(System.in);
		System.out.println("환영합니다 " + currentUser.getName() + "님, 로그인 페이지입니다");
		
		while(true) {
			System.out.print("행동을 고르세요(1:[아무것도 안하기] 2:[로그아웃]) :");
			int select = sc.nextInt();
			
			if (select == 1) {
				findUser(users);
			} else if (select == 2) {
				
			} else {
				System.out.print("행동을 고르세요(1:[아무것도 안하기] 2:[로그아웃]) :");	
			}
		}
	}
	
}
