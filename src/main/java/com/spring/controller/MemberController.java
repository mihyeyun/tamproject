package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardVO;
import com.spring.domain.MemberVO;
import com.spring.service.BoardService;
import com.spring.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
@Log4j
public class MemberController {
	
	@Autowired
	private final MemberService service;
	
	@GetMapping("list")
	public String list(Model model) {
		List<MemberVO> list = service.getList();
		model.addAttribute("list", list);
		return "/member/list";
	}
		
	
	@PostMapping("/register")
	public String regsiter(MemberVO member, RedirectAttributes rttr) {
		service.regsiter(member);
		rttr.addFlashAttribute("result", member);
		return "redirect:/member/list";
	}
	
	@GetMapping("/view")
	public String get(String userid, Model model) {
		service.get(userid);			
		MemberVO member = service.get(userid);
		model.addAttribute("member", member);	
		return "/member/view";
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
