package store.com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import store.com.Entity.AdditionalImages;
import store.com.Entity.Product;



public interface ProductDAO extends JpaRepository<Product, Integer>{
	@Query("SELECT p FROM Product p WHERE p.category.categoryid = ?1")
	List<Product> findByCategoryId(Integer integer);

	@Query("SELECT p FROM AdditionalImages p WHERE p.product.productid = ?1")
	List<AdditionalImages> findByImage(Integer integer);
	
	@Query("SELECT count(p.productid) FROM Product p")
    Integer getCount();
	
	//
//	@Query("SELECT count(p.productid) FROM Product p")
//    Integer getTotal();
}
