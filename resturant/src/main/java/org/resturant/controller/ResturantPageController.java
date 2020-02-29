package org.resturant.controller;

import javax.servlet.http.HttpServletRequest;

import org.resturant.model.UserTbl;
import org.resturant.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResturantPageController {
	
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;

	@GetMapping("/customer")
	public String customerLoginPage(Model model) {

		return "register";
	}

	@PostMapping("customerDashboard")
	public String customerDashBoard(Model model, HttpServletRequest request, UserTbl userTbl) {
		customerDetailsRepository.save(userTbl);
		return "customerdashboard";

	}
	
	@GetMapping("/AdminLogin")
	public String ResturantAdminLogin(Model model) {

		return "login";
	}
	
	@PostMapping("/AdminVerify")
	public String verifyAdminLogin(Model model,HttpServletRequest request) {
		
		String adminName=request.getParameter("AdminName");
		String adminPass =request.getParameter("AdminPass");
		
		if(adminName.equals("ADMIN") && adminPass.equals("admin"))
		{
			return"admindashboard";
		}
		else{
			model.addAttribute("Info", "Incorrect Credentials");
			return"login";
		}

	
	}
	
	@PostMapping("catagorary")
	public String resturantCatagorary(Model model) {

		return "Category :: main-section";
	}
	@PostMapping("SubCatagorary")
	public String resturantSubCatagorary(Model model) {

		return "SubCategory :: main-section";
	}
	@PostMapping("CreateItems")
	public String resturantCatagoraryItems(Model model) {

		return "Items :: main-section";
	}

}
