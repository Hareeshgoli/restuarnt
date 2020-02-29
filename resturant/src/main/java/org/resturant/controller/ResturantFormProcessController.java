package org.resturant.controller;

import javax.servlet.http.HttpServletRequest;

import org.resturant.model.CatagoriesTbl;
import org.resturant.repository.CategoryRepository;
import org.resturant.service.IdgenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResturantFormProcessController {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	IdgenerationService idgenerationService;
	

	
	@PostMapping("/createCategory")
	public String ResturantAdminLogin(Model model,HttpServletRequest request) {
		String CategoryName=request.getParameter("CategoryName").toUpperCase();
	try{
		CatagoriesTbl CatResult = categoryRepository.findCategoryDescription(CategoryName);
		CatagoriesTbl cat=new CatagoriesTbl();
		if(CatResult!=null && CatResult.getCatDescription()!=null && CatResult.getCatDescription().equals(CategoryName))
		{
			model.addAttribute("Info", "Entered Category Exists");
		
		}
		else
		{
			String catId = idgenerationService.idGenerator('c');
			System.out.println(catId+"dfhd");
			cat.setCatagoraryId(catId);
			cat.setCatDescription(CategoryName);
			categoryRepository.save(cat);
			model.addAttribute("Info", "Saved Successfully");
	
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		return "Category";
	}
}
