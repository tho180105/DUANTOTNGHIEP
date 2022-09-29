package store.com.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PutMapping
	public DetailCart updateDetailCart(@RequestBody DetailCart detailCart) {
		return dao.save(detailCart);
	}
	
	@PostMapping("/{id}")
	public DetailCart createDetailCart(@PathVariable("id") int productRepository) {
		DetailCart detailCart=new DetailCart( 1,pdao.findById(productRepository).get() , adao.findById("1").get());
		return dao.save(detailCart);
	}
	@DeleteMapping("/{id}")
	public void deleteDetailCart(@PathVariable("id") int detailCartId) {
		 dao.delete(dao.findById(detailCartId).get());
	}
}