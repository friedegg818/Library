package library;

import java.util.ArrayList;
import java.util.List;

public class RentalImpl implements Rental {
	private List<RentalVO> listAllRental = new ArrayList<>();   // 대여 전체 목록 (반납+미반납 모두/ 책제목 + 빌려간사람 + 빌려간날짜)
	private List<RentalVO> listRental = new ArrayList<>(); 		 // 반납 안된 것 
	private List<RentalVO> listUserRental = new ArrayList<>();

	@Override
	public void insertRental(RentalVO vo) {
		System.out.println("대여 책 입력...");
		
	}

	@Override
	public List<RentalVO> listAllRental() {
		System.out.println("대여 전체 목록...");
		return null;
	}

	@Override
	public List<RentalVO> listRental() {
		System.out.println("반납 안된 것...");
		return null;
	}

	@Override
	public List<RentalVO> listUserRental(String id) {
		System.out.println("id가 빌린 책...");
		return null;
	}

	@Override
	public RentalVO readRental(String id) {
		System.out.println("id 일치...");
		return null;
	}

}
