package store.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import store.com.DAO.CategoryDAO;
import store.com.Entity.Category;

@Controller
public class IndexController {
	@Autowired
	CategoryDAO categoryDAO;
	 
	@RequestMapping("/home")
	public String home(Model model) {
		List<Category> list = categoryDAO.findAll();
		model.addAttribute("cates", list);
		return "layout/index";
	}
	
	@RequestMapping("/product")
	public String list() {
		return "product/list";
	}
	
	@RequestMapping("/detail")
	public String detail() {
		return "product/detail";
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
