package store.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import store.com.DAO.AdditionalImagesDAO;
import store.com.DAO.CategoryDAO;
import store.com.DAO.ProductDAO;
import store.com.Entity.AdditionalImages;
import store.com.Entity.Product;


@Controller
public class ProductController {
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	AdditionalImagesDAO imageDAO;
	
	@RequestMapping("/product/list")
	public String list(Model model, @RequestParam("cid") Optional<Integer> cid) {
		model.addAttribute("cates", categoryDAO.findAll());
		
		if(cid.isPresent()) {
			List<Product> list = productDAO.findByCategoryId(cid.get());
			model.addAttribute("products", list);
		}else {
			List<Product> list = productDAO.findAll();
			model.addAttribute("products", list);
		}
		return "product/list";
	}
	
	@RequestMapping("/product/detail/{productid}")
	public String detail(Model model, @PathVariable("productid") Integer productid) {
		model.addAttribute("cates", categoryDAO.findAll());	
		
		Product product = productDAO.findById(productid).get();
		model.addAttribute("item", product);
		
		List<AdditionalImages> listimage = imageDAO.findByImagePath(product.getProductid());
		model.addAttribute("listimage", listimage);
		
		return "product/detail";
	}
}
