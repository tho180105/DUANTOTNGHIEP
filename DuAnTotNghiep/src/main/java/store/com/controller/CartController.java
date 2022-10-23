package store.com.controller;

import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/cart/{id}")
    public String cart(Model model, @PathVariable("id") Integer productid, HttpServletRequest request) {
	    System.out.println(productid);
	    System.out.println(request.getRequestURI());
        return "cart/view";
    }
}
