package com.biz.rent.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.biz.rent.mapper.UserDao;
import com.biz.rent.model.BookVO;
import com.biz.rent.model.UserVO;
import com.biz.rent.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin")
@SessionAttributes({"userVO", "bookVO"})
public class AdminController {
	
	@Autowired
	UserDao uDao;
	
	@Autowired
	BookService bService;

	/*
	 * SessionAttributes Annotation should be placed in the 'bottom' of RequestMapping
	 * and also followed the method of init for using it.
	 */
	@ModelAttribute("userVO")
	public UserVO newUser() {	// 별도로 VO를 생성하지 않아도 이 메서드는 자동으로 작동된다
		UserVO vo = new UserVO();
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		vo.setUser_reg_date(df.format(lt));
		vo.setUser_out_yn("N");
		
		return vo;
	}
	
	@ModelAttribute("bookVO")
	public BookVO newBookVO() {
		BookVO vo = new BookVO();
		vo.setBook_rent_yn("Y");
		return vo;
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "admin_home";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String user(@ModelAttribute("userVO") UserVO userVO, Model model) {
		
		List<UserVO> uList = uDao.selectAll();
		model.addAttribute("userVO", userVO);
		model.addAttribute("LIST", uList);
		model.addAttribute("BODY", "USER_LIST");
		return "admin_home";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String user(@ModelAttribute("userVO") UserVO userVO, Model model, SessionStatus session) {
		
		log.debug("UserVO : " + userVO.toString());
		uDao.insert(userVO);

		// 페이지를 벗어나면 기존에 입력한 내용을 '초기화' 해주는 코드(!!필수조건!!) 
		session.setComplete();
		
		return "redirect:/admin/user";
	}

	@RequestMapping(value="/user/update", method=RequestMethod.GET)
	public String user_update(@ModelAttribute("userVO") UserVO userVO, Model model) {
		
		long user_seq = userVO.getUser_seq();
		List<UserVO> uList = uDao.selectAll();
		userVO = uDao.findById(user_seq);
		
		model.addAttribute("userVO", userVO);
		model.addAttribute("LIST", uList);
		model.addAttribute("BODY", "USER_LIST");
		return "admin_home";
	}
	
	@RequestMapping(value="/user/update", method=RequestMethod.POST)
	public String user_update(@ModelAttribute("userVO") UserVO userVO, Model model, SessionStatus session) {
		
		log.debug("UserVO : " + userVO.toString());
		uDao.update(userVO);

		// 페이지를 벗어나면 기존에 입력한 내용을 '초기화' 해주는 코드(!!필수조건!!) 
		session.setComplete();
		
		return "redirect:/admin/user";
	}
	
	@RequestMapping(value="/user/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("id") long id) {
		uDao.delete(id);
		return "redirect:/admin/user";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 도서정보를 호출하는 Method
	@RequestMapping(value="/book", method=RequestMethod.GET)
	public String book(@ModelAttribute("bookVO") BookVO bookVO, Model model) {
		
		List<BookVO> bList = bService.selectAll();
		model.addAttribute("bookVO", bookVO);
		model.addAttribute("LIST", bList);
		model.addAttribute("BODY", "BOOK_LIST");
		return "admin_home";
	}
	
	// 새로운 도서정보를 저장하고 다시 도서정보 리스트로 전환하는 Method
	@RequestMapping(value="/book", method=RequestMethod.POST, produces="text/html;charset=utf8")
	public String book(@ModelAttribute("bookVO") BookVO bookVO, Model model, SessionStatus session) {
		
		log.debug("BookVO : " + bookVO.toString());
		bService.insert(bookVO);
		
		session.setComplete();
		
		return "redirect:/admin/book";
	}
	
	@RequestMapping(value="/book/update", method=RequestMethod.GET)
	public String book_update(@ModelAttribute("bookVO") BookVO bookVO, Model model) {
		
		long book_seq = bookVO.getBook_seq();
		
		bookVO = bService.findById(book_seq);
		model.addAttribute("bookVO", bookVO);
		
		List<BookVO> bList = bService.selectAll();
		model.addAttribute("LIST", bList);
		
		model.addAttribute("BODY", "BOOK_LIST");
		
		return "admin_home";
	}
	
	@RequestMapping(value="/book/update", method=RequestMethod.POST)
	public String book_update(@ModelAttribute("bookVO") BookVO bookVO, Model model, SessionStatus session) {

		bService.update(bookVO);
		session.setComplete();
		return "redirect:/admin/book";
	}
	
	/*
	 * GET 방식을 사용해서 WEB으로부터 서버에 데이터를 보낼 때는 
	 * 		?변수 = 값 형식으로 보내고
	 * 		받을 때는 @RequestParam("변수") 변수명
	 * 
	 * PathVariable은 주소값에 변수를 실어 보내는 방식
	 * PathVariable("id")라고 지정을 하고 mapping value="..../delete/{id}라고 지정을 해 두면 
	 * web에서 보낼 때 ..../delete/3 이라고 설정을 하면
	 * 3이라는 값이 id 변수에 담겨서 서버에 전달이 된다.
	 * 이 경우, id가 null 값이 되면 오류 발생
	 * 
	 * PathVarialbe -> 단일변수만 받아 사용 가능함	 
	 */
	@RequestMapping(value="/book/delete/{id}", method=RequestMethod.GET)
	public String book_delete(@PathVariable("id") long id) {
		bService.delete(id);
		return "redirect:/admin/book";
	}
	
	// 어떠한 값도 전달되지 않으면 다른 페이지로 Redirect 
	@RequestMapping(value="/book/delete", method=RequestMethod.GET)
	public String book_delete( ) {
		return "redirect:/admin/book";
	}

}
