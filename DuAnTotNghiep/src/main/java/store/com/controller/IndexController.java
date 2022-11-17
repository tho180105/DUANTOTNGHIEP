package store.com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import store.com.DAO.CategoryDAO;
import store.com.Entity.Category;
import store.com.Service.CategoryService;



import store.com.Service.SessionService;

import store.com.DAO.CategoryDAO;
import store.com.Entity.Category;

@Controller
public class IndexController {
    SessionService se;
    
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/home")
	public String home1(Model model) {
		List<Category> list = categoryDAO.findAll(); 
		model.addAttribute("cates", list); 
		return "home/home";
	}

	@RequestMapping("/faq")
	public String faq() {
		return "home/faq";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "home/contact";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		return "blog/blog";
	}
	
	@RequestMapping("/blogdetail")
	public String blogdetail() {
		return "blog/blog-detail";
	}

	
}
