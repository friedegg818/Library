package library;

import java.util.List;

public interface Book {
	public void bput(BookVO bo); 
    public List<BookVO> listbook();
    public BookVO readBook(String title);
	
}
