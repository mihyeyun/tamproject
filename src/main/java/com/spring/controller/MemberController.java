package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.Criteria;
import com.spring.domain.MemberVO;
import com.spring.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
/*
 * @RequestMapping(value="/member/*", method= {RequestMethod.GET,
 * RequestMethod.POST})
 */
@RequestMapping("/member/*")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("list")
	public String list(Model model) {
		List<MemberVO> m_list = service.getList();
		model.addAttribute("m_list", m_list);
		return "/member/list";
	}
		
	/*
	 Request method 'GET' not supported 오류 발생
	 처리 방법 :
	 postmapping을 주기 전에 getmapping으로 페이지 받아서 전달
	 - 매개변수 다를 경우 코드 주의	 
	 */
	
	/*@GetMapping("/register")
	public void register(MemberVO member) {
	}
	
	@PostMapping("/register")
	public String regsiter(MemberVO member, RedirectAttributes rttr) {
		log.info("register: " + member);
		service.regsiter(member);
		rttr.addFlashAttribute("result", member.getUserid());
		return "redirect:/member/list";
	}*/
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void register() {
		log.info("회원가입 페이지 진입");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(MemberVO member) {
		log.info("register 진입");
		//회원 가입 서비스 실행
		service.regsiter(member);
		log.info("register service 성공");
		return "redirect:/member/list";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void login() {
		log.info("로그인페이지 진입");
	}
	
	
	// Post방식

	/*
	 * 부적합한 열 유형 1111
	 */
	
	/*@GetMapping("/view")
	public String get(String userid, Model model) {
		service.get(userid);			
		MemberVO member = service.get(userid);
		model.addAttribute("member", member);	
		return "/member/view";
	}*/
	
	/*
	 *  mapping 오류 
	 */
	
	/*
	 * @GetMapping("/view") public void get(String userid) { }
	 */
	
	/*
	 *  부적합한 열 유형 1111
	 */
	
	/*
	  @GetMapping("/view") public String get(String userid, Model model) {
		  MemberVO member = service.get(userid);
		  model.addAttribute("member", member);
		  return "/member/view"; 
		  }
	*/
	 
	/* 오류 - Required String parameter 'userid' is not present */
	
	/*@GetMapping("/view")
	public void get(@RequestParam("userid") String userid, @ModelAttribute("cri") Criteria cri, Model model) {

		log.info("/view");
		model.addAttribute("member", service.get(userid));
	}*/
		
	
	/*@GetMapping("view")
	public void get(String userid, Model model) {

	log.info("/view");
	model.addAttribute("member", service.get(userid));
	}*/
	
	
	
	
	@GetMapping("/view") 
	public void view() { 
		log.info("view");
	}
	 
	@GetMapping("/modify") 
	public void modify() { 
		log.info("modify");
	}
	
	
	@PostMapping("/modify")
	public String modify(MemberVO member, RedirectAttributes rttr) {
		service.modify(member);
		return "redirect:/member/list";
	}
	
	@PostMapping("/remove")
	public String remove(MemberVO member, RedirectAttributes rttr) {
		service.remove(member);
		rttr.addFlashAttribute("result", member);	
		return "redirect:/member/list";
	}
}
