package com.biz.rent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

}
