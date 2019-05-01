package com.biz.rent.model;

public class CartVO {

	private long cart_seq;
	private String cart_date;	
	private String cart_return_date;
	
	private long cart_book_seq;
	private String cart_book_title;
	
	private long cart_book_price;
	private long cart_user_seq;
	private String cart_user_name;
	
	private String cart_return_yn;

	public long getCart_seq() {
		return cart_seq;
	}

	public void setCart_seq(long cart_seq) {
		this.cart_seq = cart_seq;
	}

	public String getCart_date() {
		return cart_date;
	}

	public void setCart_date(String cart_date) {
		this.cart_date = cart_date;
	}

	public String getCart_return_date() {
		return cart_return_date;
	}

	public void setCart_return_date(String cart_return_date) {
		this.cart_return_date = cart_return_date;
	}

	public long getCart_book_seq() {
		return cart_book_seq;
	}

	public void setCart_book_seq(long cart_book_seq) {
		this.cart_book_seq = cart_book_seq;
	}

	public String getCart_book_title() {
		return cart_book_title;
	}

	public void setCart_book_title(String cart_book_title) {
		this.cart_book_title = cart_book_title;
	}

	public long getCart_book_price() {
		return cart_book_price;
	}

	public void setCart_book_price(long cart_book_price) {
		this.cart_book_price = cart_book_price;
	}

	public long getCart_user_seq() {
		return cart_user_seq;
	}

	public void setCart_user_seq(long cart_user_seq) {
		this.cart_user_seq = cart_user_seq;
	}

	public String getCart_user_name() {
		return cart_user_name;
	}

	public void setCart_user_name(String cart_user_name) {
		this.cart_user_name = cart_user_name;
	}

	public String getCart_return_yn() {
		return cart_return_yn;
	}

	public void setCart_return_yn(String cart_return_yn) {
		this.cart_return_yn = cart_return_yn;
	}

	@Override
	public String toString() {
		return "CartVO [cart_seq=" + cart_seq + ", cart_date=" + cart_date + ", cart_return_date=" + cart_return_date
				+ ", cart_book_seq=" + cart_book_seq + ", cart_book_title=" + cart_book_title + ", cart_book_price="
				+ cart_book_price + ", cart_user_seq=" + cart_user_seq + ", cart_user_name=" + cart_user_name
				+ ", cart_return_yn=" + cart_return_yn + "]";
	}

	public CartVO(long cart_seq, String cart_date, String cart_return_date, long cart_book_seq, String cart_book_title,
			long cart_book_price, long cart_user_seq, String cart_user_name, String cart_return_yn) {
		super();
		this.cart_seq = cart_seq;
		this.cart_date = cart_date;
		this.cart_return_date = cart_return_date;
		this.cart_book_seq = cart_book_seq;
		this.cart_book_title = cart_book_title;
		this.cart_book_price = cart_book_price;
		this.cart_user_seq = cart_user_seq;
		this.cart_user_name = cart_user_name;
		this.cart_return_yn = cart_return_yn;
	}

	public CartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
