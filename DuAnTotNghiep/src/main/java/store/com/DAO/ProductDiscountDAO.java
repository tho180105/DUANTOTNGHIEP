package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.ProductDiscount;

public interface ProductDiscountDAO extends JpaRepository<ProductDiscount, Integer>{

}
