package library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// 입력 스캐너
		Scanner sc = new Scanner(System.in);

		UserService us = new UserService();
		Menu mn = new Menu(us);
		UserVO loginUser = null;

		int ch;
		while (true) {

			try {
				System.out.println("\n[메인메뉴]");
				loginUser = us.loginUser();
				if (loginUser == null) {
					do {
						System.out.println("1.로그인 2.신규가입 및 개인정보 수정. 3.종료");
						ch = sc.nextInt();
					} while (ch < 1 || ch > 3);

					if (ch == 3)
						break;
					switch (ch) {
					case 1:
						us.login();
						break;
					case 2:
						mn.memberMenu();
						break;
					}
				} else if (loginUser.getId().equals("admin")) {
					mn.adminMenu();
				} else {
					mn.userMenu();
				}

			} catch (InputMismatchException E) {
				System.out.println("숫자만 입력 가능합니다.");
				sc.nextLine();
			} 
			
		}
		sc.close();				
	}
}
