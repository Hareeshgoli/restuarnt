package org.resturant.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "HomePage";
	}
	
	@PostMapping("/login")
	public String login(Model model,HttpServletRequest http) {
		String res;
		String Username=http.getParameter("username");
		if(Username.equals("admin")) {
			res="AdminPage";
		}
		else
			res="UserPage";
		model.addAttribute("Username", Username);
		return res;
	}
}
