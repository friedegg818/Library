package library;

import java.util.List;
import java.util.Scanner;

public class RentalService {
	private Scanner sc = new Scanner(System.in);
	Rental rt = new RentalImpl();
	List<RentalVO> rentalList = null;


	public RentalService() {
	
	}

	public void brent() {
		System.out.println("도서 대여...");

	}

	public void breturn() {
		System.out.println("도서 반납...");
	}
	
	public void bcheck() { // 대여리스트
		System.out.println("대여 리스트...");
		}
	

	public void nbcheck() {
		System.out.println("미반납 리스트...");

	   
	}
}
