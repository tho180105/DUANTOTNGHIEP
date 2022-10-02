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
	
	@Autowired
	CategoryDAO categoryDAO;
	 
	@RequestMapping("/home")
	public String home1(Model model) {
		List<Category> list = categoryDAO.findAll(); 
		model.addAttribute("cates", list); 
	}
	SessionService se;
	
	
	
	
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
	@Autowired
	CategoryDAO categoryDAO;
	CategoryService categoryService;
	
	@RequestMapping("/category")
	@ResponseBody
	public List<Category> category(Model model) {
		Category category = new Category();
		model.addAttribute("form", category);
		List<Category> map = categoryDAO.findAll();
		model.addAttribute("items", map);
		return map;
	}
	
	@RequestMapping("/category/edit/{key}")
	@ResponseBody
	public Category edit(Model model, @PathVariable("key") Integer key) {
		model.addAttribute("key", key);
		Category category = categoryDAO.findById(key).get();
		model.addAttribute("form", category);
		List<Category> map = categoryDAO.findAll();
		model.addAttribute("items", map);
		return category;
	}
	
	@RequestMapping("/category/create")
	public String create(Category student) {
		categoryService.create(student);
		return "redirect:thi/index";
	}
	
	@RequestMapping("/category/update/{key}")
	public String update(@PathVariable("key") String key, Category student) {
		categoryDAO.save(student);
		return "redirect:thi/edit/" + key;
	}
	
	@RequestMapping("/category/delete/{key}")
	public String delete(@PathVariable("key") String key) {
		categoryService.delete(key);
		return "redirect:thi/index";
	}
}
