package com.biz.rent.model;

public class BookVO {

	private long book_seq; 				// number
	private String book_isbn; 			//	char(13)
	private String book_title;			//	nvarchar2(100)
	private String book_author;		 	//	nvarchar2(100)
	private long book_price;			//	number
	private String book_description; 	//	nvarchar2(1000)
	private String book_image;		 	//	nvarchar2(125)
	private String book_link;			//	nvarchar2(255)
	private String book_rent_yn;		//	char(1)
	
	public long getBook_seq() {
		return book_seq;
	}
	public void setBook_seq(long book_seq) {
		this.book_seq = book_seq;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public long getBook_price() {
		return book_price;
	}
	public void setBook_price(long book_price) {
		this.book_price = book_price;
	}
	public String getBook_description() {
		return book_description;
	}
	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}
	public String getBook_image() {
		return book_image;
	}
	public void setBook_image(String book_image) {
		this.book_image = book_image;
	}
	public String getBook_link() {
		return book_link;
	}
	public void setBook_link(String book_link) {
		this.book_link = book_link;
	}
	public String getBook_rent_yn() {
		return book_rent_yn;
	}
	public void setBook_rent_yn(String book_rent_yn) {
		this.book_rent_yn = book_rent_yn;
	}
	@Override
	public String toString() {
		return "BookVO [book_seq=" + book_seq + ", book_isbn=" + book_isbn + ", book_title=" + book_title
				+ ", book_author=" + book_author + ", book_price=" + book_price + ", book_description="
				+ book_description + ", book_image=" + book_image + ", book_link=" + book_link + ", book_rent_yn="
				+ book_rent_yn + "]";
	}
	public BookVO(long book_seq, String book_isbn, String book_title, String book_author, long book_price,
			String book_description, String book_image, String book_link, String book_rent_yn) {
		super();
		this.book_seq = book_seq;
		this.book_isbn = book_isbn;
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_price = book_price;
		this.book_description = book_description;
		this.book_image = book_image;
		this.book_link = book_link;
		this.book_rent_yn = book_rent_yn;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
 	
	
	
	
	
}
