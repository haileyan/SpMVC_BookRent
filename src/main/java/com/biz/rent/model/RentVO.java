package com.biz.rent.model;

public class RentVO {

	private long rent_seq;	
	private String rent_date;	
	private String rent_return_date;
	private long rent_book_seq;
	private long rent_book_price;
	private long rent_user_seq;
	private String rent_return_yn;
	
	public long getRent_seq() {
		return rent_seq;
	}
	public void setRent_seq(long rent_seq) {
		this.rent_seq = rent_seq;
	}
	public String getRent_date() {
		return rent_date;
	}
	public void setRent_date(String rent_date) {
		this.rent_date = rent_date;
	}
	public String getRent_return_date() {
		return rent_return_date;
	}
	public void setRent_return_date(String rent_return_date) {
		this.rent_return_date = rent_return_date;
	}
	public long getRent_book_seq() {
		return rent_book_seq;
	}
	public void setRent_book_seq(long rent_book_seq) {
		this.rent_book_seq = rent_book_seq;
	}
	public long getRent_book_price() {
		return rent_book_price;
	}
	public void setRent_book_price(long rent_book_price) {
		this.rent_book_price = rent_book_price;
	}
	public long getRent_user_seq() {
		return rent_user_seq;
	}
	public void setRent_user_seq(long rent_user_seq) {
		this.rent_user_seq = rent_user_seq;
	}
	public String getRent_return_yn() {
		return rent_return_yn;
	}
	public void setRent_return_yn(String rent_return_yn) {
		this.rent_return_yn = rent_return_yn;
	}
	@Override
	public String toString() {
		return "RentVO [rent_seq=" + rent_seq + ", rent_date=" + rent_date + ", rent_return_date=" + rent_return_date
				+ ", rent_book_seq=" + rent_book_seq + ", rent_book_price=" + rent_book_price + ", rent_user_seq="
				+ rent_user_seq + ", rent_return_yn=" + rent_return_yn + "]";
	}
	public RentVO(long rent_seq, String rent_date, String rent_return_date, long rent_book_seq, long rent_book_price,
			long rent_user_seq, String rent_return_yn) {
		super();
		this.rent_seq = rent_seq;
		this.rent_date = rent_date;
		this.rent_return_date = rent_return_date;
		this.rent_book_seq = rent_book_seq;
		this.rent_book_price = rent_book_price;
		this.rent_user_seq = rent_user_seq;
		this.rent_return_yn = rent_return_yn;
	}
	public RentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
