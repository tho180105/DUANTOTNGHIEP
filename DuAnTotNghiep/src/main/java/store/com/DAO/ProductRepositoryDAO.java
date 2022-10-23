package store.com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import store.com.Entity.ProductRepository;

public interface ProductRepositoryDAO extends JpaRepository<ProductRepository, Integer>{
    
}
