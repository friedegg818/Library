package library;

import java.util.Scanner;

public class UserService {
	private Scanner sc = new Scanner(System.in);
	private UserVO loginUser = null;
	private User user = new UserImpl();
	
	public UserService() {
		
	}

	public UserVO loginUser() {
		return loginUser;
	}

	public void login() {
		System.out.println("◑0◑회원 로그인...\n");

		String id;
		String pwd;

		System.out.println("아이디를 입력하시오");
		id = sc.next();

		System.out.println("비밀번호를 입력하시오");
		pwd = sc.next();

		if (id.equals("admin") && pwd.equals("12345")) {
			UserVO us = new UserVO();
			us.setId("admin");
			us.setName("관리자");
			us.setPwd("12345");
			us.setTel("114");
			loginUser = us;
			return;
		}

		UserVO us = user.readUser(id);
		if (us != null && us.getPwd().equals(pwd)) {
			loginUser = us;
			return;
		}

		System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
	}

	public void logout() {
		loginUser = null;

		System.out.println("로그 아웃 되었습니다.\n");

	}

	public void makeid() {
		System.out.println("회원 가입");

		UserVO us = new UserVO();
		System.out.println("아이디를 입력하시오?");
		us.setId(sc.next());

		if (user.readUser(us.getId()) != null) {
			System.out.println("등록된 아이디 입니다.\n");
			return;
		}

		System.out.println("비밀번호를 입력하시오");
		us.setPwd(sc.next());

		System.out.println("이름을 입력하시오");
		us.setName(sc.next());

		System.out.println("전화번호를 입력하시오");
		us.setTel(sc.next());
		user.insertUser(us);

		System.out.println("회원 가입이 정상적으로 처리 되었습니다.\n");
	}

	public void deleteid() {
		String id;
		System.out.println("탈퇴할 회원아이디를 입력하시오");
		id = sc.next();
		UserVO us = user.readUser(id);
		if (us == null) {
			System.out.println("등록된 회원이 아닙니다.");
			return;
		}

		
	}

	public void updateid() {

		String id;
		System.out.println("아이디를 입력하시오");
		id = sc.next();
		UserVO us = user.readUser(id);

		if (us == null) {
			System.out.println("등록되지 않은 회원입니다\n");
			return;
		}
		String pwd;
		System.out.println("비밀번호를 입력하시오");
		pwd = sc.next();

		if (pwd == null) {
			System.out.println("비밀번호가 틀렸습니다.\n");
			return;
		}
		System.out.println("");

		System.out.println("변경할 성함을 입력하세요");
		us.setName(sc.next());
		System.out.println("변경할 전화번호를 입력하세요");
		us.setTel(sc.next());
		System.out.println("변경할 비밀번호를 입력하세요");
		us.setPwd(sc.next());
		System.out.println("회원 정보가 수정되었습니다\n");

	}

	public void print() {
		System.out.println("총 회원수 :" + user.listUser().size());
		System.out.println("아이디 \t 비밀번호 \t 전화번호");
		for (UserVO us : user.listUser()) {
			System.out.print(us.getId() + "\t");
			System.out.print(us.getName() + "\t");
			System.out.print(us.getTel() + "\n");
		}
	}
}
