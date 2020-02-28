package org.resturant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@GetMapping("/catagorie")
	public String Catagorie(Model model) {
		return "Catagorie";
	}

	@GetMapping("/addCatagorie")
	public String AddCatagorie(Model model){
		return "xxxxx";
	}
}
