package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/abc")
	public String abc(Model model) {
		model.addAttribute("name","aaaa");
		return "abc";
	}
}
