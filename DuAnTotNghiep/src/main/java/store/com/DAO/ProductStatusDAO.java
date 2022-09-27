package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.ProductStatus;

public interface ProductStatusDAO extends JpaRepository<ProductStatus, Integer>{

}
