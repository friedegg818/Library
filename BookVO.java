package library;

public class BookVO {
	private String code;
	private String title;
	private String writer;
	private String company;

	public BookVO() {

	}

	public BookVO(String code, String title, String writer, String company) {
		this.code = code;
		this.title = title;
		this.writer = writer;
		this.company = company;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
