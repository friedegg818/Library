package library;

import java.util.List;


public interface Rental {
	public void insertRental(RentalVO vo);    
	public List<RentalVO> listAllRental();   // 대여 전체 목록 (반납+미반납 모두/ 책제목 + 빌려간사람 + 빌려간날짜)
	public List<RentalVO> listRental();		 // 반납 안된 것 
	public List<RentalVO> listUserRental(String id);   // id 검색을 통해 그 사람이 빌려간 책 목록 (대여중)
	public RentalVO readRental(String id);
}
