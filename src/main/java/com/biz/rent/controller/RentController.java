package com.biz.rent.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.rent.model.CartVO;
import com.biz.rent.service.RentService;

@Controller
public class RentController {

	@Autowired
	RentService rService;
	
	@ResponseBody
	@RequestMapping(value="check_out", method=RequestMethod.GET, produces="text/html;charset=utf8")
	public String check_out(HttpSession httpSession) {
		
		List<CartVO> cartList = (List)httpSession.getAttribute("CART");
		if( cartList == null) {
			return "Your cart is empty";
		}
		
		int ret = rService.cart_insert(cartList);
		
		httpSession.removeAttribute("CART");	//	세션 삭제
		// httpSession.setAttribute("CART", null);  값만 삭제
		
		return "Check_out";
	}
}













