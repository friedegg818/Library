package library;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	private UserService us;
	private BookService ub = new BookService();
	private RentalService rs = new RentalService();
	

	public Menu(UserService us) {
		this.us = us;
	}

	public int memberMenu() {
		int ch=0;
		do {
			System.out.println("1.회원가입 2.회원 정보수정 3.회원탈퇴");
			ch = sc.nextInt();
		} while (ch < 1 || ch > 3);

		switch (ch) {
		case 1:
			us.makeid();
			break;
		case 2:
			us.updateid();
			break;
		case 3:
			us.deleteid();
			break;
		}
		
		return ch;
	}

	public void adminMenu() {
		int ch;
		UserVO loginUser = us.loginUser();
		if (loginUser == null || !loginUser.getId().equals("admin"))
			return;
		System.out.println(loginUser.getName() + "님 반갑습니다.");
		do {
			System.out.print("1.도서등록 2.대여리스트 3.미반납리스트 4.회원 조회 5.로그아웃    => ");
			ch = sc.nextInt();
		} while (ch < 1 || ch > 5);


		switch (ch) {
		case 1:
			ub.insertbook();
			break;
		case 2:
			rs.bcheck();
			break;
		case 3:
			rs.nbcheck();
			break;
		case 4:
			us.print();
			break;
		case 5:
			us.logout();
			break;
		}
	}

	public void userMenu() {
		int ch;
		do {
			System.out.print("1.도서검색 2.도서대여 3.도서반납  4.로그아웃   => ");
			ch = sc.nextInt();
		} while (ch < 1 || ch > 4);


		switch (ch) {
		case 1:
			ub.search();
			break;
		case 2:
			rs.brent();
			break;
		case 3:
			rs.breturn();
			break;
		case 4:
			us.logout();
			break;
		}

	}

}
