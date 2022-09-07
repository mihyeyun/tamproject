package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardVO;
import com.spring.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy.annotation.GetCreator;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Autowired
	private final BoardService service;
	
	@GetMapping("list")
	public String list(Model model) {
		List<BoardVO> list = service.getList();
		model.addAttribute("list", list);
		return "/board/boardList";
	}
		
	
	@PostMapping("/register")
	public String regsiter(BoardVO board, RedirectAttributes rttr) {
		service.regsiter(board);
		rttr.addFlashAttribute("result", board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/view")
	public String get(int bno, Model model) {
		service.get(bno);			
		BoardVO board = service.get(bno);
		model.addAttribute("board", board);	
		return "/board/view";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		service.modify(board);
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(BoardVO board, RedirectAttributes rttr) {
		service.remove(board);
		rttr.addFlashAttribute("result", board);	
		return "redirect:/board/list";
	}
}
