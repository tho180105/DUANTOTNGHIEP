package store.com.RestController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.AccountDAO;
import store.com.DAO.DetailCartDAO;
import store.com.DAO.ProductRepositoryDAO;
import store.com.Entity.DetailCart;

@RestController
@RequestMapping("/rest/cart")
public class CartRestController {
	@Autowired
	DetailCartDAO dao;
	@Autowired
	AccountDAO adao;
	@Autowired
	ProductRepositoryDAO pdao;
	@GetMapping
	public List<DetailCart> getDetailCart() {
		return dao.DetailCartByAccountId("1");
	}
//	public List<DetailCart> getDetailCart(Authentication auth) {
//		return dao.DetailCartByAccountId(auth.getName());
//	}
	@PutMapping
	public DetailCart updateDetailCart(@RequestBody DetailCart detailCart) {
		return dao.save(detailCart);
	}
	
	@PostMapping("/{id}")
	public DetailCart createDetailCart(@PathVariable("id") int productRepository,Authentication auth) {
		DetailCart detailCart=new DetailCart( 1,pdao.findById(productRepository).get() , adao.findById("1").get());
		return dao.save(detailCart);
	}
	@PostMapping("/productSelected")
	public List<DetailCart> postProductSelected(@RequestBody List<DetailCart> detailCarts,HttpSession se) {
		se.setAttribute("detailCarts", detailCarts);
		return detailCarts;
	}
	@GetMapping("/productSelected")
	public List<DetailCart> getProductSelected(HttpSession se) {
		List<DetailCart> detailCarts=(List<DetailCart>) se.getAttribute("detailCarts");
		return detailCarts;
	}
	@DeleteMapping("/{id}")
	public void deleteDetailCart(@PathVariable("id") int detailCartId) {
		 dao.delete(dao.findById(detailCartId).get());
	}
}
