package com.biz.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.rent.model.UserVO;
import com.biz.rent.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService uService;
	
	@RequestMapping(value="/m_list/{string}", method=RequestMethod.GET)
	public String search_user(@PathVariable("string") String m_string, Model model) {
		
		List<UserVO> uList = uService.getSearchList(m_string);
		
		model.addAttribute("USERS", uList);
		return "rent_body/user/user_m_list";
	}
}
