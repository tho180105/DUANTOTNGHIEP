package store.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import store.com.Service.SessionService;

@Controller
public class IndexController {
	
	@Autowired
	SessionService se;
	
	@RequestMapping("home")
	public String home() {
		return "home/home";
	}
	
	@RequestMapping("/product")
	public String list() {
		return "product/list";
	}
	
	@RequestMapping("/detail")
	public String detail() {
		return "product/detail";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart/view";
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
