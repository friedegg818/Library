package library;

import java.util.Scanner;

public class BookService {
	private Scanner sc = new Scanner(System.in);
	private Book book = new BookImpl();;

	public BookService() {
	}

	public void search() {
		String title;
		boolean exist = false;
		System.out.println("검색 할 도서명을 입력하세요.");
		title = sc.next();

		for (BookVO bo : book.listbook()) {
			if (bo.getTitle().equals(title)) {
				System.out.print(bo.getCode() + "\t");
				System.out.print(bo.getTitle() + "\t");
				System.out.print(bo.getWriter() + "\t");
				System.out.print(bo.getCompany() + "\t");
				System.out.println();
				exist = true;
			}
		}

		if (exist == false) {
			System.out.println("검색하신 책이 존재하지 않습니다.");
		}

	}



	public void insertbook() {
		// 도서 등록
		String title;		
		System.out.println("등록하실 책 이름을 입력하세요");
		
	}

}
