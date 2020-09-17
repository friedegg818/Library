package library;

public class RentalVO {
	private String code;
	private String id;
	private String rentDate;
	private String returnDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "BookRentalVO [code=" + code + ", id=" + id + ", rentDate=" + rentDate + ", returnDate=" + returnDate
				+ "]";
	}

	public RentalVO(String code, String id, String rentDate, String returnDate) {
		this.code = code;
		this.id = id;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public RentalVO() {
	}

}