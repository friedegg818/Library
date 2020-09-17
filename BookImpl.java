package library;

import java.util.List;
import java.util.ArrayList;

public class BookImpl implements Book {
	private List<BookVO> booklist = new ArrayList<>();

	public BookImpl() {
	
		booklist.add(new BookVO("0000", "ÀÎ¾î°øÁÖ", "µğÁî´Ï", "½Ö¿ë"));
		booklist.add(new BookVO("0001", "¹é¼³°øÁÖ", "µğÁî´Ï", "½Ö¿ë"));
		booklist.add(new BookVO("0002", "½Åµ¥·¼¶ó", "µğÁî´Ï", "¿ë½Ö"));
		booklist.add(new BookVO("0003", "¿¤»ç", "°Ü¿ï¿Õ±¹", "¿ë½Ö"));
		booklist.add(new BookVO("0004", "¶óÇ¬Á©", "µğÁî´Ï", "½Ö½Ö"));
	}

	@Override
	public void bput(BookVO bo) {
		booklist.add(bo);
	}

	@Override
	public List<BookVO> listbook() {

		return booklist;
	}

	@Override
	public BookVO readBook(String title) {
		for (BookVO bo : booklist) {
			if (bo.getTitle().equals(title)) {
				return bo;
			}
		}
		return null;
	}

}
