package com.biz.rent.model;

public class UserVO {

	private long user_seq; 
	private String user_name;
	private String user_birth;
	private String user_sex;
	private String user_phone;
	private String user_email;
	private String user_image;
	private String user_reg_date;
	private String user_out_date;
	private String user_out_yn;
	private long user_rent_count;
	private long user_rent_total;
	
	public long getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(long user_seq) {
		this.user_seq = user_seq;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	public String getUser_reg_date() {
		return user_reg_date;
	}
	public void setUser_reg_date(String user_reg_date) {
		this.user_reg_date = user_reg_date;
	}
	public String getUser_out_date() {
		return user_out_date;
	}
	public void setUser_out_date(String user_out_date) {
		this.user_out_date = user_out_date;
	}
	public String getUser_out_yn() {
		return user_out_yn;
	}
	public void setUser_out_yn(String user_out_yn) {
		this.user_out_yn = user_out_yn;
	}
	public long getUser_rent_count() {
		return user_rent_count;
	}
	public void setUser_rent_count(long user_rent_count) {
		this.user_rent_count = user_rent_count;
	}
	public long getUser_rent_total() {
		return user_rent_total;
	}
	public void setUser_rent_total(long user_rent_total) {
		this.user_rent_total = user_rent_total;
	}
	@Override
	public String toString() {
		return "UserVO [user_seq=" + user_seq + ", user_name=" + user_name + ", user_birth=" + user_birth
				+ ", user_sex=" + user_sex + ", user_phone=" + user_phone + ", user_email=" + user_email
				+ ", user_image=" + user_image + ", user_reg_date=" + user_reg_date + ", user_out_date=" + user_out_date
				+ ", user_out_yn=" + user_out_yn + ", user_rent_count=" + user_rent_count + ", user_rent_total="
				+ user_rent_total + "]";
	}
	public UserVO(long user_seq, String user_name, String user_birth, String user_sex, String user_phone,
			String user_email, String user_image, String user_reg_date, String user_out_date, String user_out_yn,
			long user_rent_count, long user_rent_total) {
		super();
		this.user_seq = user_seq;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.user_sex = user_sex;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_image = user_image;
		this.user_reg_date = user_reg_date;
		this.user_out_date = user_out_date;
		this.user_out_yn = user_out_yn;
		this.user_rent_count = user_rent_count;
		this.user_rent_total = user_rent_total;
	}
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
