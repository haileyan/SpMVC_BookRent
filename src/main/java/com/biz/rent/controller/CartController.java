package com.biz.rent.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.biz.rent.model.CartVO;
import com.biz.rent.model.RentVO;
import com.biz.rent.service.CartService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/rent")
public class CartController {

	@Autowired
	CartService cService;
	
	@RequestMapping(value="/cart", method=RequestMethod.POST)
	public String cart(@ModelAttribute("rentVO") RentVO rentVO, Model model, HttpSession httpSession) {
		
		try {
			List<CartVO> cart = (List)httpSession.getAttribute("CART");
			List<CartVO> returnCart = cService.addCart(cart, rentVO);
			
			if(returnCart != null) {
				
				// 현재 카트의 개수
				int intLen = returnCart.size();
				
				// 카트 리스트의 가장 마지막 항목의 cart_seq 칼럼에 그 값을 저장해 준다
				// List 순서가 바뀌어도 변하지 않는 고유값
				returnCart.get(intLen -1).setCart_user_seq(intLen);
				
				
				httpSession.setAttribute("CART", returnCart);
				
				for(CartVO vo : returnCart) {
					log.debug("Cart" + vo.toString());
				}
			}
			return "rent_body/rent/rent_cart";
			
			} catch (Exception e) {
				e.printStackTrace();
		}
			model.addAttribute("rentVO", rentVO);
			return null;
	}
	
	@RequestMapping(value="/cart_clear", method=RequestMethod.GET)
	public String cart_clear(Model model, HttpSession httpSession) {
		
		// 모든 Session 제거 -> 가급적 사용 자제
		// httpSession.invalidate();
		
		httpSession.setAttribute("CART", null); 	// 필요한 항목의 세션만 제거
		return "rent_body/rent/rent_cart";
	}
	
	// 순서 값을 가져와서 리스트 중 일부를 삭제하는 방법
	@RequestMapping(value="/cart_item_delete/{index}", method=RequestMethod.GET)
	public String cart_index_delete(@PathVariable("index") long index, HttpSession httpSession) {
		if(index > -1) {
			List<CartVO> cartList = (List)httpSession.getAttribute("CART");
			if( cartList != null) {
				cartList.remove(index);
				httpSession.setAttribute("CART", cartList);
			}
		}
		return "rent_body/rent/rent_cart";
	}

	// 고유값 (Sequence 칼럼의 값)을 참조해서 삭제
	@RequestMapping(value="/cart_seq_delete/{seq}", method=RequestMethod.GET)
	public String cart_seq_delete(@PathVariable("seq") long seq, HttpSession httpSession) {
	
		List<CartVO> cartList = (List)httpSession.getAttribute("CART");
		if( cartList != null) {
			int intLen = cartList.size();
			
			// 확장 for 구문 사용불가
			for(int i = 0; i< intLen; i++) {
				if( cartList.get(i).getCart_seq() == seq) {
					cartList.remove(i);
					break;
				}
			}
			httpSession.setAttribute("CART", cartList);
		}
		return "rent_body/rent/rent_cart";
	} 
	
}

