package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("title","Home-smart contact manager");
		return "home";
	}
	
	@RequestMapping(value = "/about")
	public String about(Model model) {
		model.addAttribute("title","About-smart contact manager");
		return "about";
	}

}
