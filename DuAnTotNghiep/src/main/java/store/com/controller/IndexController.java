package store.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("index1")
	public String index1() {
		return "layout/index";
	}
	
	@RequestMapping("home")
	public String home() {
		return "home/home";
	}
	
	@RequestMapping("/product")
	public String list() {
		return "product/list";
	}
}
