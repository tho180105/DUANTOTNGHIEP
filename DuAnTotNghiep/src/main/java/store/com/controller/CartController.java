package store.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CartController {
	@RequestMapping("/cart")
	public String cart() {
		return "cart/view";
	}
	@RequestMapping("/cart/order")
	public String cart1() {
		return "cart/order";
	}
	@RequestMapping("/cart/order/{id}")
	public String cartDone(@PathVariable("id") String id,Model model,HttpSession se) {
		model.addAttribute("orderid",id); 
		se.removeAttribute("detailCartWaiting");
		return "cart/paydone";
	}
}
