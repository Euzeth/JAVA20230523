package Ch29.Domain.common.Dto;

import java.util.Date;

public class LendDto {
	private int lendId;			//Auto_Increment
	private int bookcode;		
	private String id;			//userid
	private Date lendDate;		
	private Date returnDate;	//7일후 반납예정일 계산
	
	//디폴트생성자
	//인자받는생성자
	//toString
	//getter and setter
	
	public LendDto(){}

	public LendDto(int lendId, int bookcode, String id, Date lenDate, Date returnDate) {
		super();
		this.lendId = lendId;
		this.bookcode = bookcode;
		this.id = id;
		this.lendDate = lenDate;
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "LendDto [lendId=" + lendId + ", bookcode=" + bookcode + ", id=" + id
				+ ", lendDate=" + lendDate + ", returnDate=" + returnDate + "]";
	}

	public int getLendId() {
		return lendId;
	}

	public void setLendId(int lendId) {
		this.lendId = lendId;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getLenDate() {
		return lendDate;
	}

	public void setLenDate(Date lenDate) {
		this.lendDate = lenDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
	
}
