package store.com.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import store.com.DAO.DetailCartDAO;
import store.com.DAO.ProductRepositoryDAO;
import store.com.Entity.DetailCart;
import store.com.Entity.ProductRepository;

@RestController
@RequestMapping("/rest/productrepository")
public class ProductRepositoryRestController {
	@Autowired
	ProductRepositoryDAO dao;

	@GetMapping
	public List<ProductRepository> getDetailCart() {
		return dao.findAll();
	}
	
//	@PutMapping
//	public DetailCart updateDetailCart(@RequestBody DetailCart detailCart) {
//		return dao.save(detailCart);
//	}
//	@DeleteMapping("/{id}")
//	public void deleteDetailCart(@PathVariable("id") int detailCartId) {
//		 dao.delete(dao.findById(detailCartId).get());
//	}
}
